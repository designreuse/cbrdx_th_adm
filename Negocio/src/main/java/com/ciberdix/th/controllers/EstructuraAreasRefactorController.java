package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.EstructuraAreas;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/estructuraAreas")
public class EstructuraAreasRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/estructuraAreas";

    @RequestMapping(method = RequestMethod.GET)
    List<EstructuraAreas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        EstructuraAreas[] parametros = restTemplate.getForObject(serviceUrl, EstructuraAreas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    EstructuraAreas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, EstructuraAreas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<EstructuraAreas> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        EstructuraAreas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", EstructuraAreas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstructuraAreas create(@RequestBody EstructuraAreas obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, EstructuraAreas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody EstructuraAreas obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
