package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.DocumentosTerceros;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/documentosTerceros")
public class DocumentosTercerosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/documentosTerceros";

    @RequestMapping(method = RequestMethod.GET)
    List<DocumentosTerceros> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        DocumentosTerceros[] parametros = restTemplate.getForObject(serviceUrl, DocumentosTerceros[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    DocumentosTerceros findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, DocumentosTerceros.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<DocumentosTerceros> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        DocumentosTerceros[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", DocumentosTerceros[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/clasificacionDocumento/{id}")
    List<DocumentosTerceros> findByIdClasificacionDocumento(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        DocumentosTerceros[] parametros = restTemplate.getForObject(serviceUrl + "/clasificacionDocumento/" + id, DocumentosTerceros[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    DocumentosTerceros create(@RequestBody DocumentosTerceros o) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, o, DocumentosTerceros.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody DocumentosTerceros o) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o, DocumentosTerceros.class);
    }

}
