package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosTiposClasificaciones;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/tercerosTiposClasificaciones")
@CrossOrigin
public class TercerosTiposClasificacionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tercerosTiposClasificaciones/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosTiposClasificaciones> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, TercerosTiposClasificaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<TercerosTiposClasificaciones> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", TercerosTiposClasificaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosTiposClasificaciones findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, TercerosTiposClasificaciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroTipo/{id}")
    List<TercerosTiposClasificaciones> findByIdTerceroTipo(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "terceroTipo/" + id, TercerosTiposClasificaciones[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosTiposClasificaciones create(@RequestBody TercerosTiposClasificaciones o) {
        return restTemplate.postForObject(serviceUrl, o, TercerosTiposClasificaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosTiposClasificaciones o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
