package com.ciberdix.th.controllers;
import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Perfil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/perfiles")
public class perfilesController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/perfiles/";

    @RequestMapping(method = RequestMethod.GET)
    List<Perfil> consultarParametros() {
        RestTemplate restTemplate = new RestTemplate();
        Perfil[] parametros = restTemplate.getForObject(serviceUrl, Perfil[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Perfil crearParametro(@RequestBody Perfil request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Perfil.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarParametro(@RequestBody Perfil request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Perfil.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    Perfil verParametro(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        Perfil parametro = restTemplate.getForObject(serviceUrl + IdParametro, Perfil.class);
        return parametro;
    }
}