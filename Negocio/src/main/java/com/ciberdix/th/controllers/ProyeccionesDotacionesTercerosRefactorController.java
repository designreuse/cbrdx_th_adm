package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ProyeccionesDotacionesTerceros;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/proyeccionesDotacionesTerceros")
@CrossOrigin
public class ProyeccionesDotacionesTercerosRefactorController {
    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/proyeccionesDotacionesTerceros/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<ProyeccionesDotacionesTerceros> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, ProyeccionesDotacionesTerceros[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ProyeccionesDotacionesTerceros findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, ProyeccionesDotacionesTerceros.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionesDotacionesTerceros create(@RequestBody ProyeccionesDotacionesTerceros o) {
        return restTemplate.postForObject(serviceUrl, o, ProyeccionesDotacionesTerceros.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProyeccionesDotacionesTerceros o) {
        restTemplate.put(serviceUrl, o);
    }
}
