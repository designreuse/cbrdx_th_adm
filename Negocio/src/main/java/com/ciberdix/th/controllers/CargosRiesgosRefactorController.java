package com.ciberdix.th.controllers;

import com.ciberdix.th.model.CargosRiesgos;
import com.ciberdix.th.model.VCargosRiesgos;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/cargosRiesgos")
@Api(value = "cargosRiesgos", description = "Cargos Riesgos")
public class CargosRiesgosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/cargosRiesgos/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosRiesgos> findAll() {
        VCargosRiesgos[] parametros = restTemplate.getForObject(serviceUrl, VCargosRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosRiesgos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VCargosRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<VCargosRiesgos> findByIdCargo(@PathVariable Integer id) {
        VCargosRiesgos[] parametros = restTemplate.getForObject(serviceUrl + "buscarCargo/" + id, VCargosRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cargoTipoRiesgo/{idCargo}/{idTipoRiesgo}")
    List<VCargosRiesgos> findByIdCargo(@PathVariable Integer idCargo, @PathVariable Integer idTipoRiesgo) {
        VCargosRiesgos[] parametros = restTemplate.getForObject(serviceUrl + "cargoTipoRiesgo/" + idCargo + "/" + idTipoRiesgo, VCargosRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosRiesgos create(@RequestBody CargosRiesgos obj){
        return restTemplate.postForObject(serviceUrl, obj, CargosRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosRiesgos obj){
        restTemplate.put(serviceUrl, obj);
    }
}
