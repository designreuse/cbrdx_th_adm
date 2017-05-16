package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Productividades;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/productividades")
@CrossOrigin
public class ProductividadesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/productividades";

    @RequestMapping(method = RequestMethod.GET)
    List<Productividades> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Productividades[] parametros = restTemplate.getForObject(serviceUrl, Productividades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Productividades create(@RequestBody Productividades request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Productividades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Productividades request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Productividades.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLocalizacion}")
    Productividades findOne(@PathVariable Integer idLocalizacion) {
        RestTemplate restTemplate = new RestTemplate();
        Productividades parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idLocalizacion, Productividades.class);
        return parametro;
    }
}
