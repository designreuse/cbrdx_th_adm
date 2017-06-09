package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 8/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/tercerosPublicaciones")
public class TercerosPublicacionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosPublicaciones> findAll() {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/";
        RestTemplate restTemplate = new RestTemplate();
        TercerosPublicaciones[] params = restTemplate.getForObject(serviceUrl, TercerosPublicaciones[].class);
        return Arrays.asList(params);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosPublicaciones findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, TercerosPublicaciones.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosPublicaciones create(@RequestBody TercerosPublicaciones o) {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, o, TercerosPublicaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosPublicaciones o) {
        String serviceUrl = baseUrl + "/api/tercerosPublicaciones/";
        RestTemplate restTemplate = new RestTemplate();
        Terceros t = restTemplate.getForObject(baseUrl + "/api/terceros/" + o.getIdTercero() ,Terceros.class);
        Publicaciones p = restTemplate.getForObject(baseUrl + "/api/publicaciones/" + o.getIdPublicacion(), Publicaciones.class);
        VRequerimientos r = restTemplate.getForObject(baseUrl + "/api/requerimientos/" + p.getIdRequerimiento(),VRequerimientos.class);
        if(o.getIndicadorFinalizado() == null){
            o.setIndicadorFinalizado(false);
        }
        if (o.getIndicadorFinalizado()){
            UtilitiesController.sendMail(t.getCorreoElectronico(),"Bienvenido al proceso de Selección","<h2>The haz postulado a la vacante " + r.getCargo() + "</h2><br/><p>Hola " + t.getPrimerNombre() + " " + t.getSegundoNombre() + " " + t.getPrimerApellido() + " " + t.getSegundoApellido() + "</p>");
        }
        restTemplate.put(serviceUrl, o);
    }

}