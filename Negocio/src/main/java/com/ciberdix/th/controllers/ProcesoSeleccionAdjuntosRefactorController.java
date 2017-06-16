package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.ProcesoSeleccionAdjuntos;
import com.ciberdix.th.model.VProcesoSeleccionAdjuntos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 14/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/procesoSeleccionAdjuntos")
public class ProcesoSeleccionAdjuntosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/procesoSeleccionAdjuntos";

    @RequestMapping(method = RequestMethod.GET)
    List<VProcesoSeleccionAdjuntos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccionAdjuntos[] parametros = restTemplate.getForObject(serviceUrl, VProcesoSeleccionAdjuntos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProcesoSeleccionAdjuntos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VProcesoSeleccionAdjuntos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terPublicPaso/{idTerceroPublicacion}/{idProcesoPaso}")
    List<VProcesoSeleccionAdjuntos> findByTerPublicPaso(@PathVariable Integer idTerceroPublicacion, @PathVariable Integer idProcesoPaso) {
        RestTemplate restTemplate = new RestTemplate();
        VProcesoSeleccionAdjuntos[] parametros = restTemplate.getForObject(serviceUrl + "/terPublicPaso/" + idTerceroPublicacion + "/" + idProcesoPaso, VProcesoSeleccionAdjuntos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccionAdjuntos create(@RequestBody ProcesoSeleccionAdjuntos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ProcesoSeleccionAdjuntos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccionAdjuntos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
