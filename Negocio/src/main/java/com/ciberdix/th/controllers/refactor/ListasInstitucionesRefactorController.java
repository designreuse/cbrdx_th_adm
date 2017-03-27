package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposReferencias;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/listasInstituciones")
@CrossOrigin
public class ListasInstitucionesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasInstituciones";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposReferencias> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposReferencias[] parametros = restTemplate.getForObject(serviceUrl, ListasTiposReferencias[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposReferencias> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposReferencias[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasTiposReferencias[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposReferencias create(@RequestBody ListasTiposReferencias request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasTiposReferencias.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposReferencias request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasTiposReferencias.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLista}")
    ListasTiposReferencias findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposReferencias parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idLista, ListasTiposReferencias.class);
        return parametro;
    }
}
