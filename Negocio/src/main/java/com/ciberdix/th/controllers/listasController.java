package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Listas;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/listas")
public class listasController {

    private String serviceUrl = "http://localhost:8445/listas/";

    @RequestMapping(method = RequestMethod.GET)
    List<Listas> getLists() {
        RestTemplate restTemplate = new RestTemplate();
        Listas[] parametros = restTemplate.getForObject(serviceUrl, Listas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Listas createList(@RequestBody Listas request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Listas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateList(@RequestBody Listas request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Listas.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idLista}")
    Listas getList(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idLista, Listas.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/codigo/{codigo}")
    Listas getListByCodigo(@PathVariable String codigo) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/codigo/" + codigo, Listas.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/others/{idLista}")
    List<Listas> getOthers(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        Listas[] parametros = restTemplate.getForObject(serviceUrl + "/others/" + idLista, Listas[].class);
        return Arrays.asList(parametros);
    }
}