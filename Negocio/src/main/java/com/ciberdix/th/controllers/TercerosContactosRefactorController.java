package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.TercerosContactos;
import com.ciberdix.th.model.VTercerosContactos;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/tercerosContactos")
@Api(value = "tercerosContactos", description = "Terceros Contactos")
public class TercerosContactosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosContactos";

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosContactos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosContactos[] parametros = restTemplate.getForObject(serviceUrl, VTercerosContactos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path="/buscarTercero/{id}")
    List<VTercerosContactos> findAllPorTercero(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosContactos[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTercero/" + id, VTercerosContactos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosContactos findOne(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        TercerosContactos parametros = restTemplate.getForObject(serviceUrl + "/" + id, TercerosContactos.class);
        return parametros;
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosContactos create(@RequestBody TercerosContactos request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, TercerosContactos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosContactos request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, TercerosContactos.class);
    }
}
