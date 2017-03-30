package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasNivelesCargos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/listasNivelesCargos")
@CrossOrigin
public class ListasNivelesCargosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasNivelesCargos";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasNivelesCargos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasNivelesCargos[] parametros = restTemplate.getForObject(serviceUrl, ListasNivelesCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasNivelesCargos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasNivelesCargos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasNivelesCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasNivelesCargos create(@RequestBody ListasNivelesCargos request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasNivelesCargos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasNivelesCargos request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasNivelesCargos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLista}")
    ListasNivelesCargos findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        ListasNivelesCargos parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idLista, ListasNivelesCargos.class);
        return parametro;
    }
}
