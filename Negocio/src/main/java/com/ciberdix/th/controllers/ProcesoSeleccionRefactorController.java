package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.ProcesoSeleccion;
import com.ciberdix.th.model.VProcesoSeleccion;
import com.ciberdix.th.model.VTerceros;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 8/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/procesoSeleccion")
public class ProcesoSeleccionRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/procesoSeleccion";

    @RequestMapping(method = RequestMethod.GET)
    List<VProcesoSeleccion> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccion[] cargosCompetencias = restTemplate.getForObject(serviceUrl, VProcesoSeleccion[].class);
        return Arrays.asList(cargosCompetencias);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idProcesoSeleccion}")
    VProcesoSeleccion findOne(@PathVariable Integer idProcesoSeleccion) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + idProcesoSeleccion, VProcesoSeleccion.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroPublicacion/{idPublicacion}")
    JSONObject findMalla(@PathVariable Integer idPublicacion) {
        RestTemplate restTemplate = new RestTemplate();
        Long idTercero;
        VProcesoSeleccion[] param = restTemplate.getForObject(serviceUrl + "/publicacion/" + idPublicacion, VProcesoSeleccion[].class);
        VTerceros[] ter = restTemplate.getForObject(globales.getUrl() + "/api/terceros", VTerceros[].class);

        JSONObject obj = new JSONObject();

        idTercero = param[0].getIdTercero();
        VProcesoSeleccion[] param1 = restTemplate.getForObject(serviceUrl + "/terceroPublicacion/" + idPublicacion + "/" + idTercero, VProcesoSeleccion[].class);

        return obj;
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccion create(@RequestBody ProcesoSeleccion obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ProcesoSeleccion.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccion obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
