package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.CargosElementos;
import com.ciberdix.th.model.VCargosElementos;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/cargosElementos")
@Api(value = "cargosElementos", description = "Cargos Elementos")
public class CargosElementosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargosElementos";

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosElementos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VCargosElementos[] parametros = restTemplate.getForObject(serviceUrl, VCargosElementos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosElementos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VCargosElementos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<VCargosElementos> findByIdCargo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VCargosElementos[] parametros = restTemplate.getForObject(serviceUrl + "/buscarCargo/" + id, VCargosElementos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosElementos create(@RequestBody VCargosElementos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CargosElementos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosElementos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
