package com.ciberdix.th.security;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
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

        List<Menus> menus = Arrays.asList(restTemplate.getForObject(serviceUrl + "/api/menus/idPadreDifCero", Menus[].class));
        List<RolesFuncionalidades> rolesFuncionalidades = Arrays.asList(restTemplate.getForObject(serviceUrl + "/api/rolesFuncionalidades/enabled/", RolesFuncionalidades[].class));
        List<Funcionalidades> funcionalidades = Arrays.asList(restTemplate.getForObject(serviceUrl + "/api/funcionalidades/enabled/", Funcionalidades[].class));


        return new JwtUser(
                user.getIdUsuario(),
                user.getUsuarioSistema(),
                user.getCorreoElectronico(),
                user.getContrasena(),
                mapToGrantedAuthorities(Arrays.asList(usuarioRoles)),
                user.getIndicadorHabilitado(),
                user.getFechaInactivacion(),
                menus,
                pantallasAprobadas(rolesFuncionalidades, Arrays.asList(usuarioRoles), funcionalidades, menus)
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<VUsuarioRoles> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getRol()))
                .collect(Collectors.toList());
    }

    private static List<String> pantallasAprobadas(List<RolesFuncionalidades> rolesFuncionalidades, List<VUsuarioRoles> usuarioRoles, List<Funcionalidades> funcionalidades, List<Menus> menus) {
        List<String> pantallasAprobadas = new ArrayList<>();

        for (VUsuarioRoles r : usuarioRoles) {
            for (RolesFuncionalidades rf : rolesFuncionalidades) {
                if (r.getIdRol().equals(rf.getIdRol()) && rf.getIndicadorHabilitado()) {
                    for (Funcionalidades f : funcionalidades) {
                        if (rf.getIdFuncionalidad().equals(f.getIdFuncionalidad()) && f.getIndicadorHabilitado()) {
                            for (Menus m : menus) {
                                if (f.getIdMenu().equals(m.getIdMenu()))
                                    pantallasAprobadas.add(m.getRuta());
                            }
                        }
                    }
                }
            }
        }

        return pantallasAprobadas;
    }
}
