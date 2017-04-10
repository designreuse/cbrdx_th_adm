package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasEstadosCargos;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/listasEstadosCargos")
@Api(value = "listasEstadosCargos", description = "listasEstadosCargos")
public class ListasEstadosCargosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasEstadosCargos";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosCargos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstadosCargos[] parametros = restTemplate.getForObject(serviceUrl, ListasEstadosCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasEstadosCargos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstadosCargos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasEstadosCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codigo/{codigo}")
    ListasEstadosCargos findByCodigo(@PathVariable String codigo) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/codigo/" + codigo, ListasEstadosCargos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosCargos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ListasEstadosCargos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosCargos create(@RequestBody ListasEstadosCargos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ListasEstadosCargos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasEstadosCargos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
