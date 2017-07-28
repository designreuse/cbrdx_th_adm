package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ProyeccionDotacionEstructuraOrganizacional;
import com.ciberdix.th.model.VProyeccionDotacionEstructuraOrganizacional;
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
    List<VProyeccionDotacionEstructuraOrganizacional> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VProyeccionDotacionEstructuraOrganizacional[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProyeccionDotacionEstructuraOrganizacional findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VProyeccionDotacionEstructuraOrganizacional.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProyeccionDotacionEstructuraOrganizacional> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VProyeccionDotacionEstructuraOrganizacional[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proyeccionDotacion/{id}")
    List<VProyeccionDotacionEstructuraOrganizacional> findByIdProeccionDotacion(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "proyeccionDotacion/" + id, VProyeccionDotacionEstructuraOrganizacional[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/estructuraOrganizacional/{id}")
    List<VProyeccionDotacionEstructuraOrganizacional> findByIdEstructuraOrganizacional(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "estructuraOrganizacional/" + id, VProyeccionDotacionEstructuraOrganizacional[].class));
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
