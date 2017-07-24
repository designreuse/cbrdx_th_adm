package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosNovedadesActividades;
import com.ciberdix.th.model.VTercerosNovedadesActividades;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/tercerosNovedadesActividades")
@CrossOrigin
public class TercerosNovedadesActividadesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tercerosNovedadesActividades/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosNovedadesActividades> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosNovedadesActividades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosNovedadesActividades findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VTercerosNovedadesActividades.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosNovedadesActividades> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VTercerosNovedadesActividades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroNovedad/{id}")
    List<VTercerosNovedadesActividades> findByIdTerceroNovedad(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "terceroNovedad/" + id, VTercerosNovedadesActividades[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosNovedadesActividades create(@RequestBody TercerosNovedadesActividades o) {
        return restTemplate.postForObject(serviceUrl, o, TercerosNovedadesActividades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosNovedadesActividades o) {
        VTercerosNovedadesActividades tna = findOne(o.getIdTerceroNovedadActividad());
        o.setFechaCreacion(tna.getFechaCreacion());
        restTemplate.put(serviceUrl, o);
    }

}
