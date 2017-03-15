package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.UsuarioPerfil;
import com.ciberdix.th.model.VUsuarioPerfil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/usuarioPerfiles")
public class usuarioPerfilesController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/usuarioPerfiles/";
    private String vserviceUrl = globales.getUrl() + "/usuarioPerfiles/vista";
    
//    private String serviceUrl = "http://localhost:8445/usuarioPerfiles/";
//    private String vserviceUrl = "http://localhost:8445/usuarioPerfiles/vista";

    @RequestMapping(method = RequestMethod.GET)
    List<UsuarioPerfil> consultarParametros() {
        RestTemplate restTemplate = new RestTemplate();
        UsuarioPerfil[] parametros = restTemplate.getForObject(serviceUrl, UsuarioPerfil[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/vista")
    List<VUsuarioPerfil> consultarVParametros() {
        RestTemplate restTemplate = new RestTemplate();
        VUsuarioPerfil[] parametros = restTemplate.getForObject(vserviceUrl, VUsuarioPerfil[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    UsuarioPerfil crearParametro(@RequestBody UsuarioPerfil request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, UsuarioPerfil.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarParametro(@RequestBody UsuarioPerfil request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, UsuarioPerfil.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    UsuarioPerfil verParametro(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        UsuarioPerfil parametro = restTemplate.getForObject(serviceUrl + IdParametro, UsuarioPerfil.class);
        return parametro;
    }
}