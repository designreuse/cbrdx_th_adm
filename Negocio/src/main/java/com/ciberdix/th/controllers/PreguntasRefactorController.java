package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Preguntas;
import com.ciberdix.th.model.VPreguntas;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/preguntas")
public class PreguntasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/preguntas";

    @RequestMapping(method = RequestMethod.GET)
    List<VPreguntas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VPreguntas[] parametros = restTemplate.getForObject(serviceUrl, VPreguntas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VPreguntas> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VPreguntas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", VPreguntas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VPreguntas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VPreguntas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCuestionario/{id}")
    List<VPreguntas> findByIdCuestionario(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VPreguntas[] parametros = restTemplate.getForObject(serviceUrl + "/buscarCuestionario/" + id, VPreguntas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/buscarCuestionario/{id}")
    List<VPreguntas> findByIdCuestionarioAndIndicadorHabTrue(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VPreguntas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/buscarCuestionario/" + id, VPreguntas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Preguntas create(@RequestBody Preguntas obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, Preguntas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Preguntas obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
    
}
