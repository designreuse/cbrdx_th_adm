package com.ciberdix.th.security;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.*;
import com.ciberdix.th.security.abac.policy.model.VPolicyRules;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {

    static Globales globales = new Globales();
    private static String serviceUrl = globales.getUrl();

    private JwtUserFactory() {
    }

    public static JwtUser create(Usuarios user) {
        RestTemplate restTemplate = new RestTemplate();
        VUsuarioRoles[] usuarioRoles = restTemplate.getForObject(serviceUrl + "/api/usuariosRoles/secure/" + user.getIdUsuario(), VUsuarioRoles[].class);

        List<Menus> menus = Arrays.asList(restTemplate.getForObject(serviceUrl + "/api/menus", Menus[].class));

        return new JwtUser(
                user.getIdUsuario(),
                user.getUsuarioSistema(),
                user.getCorreoElectronico(),
                user.getContrasena(),
                mapToGrantedAuthorities(Arrays.asList(usuarioRoles)),
                user.getIndicadorHabilitado(),
                user.getFechaInactivacion(),
                menus
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<VUsuarioRoles> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getRol()))
                .collect(Collectors.toList());
    }
}
