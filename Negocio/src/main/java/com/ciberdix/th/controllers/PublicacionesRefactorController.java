package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Publicaciones;
import com.ciberdix.th.model.VCantidadPublicacion;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 31/05/2017.
 */

@RestController
@RequestMapping("/api/publicaciones")
@CrossOrigin
public class PublicacionesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/publicaciones";

    @RequestMapping(method = RequestMethod.GET)
    List<Publicaciones> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Publicaciones[] parametros = restTemplate.getForObject(serviceUrl, Publicaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Publicaciones findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        Publicaciones parametro = restTemplate.getForObject(serviceUrl + "/" + id, Publicaciones.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cantidadPublicacion")
    List<VCantidadPublicacion> findCant() {
        RestTemplate restTemplate = new RestTemplate();
        VCantidadPublicacion[] parametros = restTemplate.getForObject(serviceUrl + "/cantidadPublicacion", VCantidadPublicacion[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Publicaciones create(@RequestBody Publicaciones request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Publicaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    String update(@RequestBody Publicaciones request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Publicaciones.class);
        return request.getFechaFin().toString();
    }

}
