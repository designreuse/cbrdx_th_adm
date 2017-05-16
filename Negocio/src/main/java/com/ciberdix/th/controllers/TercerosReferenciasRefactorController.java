package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.TercerosReferencias;
import com.ciberdix.th.model.VTercerosReferencias;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/tercerosReferencias")
@CrossOrigin
public class TercerosReferenciasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosReferencias";

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosReferencias> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosReferencias[] parametros = restTemplate.getForObject(serviceUrl, TercerosReferencias[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosReferencias create(@RequestBody TercerosReferencias request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, TercerosReferencias.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosReferencias request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, TercerosReferencias.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTercero}")
    TercerosReferencias findOne(@PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        TercerosReferencias parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idTercero, TercerosReferencias.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<VTercerosReferencias> findForTercero(@PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosReferencias[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTercero/" + idTercero, VTercerosReferencias[].class);
        return Arrays.asList(parametros);
    }
}
