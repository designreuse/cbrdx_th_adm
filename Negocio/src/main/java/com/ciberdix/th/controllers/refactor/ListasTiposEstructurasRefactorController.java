package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposEstructuras;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/listasTiposEstructuras")
public class ListasTiposEstructurasRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/estructuraFisica";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposEstructuras> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposEstructuras[] parametros = restTemplate.getForObject(serviceUrl, ListasTiposEstructuras[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposEstructuras findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ListasTiposEstructuras.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasTiposEstructuras> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposEstructuras[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasTiposEstructuras[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposEstructuras create(@RequestBody ListasTiposEstructuras obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ListasTiposEstructuras.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposEstructuras obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
