package com.ciberdix.th.controllers;

import com.ciberdix.th.model.NovedadesAccidentes;
import com.ciberdix.th.model.VNovedadesAccidentes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/novedadesAccidentes")
@CrossOrigin
public class NovedadesAccidentesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/novedadesAccidentes/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VNovedadesAccidentes> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VNovedadesAccidentes[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VNovedadesAccidentes> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VNovedadesAccidentes[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VNovedadesAccidentes findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VNovedadesAccidentes.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroNovedad/{id}")
    List<VNovedadesAccidentes> findByIdGrupoDotacion(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "terceroNovedad/" + id, VNovedadesAccidentes[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    NovedadesAccidentes create(@RequestBody NovedadesAccidentes o) {
        return restTemplate.postForObject(serviceUrl, o, NovedadesAccidentes.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody NovedadesAccidentes o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
