package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Respuestas;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/respuestas")
public class RespuestasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/respuestas";

    @RequestMapping(method = RequestMethod.GET)
    List<Respuestas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Respuestas[] parametros = restTemplate.getForObject(serviceUrl, Respuestas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Respuestas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, Respuestas.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    Respuestas create(@RequestBody Respuestas obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, Respuestas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Respuestas obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
    
}