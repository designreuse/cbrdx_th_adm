package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasEstadosEstudios;
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
    List<ListasEstadosEstudios> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstadosEstudios[] parametros = restTemplate.getForObject(serviceUrl, ListasEstadosEstudios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosEstudios> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstadosEstudios[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasEstadosEstudios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosEstudios create(@RequestBody ListasEstadosEstudios request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasEstadosEstudios.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasEstadosEstudios request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasEstadosEstudios.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLista}")
    ListasEstadosEstudios findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstadosEstudios parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idLista, ListasEstadosEstudios.class);
        return parametro;
    }
}
