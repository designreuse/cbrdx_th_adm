package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.InstitucionesMedicas;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 16/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/institucionesMedicas")
public class InstitucionesMedicasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/institucionesMedicas";

    @RequestMapping(method = RequestMethod.GET)
    List<InstitucionesMedicas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        InstitucionesMedicas[] parametros = restTemplate.getForObject(serviceUrl, InstitucionesMedicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    InstitucionesMedicas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, InstitucionesMedicas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<InstitucionesMedicas> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        InstitucionesMedicas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", InstitucionesMedicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    InstitucionesMedicas create(@RequestBody InstitucionesMedicas obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, InstitucionesMedicas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody InstitucionesMedicas obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
