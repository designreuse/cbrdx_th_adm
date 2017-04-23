package com.ciberdix.th.security;

import com.ciberdix.th.model.refactor.Usuarios;
import com.ciberdix.th.model.refactor.VUsuarioRoles;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(Usuarios user) {

        RestTemplate restTemplate = new RestTemplate();
        VUsuarioRoles[] usuarioRoles = restTemplate.getForObject("http://localhost:8444/api/usuariosRoles/secure/" + user.getIdUsuario(), VUsuarioRoles[].class);

        return new JwtUser(
                user.getIdUsuario(),
                user.getUsuarioSistema(),
                user.getCorreoElectronico(),
                user.getContrasena(),
                mapToGrantedAuthorities(Arrays.asList(usuarioRoles)),
                user.getIndicadorHabilitado(),
                user.getFechaInactivacion()
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<VUsuarioRoles> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getRol()))
                .collect(Collectors.toList());
    }
}
