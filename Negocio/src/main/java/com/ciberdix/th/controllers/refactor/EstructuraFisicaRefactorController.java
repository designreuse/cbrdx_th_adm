package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.EstructuraFisica;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/estructuraFisica")
public class EstructuraFisicaRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/estructuraFisica";

    @RequestMapping(method = RequestMethod.GET)
    List<EstructuraFisica> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        EstructuraFisica[] parametros = restTemplate.getForObject(serviceUrl, EstructuraFisica[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    EstructuraFisica findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, EstructuraFisica.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<EstructuraFisica> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        EstructuraFisica[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", EstructuraFisica[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstructuraFisica create(@RequestBody EstructuraFisica obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, EstructuraFisica.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody EstructuraFisica obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
