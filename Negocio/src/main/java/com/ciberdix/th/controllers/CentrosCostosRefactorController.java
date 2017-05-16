package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.CentrosCostos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/centrosCostos")
public class CentrosCostosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/centrosCostos";

    @RequestMapping(method = RequestMethod.GET)
    List<CentrosCostos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        CentrosCostos[] parametros = restTemplate.getForObject(serviceUrl, CentrosCostos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    CentrosCostos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, CentrosCostos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<CentrosCostos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        CentrosCostos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", CentrosCostos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    CentrosCostos create(@RequestBody CentrosCostos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CentrosCostos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CentrosCostos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
