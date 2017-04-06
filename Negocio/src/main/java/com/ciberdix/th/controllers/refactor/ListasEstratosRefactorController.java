package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasEstratos;
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
@RequestMapping("/api/listasEstratos")
@Api(value = "listasEstratos", description = "Listas estratos")
public class ListasEstratosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasEstratos";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstratos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstratos[] parametros = restTemplate.getForObject(serviceUrl, ListasEstratos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstratos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstratos parametros = restTemplate.getForObject(serviceUrl + "/" + id, ListasEstratos.class);
        return parametros;
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstratos create(@RequestBody ListasEstratos request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasEstratos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasEstratos request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasEstratos.class);
    }
}
