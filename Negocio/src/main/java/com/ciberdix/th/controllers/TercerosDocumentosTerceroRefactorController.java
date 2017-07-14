package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.TercerosDocumentosTercero;
import com.ciberdix.th.model.VTercerosDocumentosTercero;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/tercerosDocumentosTercero")
public class TercerosDocumentosTerceroRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosDocumentosTercero";

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosDocumentosTercero> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosDocumentosTercero[] parametros = restTemplate.getForObject(serviceUrl, VTercerosDocumentosTercero[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosDocumentosTercero> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosDocumentosTercero[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", VTercerosDocumentosTercero[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosDocumentosTercero findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VTercerosDocumentosTercero.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{id}")
    List<VTercerosDocumentosTercero> findByIdTercero(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosDocumentosTercero[] parametros = restTemplate.getForObject(serviceUrl + "/tercero/" + id, VTercerosDocumentosTercero[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/documentoTercero/{id}")
    List<VTercerosDocumentosTercero> findByIdDocumentoTercero(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosDocumentosTercero[] parametros = restTemplate.getForObject(serviceUrl + "/documentoTercero/" + id, VTercerosDocumentosTercero[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/adjunto/{id}")
    VTercerosDocumentosTercero findByIdAdjunto(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/adjunto/" + id, VTercerosDocumentosTercero.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/adjuntoVer/{id}/{idDoc}")
    VTercerosDocumentosTercero findByIdAdjuntoVer(@PathVariable Long id, @PathVariable Integer idDoc) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/adjuntoVer/" + id + "/" + idDoc, VTercerosDocumentosTercero.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosDocumentosTercero create(@RequestBody TercerosDocumentosTercero o) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, o, TercerosDocumentosTercero.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosDocumentosTercero o) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o);
    }

}
