package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Cuestionarios;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 31/05/2017.
 */

@RestController
@RequestMapping("/api/cuestionarios")
@CrossOrigin
public class CuestionariosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cuestionarios";

    @RequestMapping(method = RequestMethod.GET)
    List<Cuestionarios> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Cuestionarios[] parametros = restTemplate.getForObject(serviceUrl, Cuestionarios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<Cuestionarios> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        Cuestionarios[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", Cuestionarios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Cuestionarios create(@RequestBody Cuestionarios request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Cuestionarios.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Cuestionarios request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Cuestionarios.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Cuestionarios findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        Cuestionarios parametro = restTemplate.getForObject(serviceUrl + "/" + id, Cuestionarios.class);
        return parametro;
    }

}
