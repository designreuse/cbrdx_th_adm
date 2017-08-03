package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.RiesgosTipos;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/riesgosTipos")
@Api(value = "riesgosTipos", description = "Riesgos Tipos")
public class RiesgosTiposRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/riesgosTipos/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<RiesgosTipos> findAll() {
        RiesgosTipos[] parametros = restTemplate.getForObject(serviceUrl, RiesgosTipos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<RiesgosTipos> findByEnabled() {
        RiesgosTipos[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", RiesgosTipos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RiesgosTipos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, RiesgosTipos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cargo/{id}")
    List<RiesgosTipos> findByIdCargo (@PathVariable Integer id){
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "cargo/" + id, RiesgosTipos[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    RiesgosTipos create(@RequestBody RiesgosTipos obj){
        return restTemplate.postForObject(serviceUrl, obj, RiesgosTipos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RiesgosTipos obj){
        restTemplate.put(serviceUrl, obj);
    }
}
