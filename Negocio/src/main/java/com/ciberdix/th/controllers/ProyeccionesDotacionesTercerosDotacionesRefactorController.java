package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ProyeccionesDotacionesTercerosDotaciones;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/proyeccionesDotacionesTercerosDotaciones")
@CrossOrigin
public class ProyeccionesDotacionesTercerosDotacionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/proyeccionesDotacionesTercerosDotaciones/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<ProyeccionesDotacionesTercerosDotaciones> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, ProyeccionesDotacionesTercerosDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ProyeccionesDotacionesTercerosDotaciones findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, ProyeccionesDotacionesTercerosDotaciones.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionesDotacionesTercerosDotaciones create(@RequestBody ProyeccionesDotacionesTercerosDotaciones o) {
        return restTemplate.postForObject(serviceUrl, o, ProyeccionesDotacionesTercerosDotaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProyeccionesDotacionesTercerosDotaciones o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
