package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.EstructuraFisica;
import com.ciberdix.th.model.VEstructuraFisica;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/estructuraFisica")
public class EstructuraFisicaRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/estructuraFisica";

    @RequestMapping(method = RequestMethod.GET)
    List<VEstructuraFisica> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraFisica[] parametros = restTemplate.getForObject(serviceUrl, VEstructuraFisica[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VEstructuraFisica findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VEstructuraFisica.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VEstructuraFisica> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraFisica[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VEstructuraFisica[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstructuraFisica create(@RequestBody EstructuraFisica obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, EstructuraFisica.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody EstructuraFisica obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
