package com.ciberdix.th.controllers;

import com.ciberdix.th.model.PlanesAccionesNovedadesAccidentesAdjuntos;
import com.ciberdix.th.model.VPlanesAccionesNovedadesAccidentesAdjuntos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/planesAccionesNovedadesAccidentesAdjuntos")
@CrossOrigin
public class PlanesAccionesNovedadesAccidentesAdjuntosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/planesAccionesNovedadesAccidentesAdjuntos/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VPlanesAccionesNovedadesAccidentesAdjuntos> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VPlanesAccionesNovedadesAccidentesAdjuntos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VPlanesAccionesNovedadesAccidentesAdjuntos> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VPlanesAccionesNovedadesAccidentesAdjuntos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VPlanesAccionesNovedadesAccidentesAdjuntos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VPlanesAccionesNovedadesAccidentesAdjuntos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/planAccionNovedadAccidente/{id}")
    List<VPlanesAccionesNovedadesAccidentesAdjuntos> findIdPlanAccionNovedadAccidente(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "planAccionNovedadAccidente/" + id, VPlanesAccionesNovedadesAccidentesAdjuntos[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    PlanesAccionesNovedadesAccidentesAdjuntos create(@RequestBody PlanesAccionesNovedadesAccidentesAdjuntos o) {
        return restTemplate.postForObject(serviceUrl, o, PlanesAccionesNovedadesAccidentesAdjuntos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody PlanesAccionesNovedadesAccidentesAdjuntos o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
