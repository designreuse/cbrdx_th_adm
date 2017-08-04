package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosTiposDocumentosTerceros;
import com.ciberdix.th.model.VTercerosTiposDocumentosTerceros;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/tercerosTiposDocumentosTerceros")
@CrossOrigin
public class TercerosTiposDocumentosTercerosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tercerosTiposDocumentosTerceros/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosTiposDocumentosTerceros> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosTiposDocumentosTerceros[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosTiposDocumentosTerceros> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VTercerosTiposDocumentosTerceros[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosTiposDocumentosTerceros findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VTercerosTiposDocumentosTerceros.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroTipo/{id}")
    List<VTercerosTiposDocumentosTerceros> findByIdTerceroTipo(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "terceroTipo/" + id, VTercerosTiposDocumentosTerceros[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosTiposDocumentosTerceros create(@RequestBody TercerosTiposDocumentosTerceros o) {
        return restTemplate.postForObject(serviceUrl, o, TercerosTiposDocumentosTerceros.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosTiposDocumentosTerceros o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
