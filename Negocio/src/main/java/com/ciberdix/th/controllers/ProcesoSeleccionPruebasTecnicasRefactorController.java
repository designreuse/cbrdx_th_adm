package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.ProcesoSeleccionPruebasTecnicas;
import com.ciberdix.th.model.VProcesoSeleccionPruebasTecnicas;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/procesoSeleccionPruebasTecnicas")
public class ProcesoSeleccionPruebasTecnicasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/procesoSeleccionPruebasTecnicas";

    @RequestMapping(method = RequestMethod.GET)
    List<VProcesoSeleccionPruebasTecnicas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccionPruebasTecnicas[] parametros = restTemplate.getForObject(serviceUrl, VProcesoSeleccionPruebasTecnicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProcesoSeleccionPruebasTecnicas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VProcesoSeleccionPruebasTecnicas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProcesoSeleccionPruebasTecnicas> findByIndicadorHabTrue() {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccionPruebasTecnicas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", VProcesoSeleccionPruebasTecnicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/procesoSeleccion/{id}")
    List<VProcesoSeleccionPruebasTecnicas> findByIdProcesoSeleccion(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccionPruebasTecnicas[] parametros = restTemplate.getForObject(serviceUrl + "/procesoSeleccion/" + id, VProcesoSeleccionPruebasTecnicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/pruebaTecnica/{id}")
    List<VProcesoSeleccionPruebasTecnicas> findByIdPruebaTecnica(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccionPruebasTecnicas[] parametros = restTemplate.getForObject(serviceUrl + "/pruebaTecnica/" + id, VProcesoSeleccionPruebasTecnicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccionPruebasTecnicas create(@RequestBody ProcesoSeleccionPruebasTecnicas o) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, o, ProcesoSeleccionPruebasTecnicas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccionPruebasTecnicas o) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o);
    }

}
