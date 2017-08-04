package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosTiposCentralesRiesgos;
import com.ciberdix.th.model.VTercerosTiposCentralesRiesgos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/tercerosTiposCentralesRiesgos")
@CrossOrigin
public class TercerosTiposCentralesRiesgosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tercerosTiposCentralesRiesgos/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosTiposCentralesRiesgos> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosTiposCentralesRiesgos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosTiposCentralesRiesgos> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VTercerosTiposCentralesRiesgos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosTiposCentralesRiesgos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VTercerosTiposCentralesRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroTipo/{id}")
    List<VTercerosTiposCentralesRiesgos> findByIdTerceroTipo(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "terceroTipo/" + id, VTercerosTiposCentralesRiesgos[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosTiposCentralesRiesgos create(@RequestBody TercerosTiposCentralesRiesgos o) {
        return restTemplate.postForObject(serviceUrl, o, TercerosTiposCentralesRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosTiposCentralesRiesgos o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
