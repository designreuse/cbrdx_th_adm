package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposFaltas;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 6/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/listasTiposFaltas")
@Api(value = "listasTiposFaltas", description = "Listas Tipos Faltas")
public class ListasTiposFaltasRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasTiposFaltas";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposFaltas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposFaltas[] parametros = restTemplate.getForObject(serviceUrl, ListasTiposFaltas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposFaltas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ListasTiposFaltas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasTiposFaltas> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposFaltas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasTiposFaltas[].class);
        return Arrays.asList(parametros);
    }
}
