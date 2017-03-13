package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Formulario;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/formularios")
public class formularioController {

    private String serviceUrl = "http://localhost:8445/formularios/";

    @RequestMapping(method = RequestMethod.GET)
    List<Formulario> getForms() {
        RestTemplate restTemplate = new RestTemplate();
        Formulario[] parametros = restTemplate.getForObject(serviceUrl, Formulario[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Formulario createForm(@RequestBody Formulario request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Formulario.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateForm(@RequestBody Formulario request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Formulario.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idFormulario}")
    Formulario getForm(@PathVariable Integer idFormulario) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idFormulario, Formulario.class);
    }
}