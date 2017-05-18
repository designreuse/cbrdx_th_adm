package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Usuarios;
import com.ciberdix.th.model.VHistoricoUsuarios;
import com.ciberdix.th.model.VUsuarios;
import com.ciberdix.th.security.providers.SystemAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Created by Danny on 21/04/2017.
 */

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin
public class UsuariosRefactorController {

    private final static int NEW_USER = 1;
    private final static int CHANGE_PASSWORD = 2;

    @Value("${domain.url}")
    private String baseUrl;

    @Autowired
    UserDetailsService userDetailsService;

    @RequestMapping(method = RequestMethod.GET)
    List<Usuarios> findAll() {
        String serviceUrl = baseUrl + "/api/usuarios/";
        RestTemplate restTemplate = new RestTemplate();
        Usuarios[] usuarios = restTemplate.getForObject(serviceUrl, Usuarios[].class);
        return Arrays.asList(usuarios);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/vista/")
    List<VUsuarios> queryCentrosCostos() {
        String serviceUrl = baseUrl + "/api/usuarios/vista/";
        RestTemplate restTemplate = new RestTemplate();
        VUsuarios[] parametros = restTemplate.getForObject(serviceUrl, VUsuarios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/auditoria/{objeto}/{idObjeto}")
    List<VHistoricoUsuarios> queryCentrosCostos(@PathVariable String objeto, @PathVariable Long idObjeto) {
        String serviceUrl = baseUrl + "/api/usuarios/auditoria/";
        RestTemplate restTemplate = new RestTemplate();
        VHistoricoUsuarios[] parametros = restTemplate.getForObject(serviceUrl + objeto + "/" + idObjeto, VHistoricoUsuarios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/query/{IdParametro}")
    Usuarios findOne(@PathVariable Integer IdParametro) {
        String serviceUrl = baseUrl + "/api/usuarios/query/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + IdParametro, Usuarios.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    Usuarios create(@RequestBody Usuarios usuario) {
        String serviceUrl = baseUrl + "/api/usuarios/";
        if (!usuario.getUsuarioLdap()) {
            usuario = sendMailUser(usuario, NEW_USER);
        }
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, usuario, Usuarios.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateUsuario(@RequestBody Usuarios request) {
        String serviceUrl = baseUrl + "/api/usuarios/";
        if (!request.getUsuarioLdap() && request.getContrasena() == null) {
            request = sendMailUser(request, CHANGE_PASSWORD);
        }
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Usuarios.class);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/cambiarPass/{oldPass}/")
    Boolean updatePass(@RequestBody Usuarios obj, @PathVariable String oldPass) {
        String serviceUrl = baseUrl + "/api/usuarios";
        RestTemplate restTemplate = new RestTemplate();

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        obj.setContrasena(bCryptPasswordEncoder.encode(obj.getContrasena()));

        SystemAuthenticationProvider systemAuthenticationProvider = new SystemAuthenticationProvider();
        final UserDetails userDetails = userDetailsService.loadUserByUsername(obj.getUsuarioSistema());
        final Authentication authentication = systemAuthenticationProvider.authenticate(
                new UsernamePasswordAuthenticationToken(
                        obj.getUsuarioSistema(),
                        oldPass
                )
        );
        if (authentication != null) {
            restTemplate.put(serviceUrl + "/cambiarPass", obj);
            return true;
        } else {
            return false;
        }
    }

    private Usuarios sendMailUser(Usuarios usuario, Integer tipo) {
        String pass = UUID.randomUUID().toString().substring(0, 10);
        switch (tipo) {
            case 1: {
                UtilitiesController.sendMail(usuario.getCorreoElectronico(), "Gestionamos - Bienvenida", "<h1>Bienvenido!</h1><br/><p>Se ha registrado en Gestionamos<br/><br/>Su usuario de acceso al Sistema es: <h2>" + usuario.getUsuarioSistema() + "</h2><br/>Su contraseña es: <h2>" + pass + "</h2></p>");
                break;
            }
            case 2: {
                UtilitiesController.sendMail(usuario.getCorreoElectronico(), "Gestionamos - Cambio de Contraseña", "<h1>Cambio de Contraseña</h1><br/><p>De acuerdo a su solicitud se ha realizado el restablecimiento de Contraseña<br/><br/>Su usuario de Acceso es: <h2>" + usuario.getUsuarioSistema() + "</h2><br/>Su nueva contraseña de acceso es: <h2>" + pass + "</h2><br/></p>");
                break;
            }
        }
        usuario.setContrasena(UtilitiesController.passwordHash(pass));
        return usuario;
    }
}
