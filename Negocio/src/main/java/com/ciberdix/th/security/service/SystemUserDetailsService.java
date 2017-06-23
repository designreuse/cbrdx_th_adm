package com.ciberdix.th.security.service;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Usuarios;
import com.ciberdix.th.security.JwtUserFactory;
import com.ciberdix.th.security.UserDetailsCustom;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SystemUserDetailsService implements CustomUserDetails {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @Override
    public UserDetailsCustom loadUserByUsername(String username) throws UsernameNotFoundException {
        RestTemplate restTemplate = new RestTemplate();
        Usuarios user = restTemplate.getForObject(serviceUrl + "/api/usuarios/queryUsername/" + username + "/", Usuarios.class);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No se encuentra el usuario '%s'.", username));
        } else {
            return JwtUserFactory.create(user);
        }
    }

    @Override
    public UserDetailsCustom loadUserByIdUsername(Integer username) throws UsernameNotFoundException {
        RestTemplate restTemplate = new RestTemplate();
        Usuarios user = restTemplate.getForObject(serviceUrl + "/api/usuarios/query/" + username + "/", Usuarios.class);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No se encuentra el usuario '%s'.", username));
        } else {
            return JwtUserFactory.create(user);
        }
    }
}
