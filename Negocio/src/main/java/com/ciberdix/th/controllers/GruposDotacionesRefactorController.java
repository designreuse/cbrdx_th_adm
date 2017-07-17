package com.ciberdix.th.controllers;

import com.ciberdix.th.model.GruposDotaciones;
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
@RequestMapping("/api/gruposDotaciones")
@CrossOrigin
public class GruposDotacionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/gruposDotaciones/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<GruposDotaciones> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, GruposDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    GruposDotaciones findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, GruposDotaciones.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    GruposDotaciones create(@RequestBody GruposDotaciones o) {
        return restTemplate.postForObject(serviceUrl, o, GruposDotaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody GruposDotaciones o) {
        restTemplate.put(serviceUrl, o);
    }

}
