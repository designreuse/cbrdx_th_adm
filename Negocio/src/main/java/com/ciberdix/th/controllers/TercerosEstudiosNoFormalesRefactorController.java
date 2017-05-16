package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.TercerosEstudiosNoFormales;
import com.ciberdix.th.model.VTercerosEstudiosNoFormales;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/tercerosEstudiosNoFormales")
@CrossOrigin
public class TercerosEstudiosNoFormalesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosEstudiosNoFormales";

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosEstudiosNoFormales> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosEstudiosNoFormales[] parametros = restTemplate.getForObject(serviceUrl, TercerosEstudiosNoFormales[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosEstudiosNoFormales create(@RequestBody TercerosEstudiosNoFormales request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, TercerosEstudiosNoFormales.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosEstudiosNoFormales request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, TercerosEstudiosNoFormales.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTercero}")
    VTercerosEstudiosNoFormales findOne(@PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosEstudiosNoFormales parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idTercero, VTercerosEstudiosNoFormales.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<VTercerosEstudiosNoFormales> findForTercero(@PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosEstudiosNoFormales[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTercero/" + idTercero, VTercerosEstudiosNoFormales[].class);
        return Arrays.asList(parametros);
    }
}
