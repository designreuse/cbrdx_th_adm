package com.ciberdix.th.controllers;

import com.ciberdix.th.model.CentralesRiesgosDatos;
import com.ciberdix.th.model.VCentralesRiesgosDatos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/centralesRiesgosDatos")
@CrossOrigin
public class CentralesRiesgosDatosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/centralesRiesgosDatos/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VCentralesRiesgosDatos> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VCentralesRiesgosDatos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCentralesRiesgosDatos> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VCentralesRiesgosDatos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCentralesRiesgosDatos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VCentralesRiesgosDatos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/centralRiesgo/{id}")
    List<VCentralesRiesgosDatos> findByIdTerceroTipo(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "centralRiesgo/" + id, VCentralesRiesgosDatos[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    CentralesRiesgosDatos create(@RequestBody CentralesRiesgosDatos o) {
        return restTemplate.postForObject(serviceUrl, o, CentralesRiesgosDatos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CentralesRiesgosDatos o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
