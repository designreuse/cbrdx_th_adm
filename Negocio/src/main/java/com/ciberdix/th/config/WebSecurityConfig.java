package com.ciberdix.th.config;

import com.ciberdix.th.controllers.UtilitiesController;
import com.ciberdix.th.model.Terceros;
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

    @Scheduled(cron = "0 0 0 * * ?")
    void changePersonStatus() {
        String serviceUrl = UtilitiesController.readParameter("domain.url");
        RestTemplate restTemplate = new RestTemplate();
        Terceros[] terceros = restTemplate.getForObject(serviceUrl, Terceros[].class);
        List<Terceros> tercerosHabilitados = Arrays.stream(terceros).filter(Terceros::getIndicadorHabilitado).collect(Collectors.toList());

    }
}
