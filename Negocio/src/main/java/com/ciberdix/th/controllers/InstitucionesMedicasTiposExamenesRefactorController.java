package com.ciberdix.th.controllers;

import com.ciberdix.th.model.InstitucionesMedicasTiposExamenes;
import com.ciberdix.th.model.VInstitucionesMedicasTiposExamenes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/institucionesMedicasTiposExamenes")
@CrossOrigin
public class InstitucionesMedicasTiposExamenesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/institucionesMedicasTiposExamenes/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VInstitucionesMedicasTiposExamenes> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VInstitucionesMedicasTiposExamenes[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VInstitucionesMedicasTiposExamenes> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VInstitucionesMedicasTiposExamenes[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VInstitucionesMedicasTiposExamenes findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VInstitucionesMedicasTiposExamenes.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/institucionMedica/{id}")
    List<VInstitucionesMedicasTiposExamenes> findByInstitucionMedica(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "institucionMedica/" + id, VInstitucionesMedicasTiposExamenes[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tipoExamenMedico/{id}")
    List<VInstitucionesMedicasTiposExamenes> findByTipoExamenMedico(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "tipoExamenMedico/" + id, VInstitucionesMedicasTiposExamenes[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    InstitucionesMedicasTiposExamenes create(@RequestBody InstitucionesMedicasTiposExamenes o) {
        return restTemplate.postForObject(serviceUrl, o, InstitucionesMedicasTiposExamenes.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody InstitucionesMedicasTiposExamenes o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
