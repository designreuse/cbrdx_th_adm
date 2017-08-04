package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.InstitucionesMedicasEstructurasFisicas;
import com.ciberdix.th.model.VInstitucionesMedicasEstructurasFisicas;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 16/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/institucionesMedicasEstructurasFisicas")
public class InstitucionesMedicasEstructurasFisicasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/institucionesMedicasEstructurasFisicas";

    @RequestMapping(method = RequestMethod.GET)
    List<VInstitucionesMedicasEstructurasFisicas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VInstitucionesMedicasEstructurasFisicas[] parametros = restTemplate.getForObject(serviceUrl, VInstitucionesMedicasEstructurasFisicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VInstitucionesMedicasEstructurasFisicas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VInstitucionesMedicasEstructurasFisicas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VInstitucionesMedicasEstructurasFisicas> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VInstitucionesMedicasEstructurasFisicas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", VInstitucionesMedicasEstructurasFisicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/institucionMedica/{idInstitucionMedica}")
    List<VInstitucionesMedicasEstructurasFisicas> findByIdInstitucionMedica(@PathVariable Integer idInstitucionMedica) {
        RestTemplate restTemplate = new RestTemplate();
        VInstitucionesMedicasEstructurasFisicas[] parametros = restTemplate.getForObject(serviceUrl + "/institucionMedica/" + idInstitucionMedica, VInstitucionesMedicasEstructurasFisicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/estructuraFisica/{idEstructuraFisica}")
    List<VInstitucionesMedicasEstructurasFisicas> findByIdEstructuraFisica(@PathVariable Integer idEstructuraFisica) {
        RestTemplate restTemplate = new RestTemplate();
        VInstitucionesMedicasEstructurasFisicas[] parametros = restTemplate.getForObject(serviceUrl + "/estructuraFisica/" + idEstructuraFisica, VInstitucionesMedicasEstructurasFisicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    InstitucionesMedicasEstructurasFisicas create(@RequestBody InstitucionesMedicasEstructurasFisicas obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, InstitucionesMedicasEstructurasFisicas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody InstitucionesMedicasEstructurasFisicas obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
