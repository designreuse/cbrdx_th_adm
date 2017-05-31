package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.PublicacionesCuestionarios;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 31/05/2017.
 */

@RestController
@RequestMapping("/api/publicacionesCuestionarios")
@CrossOrigin
public class PublicacionesCuestionariosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/publicacionesCuestionarios";

    @RequestMapping(method = RequestMethod.GET)
    List<PublicacionesCuestionarios> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        PublicacionesCuestionarios[] parametros = restTemplate.getForObject(serviceUrl, PublicacionesCuestionarios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    PublicacionesCuestionarios findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        PublicacionesCuestionarios parametro = restTemplate.getForObject(serviceUrl + "/" + id, PublicacionesCuestionarios.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.POST)
    PublicacionesCuestionarios create(@RequestBody PublicacionesCuestionarios request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, PublicacionesCuestionarios.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody PublicacionesCuestionarios request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, PublicacionesCuestionarios.class);
    }

}
