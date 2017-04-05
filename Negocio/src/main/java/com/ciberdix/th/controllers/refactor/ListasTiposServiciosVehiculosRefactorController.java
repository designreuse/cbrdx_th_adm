package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposServiciosVehiculos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/listasTiposServiciosVehiculos")
public class ListasTiposServiciosVehiculosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasTiposServiciosVehiculos";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposServiciosVehiculos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposServiciosVehiculos[] parametros = restTemplate.getForObject(serviceUrl, ListasTiposServiciosVehiculos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposServiciosVehiculos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposServiciosVehiculos parametros = restTemplate.getForObject(serviceUrl + "/" + id, ListasTiposServiciosVehiculos.class);
        return parametros;
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposServiciosVehiculos create(@RequestBody ListasTiposServiciosVehiculos request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasTiposServiciosVehiculos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposServiciosVehiculos request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasTiposServiciosVehiculos.class);
    }
}
