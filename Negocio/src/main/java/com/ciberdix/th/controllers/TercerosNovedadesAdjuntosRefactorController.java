package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosNovedadesAdjuntos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/tercerosNovedadesAdjuntos")
@CrossOrigin
public class TercerosNovedadesAdjuntosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tercerosNovedadesAdjuntos/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosNovedadesAdjuntos> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, TercerosNovedadesAdjuntos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosNovedadesAdjuntos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, TercerosNovedadesAdjuntos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<TercerosNovedadesAdjuntos> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", TercerosNovedadesAdjuntos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroNovedad/{id}")
    List<TercerosNovedadesAdjuntos> findByIdTerceroNovedad(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "terceroNovedad/" + id, TercerosNovedadesAdjuntos[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosNovedadesAdjuntos create(@RequestBody TercerosNovedadesAdjuntos o) {
        return restTemplate.postForObject(serviceUrl, o, TercerosNovedadesAdjuntos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosNovedadesAdjuntos o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
