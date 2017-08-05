package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosTiposFuncionalidadesListas;
import com.ciberdix.th.model.VTercerosTiposFuncionalidadesListas;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/tercerosTiposFuncionalidadesListas")
@CrossOrigin
public class TercerosTiposFuncionalidadesListasRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tercerosTiposFuncionalidadesListas/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosTiposFuncionalidadesListas> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosTiposFuncionalidadesListas[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosTiposFuncionalidadesListas> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VTercerosTiposFuncionalidadesListas[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosTiposFuncionalidadesListas findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VTercerosTiposFuncionalidadesListas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroTipoFuncionalidad/{id}")
    List<VTercerosTiposFuncionalidadesListas> findByIdTerceroTipoFuncionalidad(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "terceroTipoFuncionalidad/" + id, VTercerosTiposFuncionalidadesListas[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/seccion/{id}")
    List<VTercerosTiposFuncionalidadesListas> findByIdSeccion(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "seccion/" + id, VTercerosTiposFuncionalidadesListas[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/control/{id}")
    List<VTercerosTiposFuncionalidadesListas> findByIdControl(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "control/" + id, VTercerosTiposFuncionalidadesListas[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosTiposFuncionalidadesListas create(@RequestBody TercerosTiposFuncionalidadesListas o) {
        return restTemplate.postForObject(serviceUrl, o, TercerosTiposFuncionalidadesListas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosTiposFuncionalidadesListas o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
