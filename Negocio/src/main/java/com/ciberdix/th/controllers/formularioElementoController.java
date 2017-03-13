package com.ciberdix.th.controllers;

import com.ciberdix.th.model.FormularioElemento;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/formulariosElementos")
public class formularioElementoController {

    private String serviceUrl = "http://localhost:8445/formulariosElementos/";

    @RequestMapping(method = RequestMethod.GET)
    List<FormularioElemento> getForms() {
        RestTemplate restTemplate = new RestTemplate();
        FormularioElemento[] parametros = restTemplate.getForObject(serviceUrl, FormularioElemento[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    FormularioElemento createForm(@RequestBody FormularioElemento request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, FormularioElemento.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateForm(@RequestBody FormularioElemento request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, FormularioElemento.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idFormulario}")
    FormularioElemento getForm(@PathVariable Integer idFormulario) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idFormulario, FormularioElemento.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/formulario/{idFormulario}")
    List<FormularioElemento> getFormElements(@PathVariable Integer idFormulario) {
        RestTemplate restTemplate = new RestTemplate();
        FormularioElemento[] formularioElementos = restTemplate.getForObject(serviceUrl + "/formulario/" + idFormulario, FormularioElemento[].class);
        return Arrays.asList(formularioElementos);
    }
}