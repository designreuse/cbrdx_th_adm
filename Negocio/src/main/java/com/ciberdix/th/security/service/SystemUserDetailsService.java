package com.ciberdix.th.security.service;

import com.ciberdix.th.model.refactor.Usuarios;
import com.ciberdix.th.security.JwtUserFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SystemUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        RestTemplate restTemplate = new RestTemplate();
        Usuarios user = restTemplate.getForObject("http://localhost:8444/api/usuarios/queryUsername/" + username + "/", Usuarios.class);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No se encuentra el usuario '%s'.", username));
        } else {
            return JwtUserFactory.create(user);
        }
    }
}