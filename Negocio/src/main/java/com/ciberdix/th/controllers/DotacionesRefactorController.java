package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Dotaciones;
import com.ciberdix.th.model.VDotaciones;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */

@RestController
@RequestMapping("/api/dotaciones")
@CrossOrigin
public class DotacionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/dotaciones/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VDotaciones> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VDotaciones findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VDotaciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VDotaciones> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    Dotaciones create(@RequestBody Dotaciones o) {
        return restTemplate.postForObject(serviceUrl, o, Dotaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Dotaciones o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
