package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Faltas;
import com.ciberdix.th.model.VFaltas;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 6/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/faltas")
@Api(value = "faltas", description = "Faltas")
public class FaltasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/faltas";

    @RequestMapping(method = RequestMethod.GET)
    List<VFaltas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VFaltas[] parametros = restTemplate.getForObject(serviceUrl, VFaltas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VFaltas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VFaltas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VFaltas> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VFaltas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VFaltas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Faltas create(@RequestBody Faltas obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, Faltas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Faltas obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
