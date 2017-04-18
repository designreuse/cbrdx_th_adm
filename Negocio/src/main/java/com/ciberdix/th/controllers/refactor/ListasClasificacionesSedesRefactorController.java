package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasClasificacionesSedes;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/listasClasificacionesSedes")
public class ListasClasificacionesSedesRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasClasificacionesSedes";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasClasificacionesSedes> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasClasificacionesSedes[] parametros = restTemplate.getForObject(serviceUrl, ListasClasificacionesSedes[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasClasificacionesSedes findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ListasClasificacionesSedes.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasClasificacionesSedes> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasClasificacionesSedes[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasClasificacionesSedes[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasClasificacionesSedes create(@RequestBody ListasClasificacionesSedes obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ListasClasificacionesSedes.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasClasificacionesSedes obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
