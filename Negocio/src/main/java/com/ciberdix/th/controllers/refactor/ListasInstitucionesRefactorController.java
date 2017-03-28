package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasInstituciones;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/listasInstituciones")
@CrossOrigin
public class ListasInstitucionesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasInstituciones";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasInstituciones> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasInstituciones[] parametros = restTemplate.getForObject(serviceUrl, ListasInstituciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasInstituciones> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasInstituciones[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasInstituciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasInstituciones create(@RequestBody ListasInstituciones request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasInstituciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasInstituciones request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasInstituciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLista}")
    ListasInstituciones findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        ListasInstituciones parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idLista, ListasInstituciones.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarInstitucion/{nombreInstitucion}/")
    List<ListasInstituciones> findInstitution(@PathVariable String nombreInstitucion) {
        RestTemplate restTemplate = new RestTemplate();
        ListasInstituciones[] parametros = restTemplate.getForObject(serviceUrl + "/buscarInstitucion/" + nombreInstitucion + "/", ListasInstituciones[].class);
        return Arrays.asList(parametros);
    }
}
