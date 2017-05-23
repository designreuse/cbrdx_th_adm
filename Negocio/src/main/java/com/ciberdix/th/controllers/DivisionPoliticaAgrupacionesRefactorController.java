package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.DivisionPoliticaAgrupaciones;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
@CrossOrigin
@RestController
@RequestMapping("/api/divisionPoliticaAgrupaciones")
public class DivisionPoliticaAgrupacionesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/divisionPoliticaAgrupaciones";

    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPoliticaAgrupaciones> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        DivisionPoliticaAgrupaciones[] parametros = restTemplate.getForObject(serviceUrl, DivisionPoliticaAgrupaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarAgrupacion/{idLista}")
    List<DivisionPoliticaAgrupaciones> findAll(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        DivisionPoliticaAgrupaciones[] parametros = restTemplate.getForObject(serviceUrl+ "/buscarAgrupacion/" + idLista, DivisionPoliticaAgrupaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idLista}")
    DivisionPoliticaAgrupaciones findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + idLista, DivisionPoliticaAgrupaciones.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    DivisionPoliticaAgrupaciones create(@RequestBody DivisionPoliticaAgrupaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, DivisionPoliticaAgrupaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody DivisionPoliticaAgrupaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
