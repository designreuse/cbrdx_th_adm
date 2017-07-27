package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ProyeccionesDotacionesTerceros;
import com.ciberdix.th.model.VProyeccionesDotacionesTerceros;
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
    List<VProyeccionesDotacionesTerceros> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VProyeccionesDotacionesTerceros[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProyeccionesDotacionesTerceros findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VProyeccionesDotacionesTerceros.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProyeccionesDotacionesTerceros> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VProyeccionesDotacionesTerceros[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proyeccionDotacion/{idProyeccionDotacion}")
    List<VProyeccionesDotacionesTerceros> findEnabled(@PathVariable Integer idProyeccionDotacion) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "proyeccionDotacion/" + idProyeccionDotacion, VProyeccionesDotacionesTerceros[].class));
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
