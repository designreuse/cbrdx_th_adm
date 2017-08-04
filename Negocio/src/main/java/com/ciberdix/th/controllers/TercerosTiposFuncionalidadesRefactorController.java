package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosTiposFuncionalidades;
import com.ciberdix.th.model.VTercerosTiposFuncionalidades;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/tercerosTiposFuncionalidades")
@CrossOrigin
public class TercerosTiposFuncionalidadesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tercerosTiposFuncionalidades/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosTiposFuncionalidades> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosTiposFuncionalidades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosTiposFuncionalidades> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VTercerosTiposFuncionalidades[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosTiposFuncionalidades findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VTercerosTiposFuncionalidades.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroTipo/{id}")
    List<VTercerosTiposFuncionalidades> findByIdTerceroTipo(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "terceroTipo/" + id, VTercerosTiposFuncionalidades[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosTiposFuncionalidades create(@RequestBody TercerosTiposFuncionalidades o) {
        return restTemplate.postForObject(serviceUrl, o, TercerosTiposFuncionalidades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosTiposFuncionalidades o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
