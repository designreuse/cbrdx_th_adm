package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Responsabilidades;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/responsabilidades")
@Api(value = "responsabilidades", description = "responsabilidades")
public class ResponsabilidadesRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/responsabilidades";

    @RequestMapping(method = RequestMethod.GET)
    List<Responsabilidades> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Responsabilidades[] parametros = restTemplate.getForObject(serviceUrl, Responsabilidades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Responsabilidades findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, Responsabilidades.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<Responsabilidades> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        Responsabilidades[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", Responsabilidades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/noAsignadas/{id}")
    List<Responsabilidades> findNoAsignadas(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        Responsabilidades[] parametros = restTemplate.getForObject(serviceUrl + "/noAsignadas/" + id, Responsabilidades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Responsabilidades create(@RequestBody Responsabilidades obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, Responsabilidades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Responsabilidades obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
