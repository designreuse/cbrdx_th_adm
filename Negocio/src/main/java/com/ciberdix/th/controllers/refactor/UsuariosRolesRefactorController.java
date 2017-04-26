package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.UsuarioRoles;
import com.ciberdix.th.model.refactor.VUsuarioRoles;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 25/04/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/usuariosRoles")
public class UsuariosRolesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<UsuarioRoles> queryCenrtosCostos() {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosRoles/";
        UsuarioRoles[] parametros = restTemplate.getForObject(serviceUrl, UsuarioRoles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/vista/{idUsuario}")
    List<VUsuarioRoles> queryCenrtosCostos(@PathVariable Integer idUsuario) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosRoles/";
        VUsuarioRoles[] parametros = restTemplate.getForObject(serviceUrl + "vista/" + idUsuario, VUsuarioRoles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/secure/{idUsuario}")
    public List<UsuarioRoles> queryCentrosCostos(@PathVariable Integer idUsuario) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosRoles/";
        UsuarioRoles[] parametros = restTemplate.getForObject(serviceUrl + "secure/" + idUsuario, UsuarioRoles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/query/{idLista}")
    UsuarioRoles viewCentrosCostos(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosRoles/";
        return restTemplate.getForObject(serviceUrl + "query/" + idLista, UsuarioRoles.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    UsuarioRoles createCentrosCostos(@RequestBody UsuarioRoles request) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosRoles/";
        return restTemplate.postForObject(serviceUrl, request, UsuarioRoles.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateCentrosCostos(@RequestBody UsuarioRoles request) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosRoles/";
        restTemplate.put(serviceUrl, request, UsuarioRoles.class);
    }

}