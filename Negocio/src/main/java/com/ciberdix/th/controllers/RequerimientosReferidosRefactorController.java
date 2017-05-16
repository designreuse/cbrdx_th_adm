package com.ciberdix.th.controllers;

import com.ciberdix.th.model.RequerimientosReferidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 16/05/2017.
 */

@RestController
@CrossOrigin
@RequestMapping("/api/requerimientosReferidos")
public class RequerimientosReferidosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<RequerimientosReferidos> findAll() {
        String serviceUrl = baseUrl + "/api/requerimientosReferidos/";
        RestTemplate restTemplate = new RestTemplate();
        List<RequerimientosReferidos> requerimientosReferidos = Arrays.asList(restTemplate.getForObject(serviceUrl, RequerimientosReferidos[].class));

        return requerimientosReferidos;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RequerimientosReferidos findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/requerimientosReferidos/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, RequerimientosReferidos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosReferidos create(@RequestBody RequerimientosReferidos o) {
        String serviceUrl = baseUrl + "/api/requerimientosReferidos/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, o, RequerimientosReferidos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosReferidos o) {
        String serviceUrl = baseUrl + "/api/requerimientosReferidos/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o);
    }

}
