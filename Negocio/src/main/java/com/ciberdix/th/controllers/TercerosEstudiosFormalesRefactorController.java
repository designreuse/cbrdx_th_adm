package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.TercerosEstudiosFormales;
import com.ciberdix.th.model.VTercerosEstudiosFormales;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/tercerosEstudiosFormales")
@CrossOrigin
public class TercerosEstudiosFormalesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosEstudiosFormales";

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosEstudiosFormales> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosEstudiosFormales[] parametros = restTemplate.getForObject(serviceUrl, TercerosEstudiosFormales[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosEstudiosFormales create(@RequestBody TercerosEstudiosFormales request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, TercerosEstudiosFormales.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosEstudiosFormales request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, TercerosEstudiosFormales.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTercero}")
    VTercerosEstudiosFormales findOne(@PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosEstudiosFormales parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idTercero, VTercerosEstudiosFormales.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<VTercerosEstudiosFormales> findForTercero(@PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosEstudiosFormales[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTercero/" + idTercero, VTercerosEstudiosFormales[].class);
        return Arrays.asList(parametros);
    }
}