package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Ponderaciones;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/ponderaciones")
public class PonderacionesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/ponderaciones";

    @RequestMapping(method = RequestMethod.GET)
    List<Ponderaciones> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Ponderaciones[] cargosCompetencias = restTemplate.getForObject(serviceUrl, Ponderaciones[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<Ponderaciones> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        Ponderaciones[] cargosCompetencias = restTemplate.getForObject(serviceUrl, Ponderaciones[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.POST)
    Ponderaciones create(@RequestBody Ponderaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, Ponderaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Ponderaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
