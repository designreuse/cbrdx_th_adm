package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposElementos;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
@RestController
@Transactional
@RequestMapping("/api/listasTiposElementos")
@CrossOrigin
public class ListasTiposElementosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasTiposElementos";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposElementos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposElementos[] parametros = restTemplate.getForObject(serviceUrl, ListasTiposElementos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasTiposElementos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposElementos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasTiposElementos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposElementos create(@RequestBody ListasTiposElementos obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ListasTiposElementos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposElementos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
