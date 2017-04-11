package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.GruposCompetencias;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/gruposCompetencias")
public class GruposCompetenciasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/gruposCompetencias";

    @RequestMapping(method = RequestMethod.GET)
    List<GruposCompetencias> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        GruposCompetencias[] cargosCompetencias = restTemplate.getForObject(serviceUrl, GruposCompetencias[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<GruposCompetencias> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        GruposCompetencias[] cargosCompetencias = restTemplate.getForObject(serviceUrl, GruposCompetencias[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.POST)
    GruposCompetencias create(@RequestBody GruposCompetencias obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, GruposCompetencias.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody GruposCompetencias obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
