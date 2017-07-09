package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.CuestionariosPreguntas;
import com.ciberdix.th.model.VCuestionariosPreguntas;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 9/07/2017.
 */
@RestController
@RequestMapping("/api/cuestionariosPreguntas")
@CrossOrigin
public class CuestionariosPreguntasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cuestionariosPreguntas";

    @RequestMapping(method = RequestMethod.GET)
    List<VCuestionariosPreguntas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VCuestionariosPreguntas[] parametros = restTemplate.getForObject(serviceUrl, VCuestionariosPreguntas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCuestionariosPreguntas> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VCuestionariosPreguntas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", VCuestionariosPreguntas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCuestionariosPreguntas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VCuestionariosPreguntas parametro = restTemplate.getForObject(serviceUrl + "/" + id, VCuestionariosPreguntas.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCuestionario/{id}")
    List<VCuestionariosPreguntas> findByIdCuestionario(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VCuestionariosPreguntas[] parametros = restTemplate.getForObject(serviceUrl + "/buscarCuestionario/" + id, VCuestionariosPreguntas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/buscarCuestionario/{id}")
    List<VCuestionariosPreguntas> findByIdCuestionarioAndIndicadorHabTrue(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VCuestionariosPreguntas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/buscarCuestionario/" + id, VCuestionariosPreguntas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    CuestionariosPreguntas create(@RequestBody CuestionariosPreguntas request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, CuestionariosPreguntas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CuestionariosPreguntas request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, CuestionariosPreguntas.class);
    }
    
}
