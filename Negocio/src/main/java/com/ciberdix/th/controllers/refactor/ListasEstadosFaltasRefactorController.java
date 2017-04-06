package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasEstadosFaltas;
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
@RequestMapping("/api/listasEstadosFaltas")
@Api(value = "listasEstadosFaltas", description = "Listas Estados Faltas")
public class ListasEstadosFaltasRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasEstadosFaltas";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosFaltas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstadosFaltas[] parametros = restTemplate.getForObject(serviceUrl, ListasEstadosFaltas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosFaltas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ListasEstadosFaltas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasEstadosFaltas> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstadosFaltas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasEstadosFaltas[].class);
        return Arrays.asList(parametros);
    }
}
