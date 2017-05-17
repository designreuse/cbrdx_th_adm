package com.ciberdix.th.security.controller;

import com.ciberdix.th.model.*;
import com.ciberdix.th.security.JwtAuthenticationRequest;
import com.ciberdix.th.security.JwtTokenUtil;
import com.ciberdix.th.security.JwtUser;
import com.ciberdix.th.security.configuration.LdapConfiguration;
import com.ciberdix.th.security.providers.SystemAuthenticationProvider;
import com.ciberdix.th.security.service.JwtAuthenticationResponse;
import com.microtripit.mandrillapp.lutung.MandrillApi;
import com.microtripit.mandrillapp.lutung.model.MandrillApiError;
import com.microtripit.mandrillapp.lutung.view.MandrillMessage;
import com.microtripit.mandrillapp.lutung.view.MandrillMessageStatus;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
public class AuthenticationRestController {

    private String tokenHeader = "Authorization";

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    UserDetailsService userDetailsService;

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
                return ResponseEntity.badRequest().build();
            }
        } else {
            return ResponseEntity.badRequest().build();
        }
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

        //if (jwtTokenUtil.canTokenBeRefreshed(token, user.getLastPasswordResetDate())) {
            //String refreshedToken = jwtTokenUtil.refreshToken(token);
            //return ResponseEntity.ok(new JwtAuthenticationResponse(refreshedToken));
        //} else {
            //return ResponseEntity.badRequest().body(null);
        //}
    }

    @RequestMapping(value = "/auth/rememberUser", method = RequestMethod.POST)
    public ResponseEntity<?> getUsername(@RequestBody CorreoElectronico correoElectronico) {
        RestTemplate restTemplate = new RestTemplate();
        List<Usuarios> parametros = Arrays.asList(restTemplate.getForObject(domainUrl +"/api/usuarios/", Usuarios[].class));
        for (Usuarios u : parametros) {
            if (u.getCorreoElectronico() != null && u.getCorreoElectronico().compareTo(correoElectronico.getCorreoElectronico()) == 0) {
                processMailInfo(u, "Usuario de Ingreso", "<h1 style=\"font-size: 175%; line-height: 125%; margin-top: 0; margin-bottom: 20px;\">Recordar Usuario</h1><p style=\"margin-bottom: 80px;\">Su Usuario de Ingreso al Sistema es:" + u.getUsuarioSistema() + "</p>");
                break;
            }
        }
        return ResponseEntity.ok(true);
    }

    @RequestMapping(value = "/auth/reset", method = RequestMethod.POST)
    public ResponseEntity<?> getPassword(@RequestBody Contrasena contrasena) {
        RestTemplate restTemplate = new RestTemplate();
        List<Usuarios> parametros = Arrays.asList(restTemplate.getForObject(domainUrl +"/api/usuarios/", Usuarios[].class));
        for (Usuarios u : parametros) {
            if (u.getCorreoElectronico() != null && u.getCorreoElectronico().compareTo(contrasena.getCorreoElectronico()) == 0 && u.getUsuarioSistema().compareTo(contrasena.getUsuarioSistema()) == 0) {
                if (u.getUsuarioLdap()) {
                    processMailInfo("Reinicio de Contraseña", "<h1 style=\"font-size: 175%; line-height: 125%; margin-top: 0; margin-bottom: 20px;\">Solicitud</h1><p style=\"margin-bottom: 80px;\">El usuario " + u.getUsuarioSistema() + " solicita el cambio de la contraseña de su usuario LDAP</p>");
                    return ResponseEntity.ok(false);
                } else {
                    String pass = UUID.randomUUID().toString().substring(0, 10);
                    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
                    String hashedPassword = bCryptPasswordEncoder.encode(pass);
                    u.setContrasena(hashedPassword);
                    processMailInfo(u, "Reinicio de Contraseña", "<h1 style=\"font-size: 175%; line-height: 125%; margin-top: 0; margin-bottom: 20px;\">Cambio de Clave de Acceso</h1><p style=\"margin-bottom: 80px;\">Su nueva clave de acceso al sistema es:</p><h1 style=\"font-size: 175%; line-height: 125%; margin-top: 0; margin-bottom: 20px;\">" + pass + "</h1>");
                    restTemplate.put(domainUrl +"/api/usuarios/", u, Usuarios.class);
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

    public Usuarios processMailInfo(Usuarios usuario, String Subject, String Body) {
        MandrillApi mandrillApi = new MandrillApi("X-Siym7IlILYF2O2H1w_TQ");
        MandrillMessage message = new MandrillMessage();
        message.setSubject(Subject);
        message.setHtml("<html>" +
                "    <body bgcolor=\"##B4E3F3\" style=\"font-family: arial, sans-serif; font-size: 100%; line-height: 160%; background-color: #ecf0f1; margin: 0; padding: 0; border: 0;\">\n" +
                "        <table bgcolor=\"#ecf0f1\" style=\"width: 100%; background-color: #ecf0f1; font-size: 14px;\" align=\"center\" cellpadding=\"20\" cellspacing=\"0\" border=\"0\">\n" +
                "            <tr>\n" +
                "                <td>\n" +
                "                    <table align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 100%; max-width: 700px;\">\n" +
                "                        <tr>\n" +
                "                            <td align=\"center\"><img style=\"width: 350px; margin-top: -20px;\" src=\"http://www.ciberdix.com/proyecto/gestionamos/img/logo_gestionamos.png\" alt=\"Gestionamos\"></td>\n" +
                "\n" +
                "                        </tr>\n" +
                "                    </table>\n" +
                "                    <table align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" bgcolor=\"#ffffff\" style=\"width: 100%; max-width: 700px; background-color: #ffffff; -webkit-border-radius: 4px; border-radius: 4px;\">\n" +
                "                        <tr>\n" +
                "                            <td>\n" +
                "                                <div style=\"position: relative; padding: 25px;\">\n" + Body +
                "                                    <hr><p style=\"margin-bottom: 10px;\">Cualquier duda comun&iacute;quese con nosotros a nuestra línea de atención: <strong>320 889 9800</strong>\n" +
                "                                      o escríbanos un correo electrónico a: <strong>servicioalcliente@crezcamos.com</strong>.</p>\n" +
                "                                </div>\n" +
                "                                <div>\n" +
                "                                    <a href=\"http://www.ciberdix.com\" style=\"display: block; background-color: #00632e; color: #ffffff; font-weight: bold; padding: 20px; text-decoration: none; text-align: center;-webkit-border-bottom-right-radius: 4px; -webkit-border-bottom-left-radius: 4px; border-bottom-right-radius: 4px; border-bottom-left-radius: 4px;\">\n" +
                "                                        <span style=\"color: #ffffff;\">2017 &copy; Gestionamos. Un producto de Ciberdix & Crezcamos - Todos los derechos reservados</span>\n" +
                "                                    </a>\n" +
                "                                </div>\n" +
                "                            </td>\n" +
                "                        </tr>\n" +
                "                    </table>\n" +
                "                    <table align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 100%; text-align: center; font-size: 90%; padding-top: 5px; color: #bdc3c7; max-width: 700px;\">\n" +
                "                        <tr>\n" +
                "                            <td>\n" +
                "                              <p style=\"line-height: initial;\">\n" +
                "                              En cumplimiento con lo establecido en la Ley 1581 de 2012 y en el Decreto 1377 de 2013, <a href=\"http://www.crezcamos.com\" style=\"color: #bdc3c7;\"><span style=\"color: #bdc3c7;\">Crezcamos.com</span></a> tiene el gusto de manifestarle que hemos establecido unas políticas institucionales para el tratamiento de datos personales, siguiendo los lineamientos legales y reglamentarios.\n" +
                "</p></td></tr></table></td></tr></table></body></html>");
        message.setAutoText(true);
        message.setFromEmail("info@ciberdix.com");
        message.setFromName("Gestionamos");
        ArrayList<MandrillMessage.Recipient> recipients = new ArrayList<>();
        MandrillMessage.Recipient recipient = new MandrillMessage.Recipient();
        recipient.setEmail(usuario.getCorreoElectronico());
        recipient.setName(usuario.getUsuarioSistema());
        recipients.add(recipient);
        message.setTo(recipients);
        message.setPreserveRecipients(true);
        try {
            MandrillMessageStatus[] messageStatusReports = mandrillApi.messages().send(message, false);
        } catch (MandrillApiError mandrillApiError) {
            mandrillApiError.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    public void processMailInfo(String Subject, String Body) {
        LdapConfiguration ldapConfiguration = new LdapConfiguration();
        MandrillApi mandrillApi = new MandrillApi("X-Siym7IlILYF2O2H1w_TQ");
        MandrillMessage message = new MandrillMessage();
        message.setSubject(Subject);
        message.setHtml("<html><body bgcolor=\"##B4E3F3\" style=\"font-family: arial, sans-serif; font-size: 100%; line-height: 160%; background-color: #ecf0f1; margin: 0; padding: 0; border: 0;\">\n" +
                "        <table bgcolor=\"#ecf0f1\" style=\"width: 100%; background-color: #ecf0f1; font-size: 14px;\" align=\"center\" cellpadding=\"20\" cellspacing=\"0\" border=\"0\">\n" +
                "            <tr>\n" +
                "                <td>\n" +
                "                    <table align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 100%; max-width: 700px;\">\n" +
                "                        <tr>\n" +
                "                            <td align=\"center\"><img style=\"width: 350px; margin-top: -20px;\" src=\"http://www.ciberdix.com/proyecto/gestionamos/img/logo_gestionamos.png\" alt=\"Gestionamos\"></td>\n" +
                "\n" +
                "                        </tr>\n" +
                "                    </table>\n" +
                "                    <table align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" bgcolor=\"#ffffff\" style=\"width: 100%; max-width: 700px; background-color: #ffffff; -webkit-border-radius: 4px; border-radius: 4px;\">\n" +
                "                        <tr>\n" +
                "                            <td>\n" +
                "                                <div style=\"position: relative; padding: 25px;\">\n" +
                "                                    <p style=\"margin-bottom: 80px;\">\n" +
                "                                        " + Body + "\n" +
                "                                    </p>\n" +
                "                                    <hr><p style=\"margin-bottom: 10px;\">Cualquier duda comun&iacute;quese con nosotros a nuestra línea de atención: <strong>320 889 9800</strong>\n" +
                "                                      o escríbanos un correo electrónico a: <strong>servicioalcliente@crezcamos.com</strong>.</p>\n" +
                "                                </div>\n" +
                "                                <div>\n" +
                "                                    <a href=\"http://www.ciberdix.com\" style=\"display: block; background-color: #00632e; color: #ffffff; font-weight: bold; padding: 20px; text-decoration: none; text-align: center;-webkit-border-bottom-right-radius: 4px; -webkit-border-bottom-left-radius: 4px; border-bottom-right-radius: 4px; border-bottom-left-radius: 4px;\">\n" +
                "                                        <span style=\"color: #ffffff;\">2017 &copy; Gestionamos. Un producto de Ciberdix & Crezcamos - Todos los derechos reservados</span>\n" +
                "                                    </a>\n" +
                "                                </div>\n" +
                "                            </td>\n" +
                "                        </tr>\n" +
                "                    </table>\n" +
                "                    <table align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 100%; text-align: center; font-size: 90%; padding-top: 5px; color: #bdc3c7; max-width: 700px;\">\n" +
                "                        <tr>\n" +
                "                            <td>\n" +
                "                              <p style=\"line-height: initial;\">\n" +
                "                              En cumplimiento con lo establecido en la Ley 1581 de 2012 y en el Decreto 1377 de 2013, <a href=\"http://www.crezcamos.com\" style=\"color: #bdc3c7;\"><span style=\"color: #bdc3c7;\">Crezcamos.com</span></a> tiene el gusto de manifestarle que hemos establecido unas políticas institucionales para el tratamiento de datos personales, siguiendo los lineamientos legales y reglamentarios.\n" +
                "</p></td></tr></table></td></tr></table></body></html>");
        message.setAutoText(true);
        message.setFromEmail("info@ciberdix.com");
        message.setFromName("Gestionamos");
        ArrayList<MandrillMessage.Recipient> recipients = new ArrayList<>();
        MandrillMessage.Recipient recipient = new MandrillMessage.Recipient();
        recipient.setEmail(ldapConfiguration.getLdapc());
        recipient.setName("Administrador Sistema");
        recipients.add(recipient);
        message.setTo(recipients);
        message.setPreserveRecipients(true);
        try {
            MandrillMessageStatus[] messageStatusReports = mandrillApi.messages().send(message, false);
        } catch (MandrillApiError mandrillApiError) {
            mandrillApiError.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
