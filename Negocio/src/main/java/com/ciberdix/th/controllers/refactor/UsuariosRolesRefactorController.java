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
    List<UsuarioRoles> getLists() {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosRoles/";
        UsuarioRoles[] parametros = restTemplate.getForObject(serviceUrl, UsuarioRoles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/vista/{idUsuario}")
    List<VUsuarioRoles> getVUsu(@PathVariable Integer idUsuario) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosRoles/";
        VUsuarioRoles[] parametros = restTemplate.getForObject(serviceUrl + "vista/" + idUsuario, VUsuarioRoles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/secure/{idUsuario}")
    public List<VUsuarioRoles> getVUsuRolHabById(@PathVariable Integer idUsuario) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosRoles/";
        VUsuarioRoles[] parametros = restTemplate.getForObject(serviceUrl + "secure/" + idUsuario, VUsuarioRoles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VUsuarioRoles findOne(@PathVariable Integer id){
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosRoles/";
        return restTemplate.getForObject(serviceUrl + id, VUsuarioRoles.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/query/{idUsuarioRol}")
    UsuarioRoles findByIdUsuRol(@PathVariable Integer idUsuarioRol) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosRoles/";
        return restTemplate.getForObject(serviceUrl + "query/" + idUsuarioRol, UsuarioRoles.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    UsuarioRoles createList(@RequestBody UsuarioRoles request) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosRoles/";
        return restTemplate.postForObject(serviceUrl, request, UsuarioRoles.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateList(@RequestBody UsuarioRoles request) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosRoles/";
        restTemplate.put(serviceUrl, request, UsuarioRoles.class);
    }

}
