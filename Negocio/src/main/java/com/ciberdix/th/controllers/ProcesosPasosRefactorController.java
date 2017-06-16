package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.ProcesosPasos;
import com.ciberdix.th.model.VProcesosPasos;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 5/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/procesosPasos")
public class ProcesosPasosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/procesosPasos";

    @RequestMapping(method = RequestMethod.GET)
    List<VProcesosPasos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VProcesosPasos[] cargosCompetencias = restTemplate.getForObject(serviceUrl, VProcesosPasos[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProcesosPasos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VProcesosPasos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proceso/{idProceso}")
    List<VProcesosPasos> findAllByIdProceso(@PathVariable Integer idProceso) {
        RestTemplate restTemplate = new RestTemplate();
        VProcesosPasos[] cargosCompetencias = restTemplate.getForObject(serviceUrl + "/proceso/" + idProceso, VProcesosPasos[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/procesoOrden/{idProceso}")
    List<VProcesosPasos> findAllByIdProcesoOrden(@PathVariable Integer idProceso) {
        RestTemplate restTemplate = new RestTemplate();
        VProcesosPasos[] cargosCompetencias = restTemplate.getForObject(serviceUrl + "/procesoOrden/" + idProceso, VProcesosPasos[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/procesoOrden/externoMixto/{idProceso}")
    List<VProcesosPasos> findAllByIdProcesoOrdenExternoMixto(@PathVariable Integer idProceso) {
        RestTemplate restTemplate = new RestTemplate();
        VProcesosPasos[] cargosCompetencias = restTemplate.getForObject(serviceUrl + "/procesoOrden/externoMixto/" + idProceso, VProcesosPasos[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/procesoOrden/internoMixto/{idProceso}")
    List<VProcesosPasos> findAllByIdProcesoOrdenInternoMixto(@PathVariable Integer idProceso) {
        RestTemplate restTemplate = new RestTemplate();
        VProcesosPasos[] cargosCompetencias = restTemplate.getForObject(serviceUrl + "/procesoOrden/internoMixto/" + idProceso, VProcesosPasos[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codigo/{codigo}")
    List<VProcesosPasos> findAllByCodigo(@PathVariable String codigo) {
        RestTemplate restTemplate = new RestTemplate();
        VProcesosPasos[] cargosCompetencias = restTemplate.getForObject(serviceUrl + "/codigo/" + codigo, VProcesosPasos[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/ultimoPaso/{idProceso}")
    VProcesosPasos queryLastPaso(@PathVariable Integer idProceso) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/ultimoPaso/" + idProceso, VProcesosPasos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesosPasos create(@RequestBody ProcesosPasos obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ProcesosPasos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesosPasos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
