package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.InstitucionesMedicasEstructurasFisicas;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 16/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/institucionesMedicasEstructurasFisicas")
public class InstitucionesMedicasEstructurasFisicasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/institucionesMedicasEstructurasFisicas";

    @RequestMapping(method = RequestMethod.GET)
    List<InstitucionesMedicasEstructurasFisicas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        InstitucionesMedicasEstructurasFisicas[] parametros = restTemplate.getForObject(serviceUrl, InstitucionesMedicasEstructurasFisicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    InstitucionesMedicasEstructurasFisicas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, InstitucionesMedicasEstructurasFisicas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<InstitucionesMedicasEstructurasFisicas> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        InstitucionesMedicasEstructurasFisicas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", InstitucionesMedicasEstructurasFisicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    InstitucionesMedicasEstructurasFisicas create(@RequestBody InstitucionesMedicasEstructurasFisicas obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, InstitucionesMedicasEstructurasFisicas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody InstitucionesMedicasEstructurasFisicas obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
