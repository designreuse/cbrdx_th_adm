package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposViviendas;
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
@RequestMapping("/api/listasTiposViviendas")
@Api(value = "listasTiposViviendas", description = "Listas Tipos de Viviendas")
public class ListasTiposViviendasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasTiposViviendas";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposViviendas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposViviendas[] parametros = restTemplate.getForObject(serviceUrl, ListasTiposViviendas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposViviendas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposViviendas parametros = restTemplate.getForObject(serviceUrl + "/" + id, ListasTiposViviendas.class);
        return parametros;
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposViviendas create(@RequestBody ListasTiposViviendas request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasTiposViviendas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposViviendas request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasTiposViviendas.class);
    }
}
