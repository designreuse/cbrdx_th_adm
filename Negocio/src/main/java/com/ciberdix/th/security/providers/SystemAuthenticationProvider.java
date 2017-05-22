package com.ciberdix.th.security.providers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Usuarios;
import com.ciberdix.th.security.configuration.LdapConfiguration;
import com.ciberdix.th.security.service.SystemUserDetailsService;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;

public class SystemAuthenticationProvider implements AuthenticationProvider {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        SystemUserDetailsService systemUserDetailsService = new SystemUserDetailsService();
        LdapConfiguration ldapConfiguration = new LdapConfiguration();
        String username = authentication.getPrincipal().toString();
        String password = authentication.getCredentials().toString();
        UserDetails userDetails = systemUserDetailsService.loadUserByUsername(username);

        RestTemplate restTemplate = new RestTemplate();
        Usuarios user = restTemplate.getForObject(serviceUrl + "/api/usuarios/queryUsername/" + username + "/", Usuarios.class);
        if (user != null) {
            if (user.getUsuarioLdap() && ldapConfiguration.isLdapEnable()) {
                Hashtable env = new Hashtable();
                env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
                env.put(Context.PROVIDER_URL, ldapConfiguration.getUldap());
                env.put(Context.SECURITY_AUTHENTICATION, "simple");
                if (ldapConfiguration.isStartEnable()) {
                    env.put(Context.SECURITY_PRINCIPAL, ldapConfiguration.getLdaps() + username);
                }
                if (ldapConfiguration.isEndEnable()) {
                    env.put(Context.SECURITY_PRINCIPAL, username + ldapConfiguration.getLdape());
                }
                env.put(Context.SECURITY_CREDENTIALS, password);
                try {
                    DirContext ctx = new InitialDirContext(env);
                    ctx.close();
                    user.setContrasena(new BCryptPasswordEncoder(10).encode(password));
                    restTemplate.put(serviceUrl + "/api/usuarios/", user);
                    return authentication;
                } catch (NamingException e) {
                    return null;
                }
            } else {
                BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(10);
                if (bCryptPasswordEncoder.matches(password, user.getContrasena())) {
                    return authentication;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
