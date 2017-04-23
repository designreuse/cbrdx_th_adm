package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.Usuarios;
import com.ciberdix.th.model.refactor.VUsuarios;
import com.ciberdix.th.model.refactor.VHistoricoUsuarios;
import com.microtripit.mandrillapp.lutung.MandrillApi;
import com.microtripit.mandrillapp.lutung.model.MandrillApiError;
import com.microtripit.mandrillapp.lutung.view.MandrillMessage;
import com.microtripit.mandrillapp.lutung.view.MandrillMessageStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
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

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<Usuarios> findAll() {
        String serviceUrl = baseUrl + "/api/usuarios/";
        RestTemplate restTemplate = new RestTemplate();
        Usuarios[] usuarios = restTemplate.getForObject(serviceUrl, Usuarios[].class);
        return Arrays.asList(usuarios);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/vista/")
    List<VUsuarios> queryCentrosCostos() {
        String serviceUrl = baseUrl + "/api/vista/";
        RestTemplate restTemplate = new RestTemplate();
        VUsuarios[] parametros = restTemplate.getForObject(serviceUrl, VUsuarios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/auditoria/{objeto}/{idObjeto}")
    List<VHistoricoUsuarios> queryCentrosCostos(@PathVariable String objeto, @PathVariable Long idObjeto) {
        String serviceUrl = baseUrl + "/api/auditoria/";
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
            usuario = processMailInfo(usuario);
        }
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, usuario, Usuarios.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateUsuario(@RequestBody Usuarios request) {
        String serviceUrl = baseUrl + "/api/usuarios/";
        System.out.println(request.getContrasena());
        if (!request.getUsuarioLdap() && request.getContrasena() == null) {
            request = processMailInfo(request);
        }
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Usuarios.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Usuarios usuarios) {
        String serviceUrl = baseUrl + "/api/usuarios";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, usuarios);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/cambiarPass/{oldPass}/{newPass}")
    void queryAllByCambiarPass(@RequestBody Usuarios obj, @PathVariable String oldPass, @PathVariable String newPass) {
        String serviceUrl = baseUrl + "/api/usuarios";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/cambiarPass/" + oldPass + "/" + newPass, obj);
    }

    private Usuarios processMailInfo(Usuarios usuario) {
        String pass = UUID.randomUUID().toString().substring(0, 10);
        MandrillApi mandrillApi = new MandrillApi("X-Siym7IlILYF2O2H1w_TQ");
        MandrillMessage message = new MandrillMessage();
        message.setSubject("Su Contraseña");
        message.setHtml("<h1>Hola!</h1><br />Su nueva Contraseña es: " + pass);
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(10);
        String hashedPassword = bCryptPasswordEncoder.encode(pass);
        usuario.setContrasena(hashedPassword);
        message.setAutoText(true);
        message.setFromEmail("info@ciberdix.com");
        message.setFromName("Gestionemos");
        ArrayList<MandrillMessage.Recipient> recipients = new ArrayList<>();
        MandrillMessage.Recipient recipient = new MandrillMessage.Recipient();
        recipient.setEmail(usuario.getCorreoElectronico());
        recipient.setName(usuario.getUsuarioSistema());
        recipients.add(recipient);
        message.setTo(recipients);
        message.setPreserveRecipients(true);
        try {
            MandrillMessageStatus[] messageStatusReports = mandrillApi.messages().send(message,false);
        } catch (MandrillApiError mandrillApiError) {
            mandrillApiError.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usuario;
    }
}
