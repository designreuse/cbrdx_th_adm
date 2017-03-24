package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.ListaTipoReferencia;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/referenceTypes")
public class listaTipoReferenciaController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/referenceTypes/";

    @RequestMapping(method = RequestMethod.GET)
    List<ListaTipoReferencia> consultarParametros() {
        RestTemplate restTemplate = new RestTemplate();
        ListaTipoReferencia[] parametros = restTemplate.getForObject(serviceUrl, ListaTipoReferencia[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListaTipoReferencia crearParametro(@RequestBody ListaTipoReferencia request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListaTipoReferencia.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarParametro(@RequestBody ListaTipoReferencia request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListaTipoReferencia.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    ListaTipoReferencia verParametro(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        ListaTipoReferencia parametro = restTemplate.getForObject(serviceUrl + IdParametro, ListaTipoReferencia.class);
        return parametro;
    }
}