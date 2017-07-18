package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Novedades;
import com.ciberdix.th.model.VNovedades;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */

@RestController
@RequestMapping("/api/novedades")
@CrossOrigin
public class NovedadesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/novedades/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VNovedades> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VNovedades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VNovedades findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VNovedades.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VNovedades> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VNovedades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tipoNovedad/{id}")
    List<VNovedades> findByIdTipoNovedad(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "tipoNovedad/" + id, VNovedades[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    Novedades create(@RequestBody Novedades o) {
        return restTemplate.postForObject(serviceUrl, o, Novedades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Novedades o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
