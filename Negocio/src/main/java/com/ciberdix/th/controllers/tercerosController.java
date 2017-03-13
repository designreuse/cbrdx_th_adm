package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Tercero;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/terceros")
public class tercerosController {

    private String serviceUrl = "http://localhost:8445/employees/";

    @RequestMapping(method = RequestMethod.GET)
    List<Tercero> consultarTerceros() {
        RestTemplate restTemplate = new RestTemplate();
        Tercero[] parametros = restTemplate.getForObject(serviceUrl, Tercero[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Tercero crearTercero(@RequestBody Tercero request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Tercero.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarTercero(@RequestBody Tercero request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Tercero.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    Tercero verTercero(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        Tercero parametro = restTemplate.getForObject(serviceUrl + IdParametro, Tercero.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{TipoDocumento}/{NumeroDocumento}")
    Tercero buscarTercero(@PathVariable Integer TipoDocumento, @PathVariable String NumeroDocumento) {
        RestTemplate restTemplate = new RestTemplate();
        Tercero parametro = restTemplate.getForObject(serviceUrl + TipoDocumento + "/" + NumeroDocumento, Tercero.class);
        return parametro;
    }
}