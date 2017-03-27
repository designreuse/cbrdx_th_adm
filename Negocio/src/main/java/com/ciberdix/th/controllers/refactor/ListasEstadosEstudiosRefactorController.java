package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasAreasEstudios;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/listasEstadosEstudios")
@CrossOrigin
public class ListasEstadosEstudiosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasEstadosEstudios";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasAreasEstudios> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasAreasEstudios[] parametros = restTemplate.getForObject(serviceUrl, ListasAreasEstudios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasAreasEstudios> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasAreasEstudios[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasAreasEstudios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasAreasEstudios create(@RequestBody ListasAreasEstudios request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasAreasEstudios.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasAreasEstudios request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasAreasEstudios.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLista}")
    ListasAreasEstudios findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        ListasAreasEstudios parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idLista, ListasAreasEstudios.class);
        return parametro;
    }
}
