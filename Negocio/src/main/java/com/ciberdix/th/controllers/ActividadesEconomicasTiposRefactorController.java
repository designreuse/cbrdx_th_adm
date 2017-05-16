package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.ActividadesEconomicasTipos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/actividadesEconomicasTipos")
public class ActividadesEconomicasTiposRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/actividadesEconomicasTipos/";

    @RequestMapping(method = RequestMethod.GET)
    List<ActividadesEconomicasTipos> queryCenrtosCostos() {
        RestTemplate restTemplate = new RestTemplate();
        ActividadesEconomicasTipos[] parametros = restTemplate.getForObject(serviceUrl, ActividadesEconomicasTipos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ActividadesEconomicasTipos createCentrosCostos(@RequestBody ActividadesEconomicasTipos request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ActividadesEconomicasTipos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateCentrosCostos(@RequestBody ActividadesEconomicasTipos request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ActividadesEconomicasTipos.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    ActividadesEconomicasTipos viewCentrosCostos(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        ActividadesEconomicasTipos parametro = restTemplate.getForObject(serviceUrl + IdParametro, ActividadesEconomicasTipos.class);
        return parametro;
    }
}