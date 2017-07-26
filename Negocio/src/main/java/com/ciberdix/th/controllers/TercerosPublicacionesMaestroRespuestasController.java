package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosPublicacionesMaestroRespuestas;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
@CrossOrigin
@RestController
@RequestMapping("/api/tercerosPublicacionesMaestrosRespuestas")
public class TercerosPublicacionesMaestroRespuestasController {

    @Value("${domain.url}")
    private String serviceUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosPublicacionesMaestroRespuestas> listarTercerosPublicacionesMaestroRespuestas() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosPublicacionesMaestroRespuestas[] TercerosPublicacionesMaestroRespuestas = restTemplate.getForObject(serviceUrl + "api/tercerosPublicacionesMaestroRespuestas", TercerosPublicacionesMaestroRespuestas[].class);
        return Arrays.asList(TercerosPublicacionesMaestroRespuestas);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    TercerosPublicacionesMaestroRespuestas obtenerActividadEconomica(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        TercerosPublicacionesMaestroRespuestas actividad = restTemplate.getForObject(serviceUrl + "api/tercerosPublicacionesMaestroRespuestas/" + id, TercerosPublicacionesMaestroRespuestas.class);

        return actividad;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroPublicacion/{id}")
    List<TercerosPublicacionesMaestroRespuestas> listarTercerosPublicacionesMaestroRespuestas(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        TercerosPublicacionesMaestroRespuestas[] TercerosPublicacionesMaestroRespuestas = restTemplate.getForObject(serviceUrl + "api/tercerosPublicacionesMaestroRespuestas/terceroPublicacion/" + id, TercerosPublicacionesMaestroRespuestas[].class);
        return Arrays.asList(TercerosPublicacionesMaestroRespuestas);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosPublicacionesMaestroRespuestas crearActividadEconomica(@RequestBody TercerosPublicacionesMaestroRespuestas obj) {
        RestTemplate restTemplate = new RestTemplate();
        TercerosPublicacionesMaestroRespuestas tercero = restTemplate.postForObject(serviceUrl + "api/tercerosPublicacionesMaestroRespuestas", obj, TercerosPublicacionesMaestroRespuestas.class);

        return tercero;
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarActividadEconomica(@RequestBody TercerosPublicacionesMaestroRespuestas obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "api/tercerosPublicacionesMaestroRespuestas", obj);
    }
}
