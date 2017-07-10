package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.MaestrosRespuestas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 10/07/2017.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/maestrosRespuestas")
public class MaestrosRespuestasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/maestrosRespuestas";

    @RequestMapping(method = RequestMethod.GET)
    List<MaestrosRespuestas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        MaestrosRespuestas[] parametros = restTemplate.getForObject(serviceUrl, MaestrosRespuestas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<MaestrosRespuestas> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        MaestrosRespuestas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", MaestrosRespuestas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    MaestrosRespuestas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, MaestrosRespuestas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cuestionario/{id}")
    List<MaestrosRespuestas> findByIdCuestionario(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        MaestrosRespuestas[] parametros = restTemplate.getForObject(serviceUrl + "/cuestionario/" + id, MaestrosRespuestas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/preguntaEnCurso/{id}")
    List<MaestrosRespuestas> findByIdPreguntaEnCurso(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        MaestrosRespuestas[] parametros = restTemplate.getForObject(serviceUrl + "/preguntaEnCurso/" + id, MaestrosRespuestas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/usuario/{id}")
    List<MaestrosRespuestas> findByIdUsuario(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        MaestrosRespuestas[] parametros = restTemplate.getForObject(serviceUrl + "/usuario/" + id, MaestrosRespuestas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    MaestrosRespuestas create(@RequestBody MaestrosRespuestas obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, MaestrosRespuestas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody MaestrosRespuestas obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
