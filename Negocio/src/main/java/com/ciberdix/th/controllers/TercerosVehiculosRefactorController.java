package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.TercerosVehiculos;
import com.ciberdix.th.model.VTercerosVehiculos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/tercerosVehiculos")
public class TercerosVehiculosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosVehiculos";

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosVehiculos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosVehiculos[] parametros = restTemplate.getForObject(serviceUrl, VTercerosVehiculos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path="/buscarTerceros/{id}")
    List<VTercerosVehiculos> findAllPorTercero(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosVehiculos[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTerceros/" + id, VTercerosVehiculos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosVehiculos findOne(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosVehiculos parametros = restTemplate.getForObject(serviceUrl + "/" + id, VTercerosVehiculos.class);
        return parametros;
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosVehiculos create(@RequestBody TercerosVehiculos request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, TercerosVehiculos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosVehiculos request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, TercerosVehiculos.class);
    }
}
