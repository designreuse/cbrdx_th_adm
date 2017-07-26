package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosNovedadesAdjuntos;
import com.ciberdix.th.model.VTercerosNovedadesAdjuntos;
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
    List<VTercerosNovedadesAdjuntos> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosNovedadesAdjuntos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosNovedadesAdjuntos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VTercerosNovedadesAdjuntos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosNovedadesAdjuntos> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VTercerosNovedadesAdjuntos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroNovedad/{id}")
    List<VTercerosNovedadesAdjuntos> findByIdTerceroNovedad(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "terceroNovedad/" + id, VTercerosNovedadesAdjuntos[].class));
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
