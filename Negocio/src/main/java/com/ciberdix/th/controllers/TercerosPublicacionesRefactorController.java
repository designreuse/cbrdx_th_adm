package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosPublicaciones;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 8/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/tercerosPublicaciones")
public class TercerosPublicacionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosPublicaciones> findAll() {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/";
        RestTemplate restTemplate = new RestTemplate();
        TercerosPublicaciones[] params = restTemplate.getForObject(serviceUrl, TercerosPublicaciones[].class);
        return Arrays.asList(params);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosPublicaciones findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, TercerosPublicaciones.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosPublicaciones create(@RequestBody TercerosPublicaciones o) {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, o, TercerosPublicaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosPublicaciones o) {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o);
    }

}
