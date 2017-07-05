package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.TercerosCargos;
import com.ciberdix.th.model.VTercerosCargos;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/tercerosCargos")
@Api(value = "tercerosCargos", description = "Cargos del Tercero")
public class TercerosCargosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosCargos";

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosCargos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosCargos[] parametros = restTemplate.getForObject(serviceUrl, VTercerosCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosCargos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VTercerosCargos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarEstructuraCargo/{id}")
    List<VTercerosCargos> findByEstructuraCargo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "/buscarEstructuraCargo/" + id, VTercerosCargos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarEstructura/{id}")
    List<VTercerosCargos> findByEstructura(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "/buscarEstructura/" + id, VTercerosCargos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosCargos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosCargos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VTercerosCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<VTercerosCargos> findByIdCargo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "/buscarCargo/" + id, VTercerosCargos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{id}")
    List<VTercerosCargos> findByIdTercero(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "/tercero/" + id, VTercerosCargos[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosCargos create(@RequestBody TercerosCargos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, TercerosCargos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosCargos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
