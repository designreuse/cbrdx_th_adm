package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Criterios;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/criterios")
@CrossOrigin
public class CriteriosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/criterios";

    @RequestMapping(method = RequestMethod.GET)
    List<Criterios> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Criterios[] parametros = restTemplate.getForObject(serviceUrl, Criterios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<Criterios> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        Criterios[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", Criterios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Criterios create(@RequestBody Criterios request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Criterios.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Criterios request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Criterios.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLista}")
    Criterios findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        Criterios parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idLista, Criterios.class);
        return parametro;
    }
}
