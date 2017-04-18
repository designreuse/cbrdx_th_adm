package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposContratos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/listasTiposContratos")
public class ListasTiposContratosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasTiposContratos";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposContratos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposContratos[] parametros = restTemplate.getForObject(serviceUrl, ListasTiposContratos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposContratos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ListasTiposContratos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasTiposContratos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposContratos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasTiposContratos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposContratos create(@RequestBody ListasTiposContratos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ListasTiposContratos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposContratos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
