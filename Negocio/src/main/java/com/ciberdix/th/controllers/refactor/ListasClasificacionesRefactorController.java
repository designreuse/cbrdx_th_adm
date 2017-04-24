package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.ListasClasificaciones;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 22/04/2017.
 */

@RestController
@RequestMapping("/api/listasClasificaciones")
@CrossOrigin
public class ListasClasificacionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasClasificaciones> findAll() {
        String serviceUrl = baseUrl + "/api/listasClasificaciones/";
        RestTemplate restTemplate = new RestTemplate();
        ListasClasificaciones[] listasClasificaciones = restTemplate.getForObject(serviceUrl, ListasClasificaciones[].class);
        return Arrays.asList(listasClasificaciones);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/id/{idListaClasificacion}")
    ListasClasificaciones findOne(@PathVariable Integer idListaClasificacion) {
        String serviceUrl = baseUrl + "/api/listasClasificaciones/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "id/" + idListaClasificacion, ListasClasificaciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasClasificaciones> findEnabled() {
        String serviceUrl = baseUrl + "/api/listasClasificaciones/";
        RestTemplate restTemplate = new RestTemplate();
        ListasClasificaciones[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", ListasClasificaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/sec/{idListaClasificacion}")
    List<ListasClasificaciones> findByIdSec(@PathVariable Integer idListaClasificacion) {
        String serviceUrl = baseUrl + "/api/listasClasificaciones/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "sec/" + idListaClasificacion, ListasClasificaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cam/{idListaClasificacion}")
    List<ListasClasificaciones> findByIdCam(@PathVariable Integer idListaClasificacion) {
        String serviceUrl = baseUrl + "/api/listasClasificaciones/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "cam/" + idListaClasificacion, ListasClasificaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/sec")
    List<ListasClasificaciones> findBySec() {
        String serviceUrl = baseUrl + "/api/listasClasificaciones/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "sec/", ListasClasificaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cam")
    List<ListasClasificaciones> findByCam() {
        String serviceUrl = baseUrl + "/api/listasClasificaciones/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "cam/", ListasClasificaciones[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasClasificaciones create(@RequestBody ListasClasificaciones listasClasificaciones) {
        String serviceUrl = baseUrl + "/api/listasClasificaciones/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, listasClasificaciones, ListasClasificaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasClasificaciones listasClasificaciones) {
        String serviceUrl = baseUrl + "/api/listasClasificaciones/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, listasClasificaciones);
    }

}
