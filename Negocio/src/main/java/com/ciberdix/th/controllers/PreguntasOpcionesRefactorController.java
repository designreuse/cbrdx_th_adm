package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.PreguntasOpciones;
import com.ciberdix.th.model.VPreguntasOpciones;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 9/07/2017.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/preguntasOpciones")
public class PreguntasOpcionesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/preguntasOpciones";

    @RequestMapping(method = RequestMethod.GET)
    List<VPreguntasOpciones> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VPreguntasOpciones[] parametros = restTemplate.getForObject(serviceUrl, VPreguntasOpciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VPreguntasOpciones> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VPreguntasOpciones[] parametros = restTemplate.getForObject(serviceUrl, VPreguntasOpciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VPreguntasOpciones findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VPreguntasOpciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPregunta/{id}")
    List<VPreguntasOpciones> findByIdCuestionarioPregunta(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VPreguntasOpciones[] parametros = restTemplate.getForObject(serviceUrl + "/buscarPregunta/" + id, VPreguntasOpciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/buscarPregunta/{id}")
    List<VPreguntasOpciones> findByIdCuestionarioPreguntaAndIndicadorHabTrue(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VPreguntasOpciones[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/buscarPregunta/" + id, VPreguntasOpciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    PreguntasOpciones create(@RequestBody PreguntasOpciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, PreguntasOpciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody PreguntasOpciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
    
}
