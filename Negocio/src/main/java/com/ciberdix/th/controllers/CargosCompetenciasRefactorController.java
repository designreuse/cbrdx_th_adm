package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.CargosCompetencias;
import com.ciberdix.th.model.VCargosCompetencias;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosCompetencias")
public class CargosCompetenciasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargosCompetencias";

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosCompetencias> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VCargosCompetencias[] cargosCompetencias = restTemplate.getForObject(serviceUrl, VCargosCompetencias[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosCompetencias findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" +  id, VCargosCompetencias.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{idCargo}")
    List<VCargosCompetencias> findEnabled(@PathVariable Integer idCargo) {
        RestTemplate restTemplate = new RestTemplate();
        VCargosCompetencias[] cargosCompetencias = restTemplate.getForObject(serviceUrl + "/buscarCargo/" + idCargo, VCargosCompetencias[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosCompetencias create(@RequestBody CargosCompetencias obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CargosCompetencias.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosCompetencias obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
