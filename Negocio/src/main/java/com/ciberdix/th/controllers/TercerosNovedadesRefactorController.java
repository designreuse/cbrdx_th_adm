package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosNovedades;
import com.ciberdix.th.model.VTercerosNovedades;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/tercerosNovedades")
@CrossOrigin
public class TercerosNovedadesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tercerosNovedades/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosNovedades> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosNovedades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosNovedades findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VTercerosNovedades.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosNovedades> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VTercerosNovedades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/novedad/{id}")
    List<VTercerosNovedades> findByIdNovedad(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "novedad/" + id, VTercerosNovedades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{id}")
    List<VTercerosNovedades> findByIdTercero(@PathVariable Long id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "tercero/" + id, VTercerosNovedades[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosNovedades create(@RequestBody TercerosNovedades o) {
        return restTemplate.postForObject(serviceUrl, o, TercerosNovedades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosNovedades o) {
        VTercerosNovedades TN = findOne(o.getIdTerceroNovedad());
        o.setFechaReporte(TN.getFechaReporte());
        o.setIdTerceroReporta(TN.getIdTerceroReporta());
        restTemplate.put(serviceUrl, o);
    }

}
