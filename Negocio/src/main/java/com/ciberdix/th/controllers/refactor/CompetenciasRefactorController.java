package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.Competencias;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/competencias")
public class CompetenciasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargosCompetencias";

    @RequestMapping(method = RequestMethod.GET)
    List<Competencias> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Competencias[] cargosCompetencias = restTemplate.getForObject(serviceUrl, Competencias[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/{idGrupoCompetencia}")
    List<Competencias> findEnabled(@PathVariable Integer idGrupoCompetencia) {
        RestTemplate restTemplate = new RestTemplate();
        Competencias[] cargosCompetencias = restTemplate.getForObject(serviceUrl + "/buscarCargo/" + idGrupoCompetencia, Competencias[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.POST)
    Competencias create(@RequestBody Competencias obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, Competencias.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Competencias obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
