package com.ciberdix.th.controllers;

import com.ciberdix.th.model.UsuarioRol;
import com.ciberdix.th.model.VUsuarioRol;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/usuarioRoles")
public class usuarioRolesController {

    private String serviceUrl = "http://localhost:8445/usuarioRoles/";
    private String vserviceUrl = "http://localhost:8445/usuarioRoles/";

    @RequestMapping(method = RequestMethod.GET)
    List<UsuarioRol> consultarParametros() {
        RestTemplate restTemplate = new RestTemplate();
        UsuarioRol[] parametros = restTemplate.getForObject(serviceUrl, UsuarioRol[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/vista")
    List<VUsuarioRol> consultarVParametros() {
        RestTemplate restTemplate = new RestTemplate();
        VUsuarioRol[] parametros = restTemplate.getForObject(serviceUrl, VUsuarioRol[].class);
        return Arrays.asList(parametros);
    }


    @RequestMapping(method = RequestMethod.POST)
    UsuarioRol crearParametro(@RequestBody UsuarioRol request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, UsuarioRol.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarParametro(@RequestBody UsuarioRol request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, UsuarioRol.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    UsuarioRol verParametro(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        UsuarioRol parametro = restTemplate.getForObject(serviceUrl + IdParametro, UsuarioRol.class);
        return parametro;
    }
}