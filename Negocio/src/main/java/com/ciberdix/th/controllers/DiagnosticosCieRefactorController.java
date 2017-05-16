package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.DiagnosticosCie;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 4/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/diagnosticosCie")
@Api(value = "diagnosticosCie", description = "Diagnosticos")
public class DiagnosticosCieRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/diagnosticosCie";

    @RequestMapping(method = RequestMethod.GET)
    List<DiagnosticosCie> findAll(){
        RestTemplate restTemplate = new RestTemplate();
        DiagnosticosCie[] parametros = restTemplate.getForObject(serviceUrl, DiagnosticosCie[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path="/{id}")
    DiagnosticosCie findOne(@PathVariable Integer id){
        RestTemplate restTemplate = new RestTemplate();
        DiagnosticosCie parametros = restTemplate.getForObject(serviceUrl + "/" + id, DiagnosticosCie.class);
        return parametros;
    }

    @RequestMapping(method = RequestMethod.GET, path="/codigoNombre/{query}")
    List<DiagnosticosCie> findCodigoNombre(@PathVariable String query){
        RestTemplate restTemplate = new RestTemplate();
        DiagnosticosCie[] parametros = restTemplate.getForObject(serviceUrl + "/codigoNombre/" + query, DiagnosticosCie[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    DiagnosticosCie create(@RequestBody DiagnosticosCie request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, DiagnosticosCie.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody DiagnosticosCie request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, DiagnosticosCie.class);
    }
}
