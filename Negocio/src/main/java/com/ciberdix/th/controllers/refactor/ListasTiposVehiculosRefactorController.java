package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposVehiculos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/listasTiposVehiculos")
public class ListasTiposVehiculosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasTiposVehiculos";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposVehiculos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposVehiculos[] parametros = restTemplate.getForObject(serviceUrl, ListasTiposVehiculos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposVehiculos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposVehiculos parametros = restTemplate.getForObject(serviceUrl + "/" + id, ListasTiposVehiculos.class);
        return parametros;
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposVehiculos create(@RequestBody ListasTiposVehiculos request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasTiposVehiculos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposVehiculos request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasTiposVehiculos.class);
    }
}
