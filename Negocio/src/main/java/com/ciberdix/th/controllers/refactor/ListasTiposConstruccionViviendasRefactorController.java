package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposConstruccionViviendas;
import io.swagger.annotations.Api;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@RestController
@RequestMapping("/api/listasTiposConstruccionViviendas")
@CrossOrigin
@Api(value = "listasTiposConstruccionViviendas", description = "Listas Tipos Construcción de Viviendas")
public class ListasTiposConstruccionViviendasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasTiposConstruccionViviendas";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposConstruccionViviendas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposConstruccionViviendas[] parametros = restTemplate.getForObject(serviceUrl, ListasTiposConstruccionViviendas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposConstruccionViviendas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposConstruccionViviendas parametros = restTemplate.getForObject(serviceUrl + "/" + id, ListasTiposConstruccionViviendas.class);
        return parametros;
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposConstruccionViviendas create(@RequestBody ListasTiposConstruccionViviendas request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasTiposConstruccionViviendas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposConstruccionViviendas request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasTiposConstruccionViviendas.class);
    }
}
