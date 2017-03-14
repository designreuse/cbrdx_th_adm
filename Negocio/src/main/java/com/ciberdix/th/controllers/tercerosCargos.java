package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Tercero;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/tercerosCargos")
public class tercerosController {

    private String serviceUrl = "http://localhost:8445/chargeEmployees/";

    @RequestMapping(method = RequestMethod.GET)
    List<TerceroCargo> consultarTercerosCargos() {
        RestTemplate restTemplate = new RestTemplate();
        TerceroCargo[] parametros = restTemplate.getForObject(serviceUrl, TerceroCargo[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Tercero crearTercero(@RequestBody Tercero request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Tercero.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarTercero(@RequestBody TerceroCargo request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Tercero.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    TerceroCargo verTercero(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        TerceroCargo parametro = restTemplate.getForObject(serviceUrl + IdParametro, TerceroCargo.class);
        return parametro;
    }


}