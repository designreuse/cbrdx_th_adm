package com.ciberdix.th.security;

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

    private JwtUserFactory() {
    }

    public static JwtUser create(Usuarios user) {

        List<VPolicyRules> rolesFuncionalidades = new ArrayList<>();
        RestTemplate restTemplate = new RestTemplate();
        VUsuarioRoles[] usuarioRoles = restTemplate.getForObject("http://localhost:8444/api/usuariosRoles/secure/" + user.getIdUsuario(), VUsuarioRoles[].class);

        for (VUsuarioRoles ur: usuarioRoles){
            VPolicyRules[] funcionalidades = restTemplate.getForObject("http://localhost:8444/api/policyRules/" + ur.getRol(), VPolicyRules[].class);

            for(VPolicyRules pr: funcionalidades){
                rolesFuncionalidades.add(pr);
            }
        }

        return new JwtUser(
                user.getIdUsuario(),
                user.getUsuarioSistema(),
                user.getCorreoElectronico(),
                user.getContrasena(),
                mapToGrantedAuthorities(Arrays.asList(usuarioRoles)),
                user.getIndicadorHabilitado(),
                user.getFechaInactivacion(),
                mapToFuncionalidades(rolesFuncionalidades)
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<VUsuarioRoles> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getRol()))
                .collect(Collectors.toList());
    }

    private static List<String> mapToFuncionalidades(List<VPolicyRules> reglas){
        return reglas.stream()
                .map(rules -> rules.getIdFuncionalidad().toString())
                .collect(Collectors.toList());
    }
}
