package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Requerimientos;
import com.ciberdix.th.model.VRequerimientos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 15/05/2017.
 */

@RestController
@RequestMapping("/api/requerimientos")
@CrossOrigin
public class RequerimientosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientos> findAll() {
        String serviceUrl = baseUrl + "/api/requerimientos/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idRequerimientos}")
    VRequerimientos findOne(@PathVariable Integer idRequerimientos) {
        String serviceUrl = baseUrl + "/api/requerimientos/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idRequerimientos, VRequerimientos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    Requerimientos create(@RequestBody Requerimientos requerimientos) {
        String serviceUrl = baseUrl + "/api/requerimientos/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, requerimientos, Requerimientos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Requerimientos requerimientos) {
        String serviceUrl = baseUrl + "/api/requerimientos/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, requerimientos);
    }

}