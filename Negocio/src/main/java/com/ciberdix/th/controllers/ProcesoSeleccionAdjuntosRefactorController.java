package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.ProcesoSeleccionAdjuntos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 14/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/procesoSeleccionAdjuntos")
public class ProcesoSeleccionAdjuntosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/procesoSeleccionAdjuntos";

    @RequestMapping(method = RequestMethod.GET)
    List<ProcesoSeleccionAdjuntos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ProcesoSeleccionAdjuntos[] parametros = restTemplate.getForObject(serviceUrl, ProcesoSeleccionAdjuntos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ProcesoSeleccionAdjuntos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ProcesoSeleccionAdjuntos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccionAdjuntos create(@RequestBody ProcesoSeleccionAdjuntos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ProcesoSeleccionAdjuntos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccionAdjuntos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
