package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.TercerosReferencias;
import com.ciberdix.th.model.VTercerosReferencias;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/employeesReferences")
public class tercerosReferenciasController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/employeesReferences/";

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosReferencias> consultarParametros() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosReferencias[] parametros = restTemplate.getForObject(serviceUrl, TercerosReferencias[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/view/{idTercero}")
    List<VTercerosReferencias> consultarVParametros(@PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosReferencias[] parametros = restTemplate.getForObject(serviceUrl + "/view/" + idTercero, VTercerosReferencias[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosReferencias crearParametro(@RequestBody TercerosReferencias request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, TercerosReferencias.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarParametro(@RequestBody TercerosReferencias request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, TercerosReferencias.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    TercerosReferencias verParametro(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        TercerosReferencias parametro = restTemplate.getForObject(serviceUrl + IdParametro, TercerosReferencias.class);
        return parametro;
    }
}