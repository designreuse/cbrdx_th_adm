package com.ciberdix.th.controllers;

import com.ciberdix.th.model.PlanesAccionesNovedadesAccidentes;
import com.ciberdix.th.model.VPlanesAccionesNovedadesAccidentes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/planesAccionesNovedadesAccidentes")
@CrossOrigin
public class PlanesAccionesNovedadesAccidentesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/planesAccionesNovedadesAccidentes/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VPlanesAccionesNovedadesAccidentes> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VPlanesAccionesNovedadesAccidentes[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VPlanesAccionesNovedadesAccidentes> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VPlanesAccionesNovedadesAccidentes[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VPlanesAccionesNovedadesAccidentes findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VPlanesAccionesNovedadesAccidentes.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/novedadAccidente/{id}")
    List<VPlanesAccionesNovedadesAccidentes> findByIdGrupoDotacion(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "novedadAccidente/" + id, VPlanesAccionesNovedadesAccidentes[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    PlanesAccionesNovedadesAccidentes create(@RequestBody PlanesAccionesNovedadesAccidentes o) {
        return restTemplate.postForObject(serviceUrl, o, PlanesAccionesNovedadesAccidentes.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody PlanesAccionesNovedadesAccidentes o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
