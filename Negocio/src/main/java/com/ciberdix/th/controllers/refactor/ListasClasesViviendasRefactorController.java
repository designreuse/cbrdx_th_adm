package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasClasesViviendas;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/listasClasesViviendas")
@Api(value = "listasClasesViviendas", description = "Listas Clases de Viviendas")
public class ListasClasesViviendasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasClasesViviendas";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasClasesViviendas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasClasesViviendas[] parametros = restTemplate.getForObject(serviceUrl, ListasClasesViviendas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasClasesViviendas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        ListasClasesViviendas parametros = restTemplate.getForObject(serviceUrl + "/" + id, ListasClasesViviendas.class);
        return parametros;
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasClasesViviendas create(@RequestBody ListasClasesViviendas request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasClasesViviendas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasClasesViviendas request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasClasesViviendas.class);
    }
}
