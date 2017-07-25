package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ProyeccionDotacion;
import com.ciberdix.th.model.VProyeccionDotacion;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/proyeccionDotacion")
@CrossOrigin
public class ProyeccionDotacionRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/proyeccionDotacion/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VProyeccionDotacion> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VProyeccionDotacion[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProyeccionDotacion findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VProyeccionDotacion.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProyeccionDotacion> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VProyeccionDotacion[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/entreFechas/{fechaInicio}/{fechaFin}")
    List<VProyeccionDotacion> findByFechaSolicitudBetween(@PathVariable String fechaInicio, @PathVariable String fechaFin) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "entreFechas/" + fechaInicio + "/" + fechaFin, VProyeccionDotacion[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionDotacion create(@RequestBody ProyeccionDotacion o) {
        return restTemplate.postForObject(serviceUrl, o, ProyeccionDotacion.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProyeccionDotacion o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
