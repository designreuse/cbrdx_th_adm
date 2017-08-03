package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosTipos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/tercerosTipos")
@CrossOrigin
public class TercerosTiposRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tercerosTipos/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosTipos> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, TercerosTipos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<TercerosTipos> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", TercerosTipos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosTipos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, TercerosTipos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosTipos create(@RequestBody TercerosTipos o) {
        return restTemplate.postForObject(serviceUrl, o, TercerosTipos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosTipos o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
