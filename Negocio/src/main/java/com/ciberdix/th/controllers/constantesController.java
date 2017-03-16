package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Constante;
import com.ciberdix.th.model.VConstante;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/constantes")
public class constantesController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/constantes/";
//    private String serviceUrl = "http://localhost:8445/constantes/";

    @RequestMapping(method = RequestMethod.GET)
    List<Constante> consultarParametros() {
        RestTemplate restTemplate = new RestTemplate();
        Constante[] parametros = restTemplate.getForObject(serviceUrl, Constante[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/vista")
    List<VConstante> consultarVParametros() {
        RestTemplate restTemplate = new RestTemplate();
        VConstante[] parametros = restTemplate.getForObject(serviceUrl+"/vista", VConstante[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Constante crearParametro(@RequestBody Constante request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Constante.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarParametro(@RequestBody Constante request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Constante.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    Constante verParametro(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        Constante parametro = restTemplate.getForObject(serviceUrl + IdParametro, Constante.class);
        return parametro;
    }
}