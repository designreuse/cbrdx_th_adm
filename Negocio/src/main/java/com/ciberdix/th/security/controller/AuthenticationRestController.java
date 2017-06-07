package com.ciberdix.th.security.controller;

import com.ciberdix.th.controllers.UtilitiesController;
import com.ciberdix.th.model.*;
import com.ciberdix.th.security.JwtAuthenticationRequest;
import com.ciberdix.th.security.JwtTokenUtil;
import com.ciberdix.th.security.JwtUser;
import com.ciberdix.th.security.configuration.LdapConfiguration;
import com.ciberdix.th.security.providers.SystemAuthenticationProvider;
import com.ciberdix.th.security.service.JwtAuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.mobile.device.Device;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
public class AuthenticationRestController {

    @Autowired
    UserDetailsService userDetailsService;
    private String tokenHeader = "Authorization";
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${recaptcha.url}")
    private String recaptchaUrl;

    @Value("${domain.url}")
    private String domainUrl;

    @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtAuthenticationRequest authenticationRequest, Device device) throws AuthenticationException {
        SystemAuthenticationProvider systemAuthenticationProvider = new SystemAuthenticationProvider();
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        final Authentication authentication = systemAuthenticationProvider.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticationRequest.getUsername(),
                        authenticationRequest.getPassword()
                )
        );
        if (authentication != null) {
            SecurityContextHolder.getContext().setAuthentication(authentication);
            if (!userDetails.getAuthorities().isEmpty()) {
                RestTemplate restTemplate = new RestTemplate();
                Usuarios user = restTemplate.getForObject(domainUrl + "/api/usuarios/queryUsername/" + authenticationRequest.getUsername() + "/", Usuarios.class);
                Terceros tercero = restTemplate.getForObject(domainUrl + "/api/terceros/" + user.getIdTercero() + "/", Terceros.class);
                final String token = jwtTokenUtil.generateToken(userDetails, user, tercero);
                return ResponseEntity.ok(new JwtAuthenticationResponse(token));
            } else {
                return ResponseEntity.ok(new JwtAuthenticationResponse(""));
            }
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @RequestMapping(value = "/auth/externalUser", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody JwtAuthenticationRequest authenticationRequest, Device device) throws AuthenticationException {
        RestTemplate restTemplate = new RestTemplate();
        Usuarios user = restTemplate.getForObject(domainUrl + "/api/usuarios/queryUsername/" + authenticationRequest.getUsername() + "/", Usuarios.class);
        if (user == null) {
            Usuarios usuarios = new Usuarios();
            usuarios.setCorreoElectronico(authenticationRequest.getUsername());
            usuarios.setUsuarioSistema(authenticationRequest.getUsername());
            usuarios.setUsuarioLdap(false);
            usuarios.setIndicadorHabilitado(true);
            if (authenticationRequest.getProvider().equals("facebook")) {
                usuarios.setFacebook(authenticationRequest.getProvider());
            } else if (authenticationRequest.getProvider().equals("google")) {
                usuarios.setGoogle(authenticationRequest.getProvider());
            } else if (authenticationRequest.getProvider().equals("linkein")) {
                usuarios.setLinkedin(authenticationRequest.getProvider());
            }
            user = restTemplate.postForObject(domainUrl + "/api/usuarios", usuarios, Usuarios.class);
            Roles roles = restTemplate.getForObject("/api/roles/rol/" + "ROLE_ADMINISTRADOR", Roles.class);
            UsuarioRoles request = new UsuarioRoles();
            request.setIdUsuario(user.getIdUsuario());
            request.setIdRol(roles.getIdRol());
            restTemplate.postForObject("/api/usuariosRoles/", request, UsuarioRoles.class);
            UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
            String token = jwtTokenUtil.generateToken(userDetails, user, new Terceros());
            return ResponseEntity.ok(new JwtAuthenticationResponse(token));
        } else {
            switch (authenticationRequest.getProvider()) {
                case "facebook":
                    if (user.getFacebook().equals(authenticationRequest.getPassword())) {
                        UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
                        String token = jwtTokenUtil.generateToken(userDetails, user, new Terceros());
                        return ResponseEntity.ok(new JwtAuthenticationResponse(token));
                    }
                    break;
                case "google":
                    if (user.getGoogle().equals(authenticationRequest.getPassword())) {
                        UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
                        String token = jwtTokenUtil.generateToken(userDetails, user, new Terceros());
                        return ResponseEntity.ok(new JwtAuthenticationResponse(token));
                    }
                    break;
                case "linkein":
                    if (user.getLinkedin().equals(authenticationRequest.getPassword())) {
                        UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
                        String token = jwtTokenUtil.generateToken(userDetails, user, new Terceros());
                        return ResponseEntity.ok(new JwtAuthenticationResponse(token));
                    }
                    break;
            }
        }
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/usuarioActivo")
    public JwtUser getAuthenticatedUser(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
        return user;
    }

    @RequestMapping(value = "/auth/refresh", method = RequestMethod.GET)
    public ResponseEntity<?> refreshAndGetAuthenticationToken(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        //JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
        final UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if (!userDetails.getAuthorities().isEmpty()) {
            RestTemplate restTemplate = new RestTemplate();
            Usuarios user = restTemplate.getForObject(domainUrl + "/api/usuarios/queryUsername/" + username + "/", Usuarios.class);
            Terceros tercero = restTemplate.getForObject(domainUrl + "/api/terceros/" + user.getIdTercero() + "/", Terceros.class);
            final String tokenNuevo = jwtTokenUtil.generateToken(userDetails, user, tercero);
            return ResponseEntity.ok(new JwtAuthenticationResponse(tokenNuevo));
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @RequestMapping(value = "/auth/rememberUser", method = RequestMethod.POST)
    public ResponseEntity<?> getUsername(@RequestBody CorreoElectronico correoElectronico) {
        RestTemplate restTemplate = new RestTemplate();
        List<Usuarios> parametros = Arrays.asList(restTemplate.getForObject(domainUrl + "/api/usuarios/", Usuarios[].class));
        for (Usuarios u : parametros) {
            if (u.getCorreoElectronico() != null && u.getCorreoElectronico().compareTo(correoElectronico.getCorreoElectronico()) == 0) {
                UtilitiesController.sendMail(u.getCorreoElectronico(), "Usuario de Ingreso", "<h1 style=\"font-size: 175%; line-height: 125%; margin-top: 0; margin-bottom: 20px;\">Recordar Usuario</h1><p style=\"margin-bottom: 80px;\">Su Usuario de Ingreso al Sistema es:" + u.getUsuarioSistema() + "</p>");
                break;
            }
        }
        return ResponseEntity.ok(true);
    }

    @RequestMapping(value = "/auth/reset", method = RequestMethod.POST)
    public ResponseEntity<?> getPassword(@RequestBody Contrasena contrasena) {
        RestTemplate restTemplate = new RestTemplate();
        List<Usuarios> parametros = Arrays.asList(restTemplate.getForObject(domainUrl + "/api/usuarios/", Usuarios[].class));
        for (Usuarios u : parametros) {
            if (u.getCorreoElectronico() != null && u.getCorreoElectronico().compareTo(contrasena.getCorreoElectronico()) == 0 && u.getUsuarioSistema().compareTo(contrasena.getUsuarioSistema()) == 0) {
                if (u.getUsuarioLdap()) {
                    LdapConfiguration ldapConfiguration = new LdapConfiguration();
                    UtilitiesController.sendMail(ldapConfiguration.getLdapc(), "Reinicio de Contraseña", "<h1 style=\"font-size: 175%; line-height: 125%; margin-top: 0; margin-bottom: 20px;\">Solicitud</h1><p style=\"margin-bottom: 80px;\">El usuario " + u.getUsuarioSistema() + " solicita el cambio de la contraseña de su usuario LDAP</p>");
                    return ResponseEntity.ok(false);
                } else {
                    String pass = UUID.randomUUID().toString().substring(0, 10);
                    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
                    String hashedPassword = bCryptPasswordEncoder.encode(pass);
                    u.setContrasena(hashedPassword);
                    UtilitiesController.sendMail(u.getCorreoElectronico(), "Gestionamos - Reinicio de Comtraseña", "<h1 style=\"font-size: 175%; line-height: 125%; margin-top: 0; margin-bottom: 20px;\">Cambio de Clave de Acceso</h1><p style=\"margin-bottom: 80px;\">Su nueva clave de acceso al sistema es:</p><h1 style=\"font-size: 175%; line-height: 125%; margin-top: 0; margin-bottom: 20px;\">" + pass + "</h1>");
                    restTemplate.put(domainUrl + "/api/usuarios/", u, Usuarios.class);
                    return ResponseEntity.ok(true);
                }
            }
        }
        return ResponseEntity.badRequest().build();
    }

    @RequestMapping(value = "/auth/captcha", method = RequestMethod.POST)
    public boolean validateCaptcha(@RequestBody String codigo) {
        RestTemplate restTemplate = new RestTemplate();
        RecaptchaResponse recaptchaResponse = new RecaptchaResponse();
        try {
            recaptchaResponse = restTemplate.postForEntity(recaptchaUrl, createBody("6LckLxkUAAAAAGf_9vx0BYTT7Q1fpk5X70BVDM6S", codigo), RecaptchaResponse.class).getBody();
        } catch (RestClientException ignored) {
        }
        return recaptchaResponse.isSuccess();
    }

    private MultiValueMap<String, String> createBody(String secret, String response) {
        MultiValueMap<String, String> form = new LinkedMultiValueMap<>();
        form.add("secret", secret);
        form.add("response", response);
        return form;
    }
}
