package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.PerfilMenu;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/perfilesMenu")
public class perfilesMenuController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/perfilesMenu/";

    @RequestMapping(method = RequestMethod.GET)
    List<PerfilMenu> consultarParametros() {
        RestTemplate restTemplate = new RestTemplate();
        PerfilMenu[] parametros = restTemplate.getForObject(serviceUrl, PerfilMenu[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    PerfilMenu crearParametro(@RequestBody PerfilMenu request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, PerfilMenu.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarParametro(@RequestBody PerfilMenu request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, PerfilMenu.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    PerfilMenu verParametro(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        PerfilMenu parametro = restTemplate.getForObject(serviceUrl + IdParametro, PerfilMenu.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/perfil/{idFormulario}")
    List<PerfilMenu> getFormElements(@PathVariable Integer idFormulario) {
        RestTemplate restTemplate = new RestTemplate();
        PerfilMenu[] parametro = restTemplate.getForObject(serviceUrl + "/perfil/" + idFormulario, PerfilMenu[].class);
        return Arrays.asList(parametro);
    }
}