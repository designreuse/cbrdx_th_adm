package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposEstudios;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/listasTiposEstudios")
@CrossOrigin
public class ListasTiposEstudiosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasTiposEstudios";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposEstudios> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposEstudios[] parametros = restTemplate.getForObject(serviceUrl, ListasTiposEstudios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposEstudios> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposEstudios[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasTiposEstudios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposEstudios create(@RequestBody ListasTiposEstudios request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasTiposEstudios.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposEstudios request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasTiposEstudios.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLista}")
    ListasTiposEstudios findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposEstudios parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idLista, ListasTiposEstudios.class);
        return parametro;
    }
}
