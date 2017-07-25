package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ProyeccionDotacionEstructuraOrganizacional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/proyeccionDotacionEstructuraOrganizacional")
@CrossOrigin
public class ProyeccionDotacionEstructuraOrganizacionalRefactorController {
    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/proyeccionDotacionEstructuraOrganizacional/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<ProyeccionDotacionEstructuraOrganizacional> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, ProyeccionDotacionEstructuraOrganizacional[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ProyeccionDotacionEstructuraOrganizacional findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, ProyeccionDotacionEstructuraOrganizacional.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionDotacionEstructuraOrganizacional create(@RequestBody ProyeccionDotacionEstructuraOrganizacional o) {
        return restTemplate.postForObject(serviceUrl, o, ProyeccionDotacionEstructuraOrganizacional.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProyeccionDotacionEstructuraOrganizacional o) {
        restTemplate.put(serviceUrl, o);
    }
}
