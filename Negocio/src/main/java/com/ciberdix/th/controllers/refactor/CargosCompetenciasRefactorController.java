package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.CargosCompetencias;
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
    List<CargosCompetencias> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        CargosCompetencias[] cargosCompetencias = restTemplate.getForObject(serviceUrl, CargosCompetencias[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{idCargo}")
    List<CargosCompetencias> findEnabled(@PathVariable Integer idCargo) {
        RestTemplate restTemplate = new RestTemplate();
        CargosCompetencias[] cargosCompetencias = restTemplate.getForObject(serviceUrl + "/buscarCargo/" + idCargo, CargosCompetencias[].class);
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
