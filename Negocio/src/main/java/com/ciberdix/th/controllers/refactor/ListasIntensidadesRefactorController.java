package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasIntensidades;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/listasIntensidades")
@CrossOrigin
public class ListasIntensidadesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasIntensidades";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasIntensidades> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasIntensidades[] parametros = restTemplate.getForObject(serviceUrl, ListasIntensidades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasIntensidades> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasIntensidades[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasIntensidades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasIntensidades create(@RequestBody ListasIntensidades request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasIntensidades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasIntensidades request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasIntensidades.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLista}")
    ListasIntensidades findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        ListasIntensidades parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idLista, ListasIntensidades.class);
        return parametro;
    }
}
