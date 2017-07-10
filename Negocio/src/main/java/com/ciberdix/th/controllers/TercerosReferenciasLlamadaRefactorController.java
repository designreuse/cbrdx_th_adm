package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.TercerosReferenciasLlamada;
import com.ciberdix.th.model.VTercerosReferenciasLlamada;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
@RestController
@RequestMapping("/api/tercerosReferenciasLlamada")
@CrossOrigin
public class TercerosReferenciasLlamadaRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosReferenciasLlamada";

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosReferenciasLlamada> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosReferenciasLlamada[] parametros = restTemplate.getForObject(serviceUrl, VTercerosReferenciasLlamada[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    VTercerosReferenciasLlamada findOne(@PathVariable int id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VTercerosReferenciasLlamada.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosReferenciasLlamada> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosReferenciasLlamada[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", VTercerosReferenciasLlamada[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroReferencia/{id}")
    List<VTercerosReferenciasLlamada> findByIdTerceroReferencia(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosReferenciasLlamada[] parametros = restTemplate.getForObject(serviceUrl + "/terceroReferencia/" + id, VTercerosReferenciasLlamada[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/resultadoLlamada/{id}")
    List<VTercerosReferenciasLlamada> findByIdResultadoLlamada(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosReferenciasLlamada[] parametros = restTemplate.getForObject(serviceUrl + "/resultadoLlamada/" + id, VTercerosReferenciasLlamada[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosReferenciasLlamada create(@RequestBody TercerosReferenciasLlamada o) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, o, TercerosReferenciasLlamada.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosReferenciasLlamada o) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o, TercerosReferenciasLlamada.class);
    }

}
