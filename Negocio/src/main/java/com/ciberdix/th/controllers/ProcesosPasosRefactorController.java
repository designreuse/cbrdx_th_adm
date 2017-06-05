package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.ProcesosPasos;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 5/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/procesosPasos")
public class ProcesosPasosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/procesosPasos";

    @RequestMapping(method = RequestMethod.GET)
    List<ProcesosPasos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ProcesosPasos[] cargosCompetencias = restTemplate.getForObject(serviceUrl, ProcesosPasos[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ProcesosPasos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ProcesosPasos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesosPasos create(@RequestBody ProcesosPasos obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ProcesosPasos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesosPasos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
