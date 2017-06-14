package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Adjuntos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 14/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/adjuntos")
public class AdjuntosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/adjuntos";

    @RequestMapping(method = RequestMethod.GET)
    List<Adjuntos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Adjuntos[] parametros = restTemplate.getForObject(serviceUrl, Adjuntos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Adjuntos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, Adjuntos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    Adjuntos create(@RequestBody Adjuntos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, Adjuntos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Adjuntos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
