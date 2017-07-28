package com.ciberdix.th.config;

import com.ciberdix.th.controllers.UtilitiesController;
import com.ciberdix.th.model.Novedades;
import com.ciberdix.th.model.Terceros;
import com.ciberdix.th.model.TercerosNovedades;
import com.ciberdix.th.security.JwtAuthenticationEntryPoint;
import com.ciberdix.th.security.JwtAuthenticationTokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableScheduling
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private JwtAuthenticationEntryPoint unauthorizedHandler;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder
                .userDetailsService(this.userDetailsService)
                .passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtAuthenticationTokenFilter authenticationTokenFilterBean() throws Exception {
        return new JwtAuthenticationTokenFilter();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf().disable()
                .cors().and()
                .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .authorizeRequests()
                .antMatchers("/**").permitAll()
                //.antMatchers("/auth/**").permitAll()
                //.antMatchers("/swagger-ui.html").permitAll()
                //.antMatchers("/webjars/**").permitAll()
                //.antMatchers("/swagger-resources/**").permitAll()
                //.antMatchers("/v2/**").permitAll()
                .antMatchers("/api/requerimientos/externaMixta").permitAll()
                .antMatchers("/api/constantes/codigos").permitAll()
                .antMatchers("/api/divisionPolitica/divisionPublicacion").permitAll()
                .antMatchers("/api/requerimientos/divisionPolitica/{idDivisionPublicacion}").permitAll()
                .anyRequest().authenticated();

        httpSecurity.addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);
        httpSecurity.headers().frameOptions().disable();
        httpSecurity.headers().cacheControl();
    }

    @Scheduled(cron = "0 0 23 50 * ?")
    void changePersonStatus() {
        String serviceUrl = UtilitiesController.readParameter("domain.url");
        RestTemplate restTemplate = new RestTemplate();
        Integer IdSolicitado = UtilitiesController.findListItem("ListasEstadosNovedades", "SOLICI").getIdLista();
        Integer IdTramitado = UtilitiesController.findListItem("ListasEstadosNovedades", "TRAMIT").getIdLista();
        Integer IdActivo = UtilitiesController.findListItem("ListasEstadosTerceros", "ACTIVO").getIdLista();
        Terceros[] terceros = restTemplate.getForObject(serviceUrl + "/api/terceros", Terceros[].class);
        List<Novedades> novedadesSistema = Arrays.stream(restTemplate.getForObject(serviceUrl + "/api/novedades", Novedades[].class)).filter(t -> t.getIndicadorHabilitado() && t.getIdEstadoTercero() != null).collect(Collectors.toList());
        List<Terceros> tercerosHabilitados = Arrays.stream(terceros).filter(t -> t.getIndicadorHabilitado() && t.getIdEstadoTercero().equals(IdActivo)).collect(Collectors.toList());
        List<Terceros> tercerosInhabilitados = Arrays.stream(terceros).filter(t -> t.getIndicadorHabilitado() && !t.getIdEstadoTercero().equals(IdActivo)).collect(Collectors.toList());
        TercerosNovedades[] novedades = restTemplate.getForObject(serviceUrl + "/api/tercerosNovedades", TercerosNovedades[].class);
        Date currentDate = new Date(System.currentTimeMillis());
        List<TercerosNovedades> novedadesList = Arrays.stream(novedades).filter(t ->
                (t.getFechaInicio() != null && t.getFechaInicio().compareTo(currentDate) == 0 && t.getIdEstadoNovedad().equals(IdTramitado))
                        || (t.getIdEstadoNovedad().equals(IdSolicitado) && t.getFechaReporte().compareTo(currentDate) == 0 && t.getFechaInicio().compareTo(t.getFechaReporte()) < 0)).collect(Collectors.toList());
        List<Terceros> tercerosList = tercerosHabilitados.stream().filter(t -> novedadesList.stream().anyMatch(f -> f.getIdTercero().equals(t.getIdTercero()))).collect(Collectors.toList());
        for (Terceros ter : tercerosList) {
            List<TercerosNovedades> novedadesAfecta = novedadesList.stream().filter(t -> t.getIdTercero().equals(ter.getIdTercero()) && novedadesSistema.stream().anyMatch(f -> t.getIdNovedad().equals(f.getIdNovedad()))).collect(Collectors.toList());
            if (!novedadesAfecta.isEmpty()) {
                novedadesAfecta.sort(Comparator.comparing(TercerosNovedades::getFechaReporte));
                TercerosNovedades apply = novedadesAfecta.get(novedadesAfecta.size() - 1);
                Novedades novedad = restTemplate.getForObject(serviceUrl + "/api/novedades/" + apply.getIdNovedad(), Novedades.class);
                ter.setIdEstadoTercero(novedad.getIdEstadoTercero());
                restTemplate.put(serviceUrl + "/api/terceros", ter);
            }
        }
        List<TercerosNovedades> novedadesListing = Arrays.stream(novedades).filter(t -> t.getFechaFin() != null && t.getFechaFin().compareTo(currentDate) == 0 && t.getIdEstadoNovedad().equals(IdTramitado)).collect(Collectors.toList());
        List<Terceros> tercerosListing = tercerosInhabilitados.stream().filter(t -> novedadesListing.stream().anyMatch(f -> f.getIdTercero().equals(t.getIdTercero()))).collect(Collectors.toList());
        for (Terceros ter : tercerosListing) {
            List<TercerosNovedades> novedadesAfecta = novedadesListing.stream().filter(t -> t.getIdTercero().equals(ter.getIdTercero()) && novedadesSistema.stream().anyMatch(f -> t.getIdNovedad().equals(f.getIdNovedad()))).collect(Collectors.toList());
            if (!novedadesAfecta.isEmpty()) {
                ter.setIdEstadoTercero(IdActivo);
                restTemplate.put(serviceUrl + "/api/terceros", ter);
            }
        }
    }
}
