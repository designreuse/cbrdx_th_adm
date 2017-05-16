package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Riesgos;
import com.ciberdix.th.model.VRiesgos;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/riesgos")
@Api(value = "riesgos", description = "Riesgos")
public class RiesgosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/riesgos";

    @RequestMapping(method = RequestMethod.GET)
    List<VRiesgos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VRiesgos[] parametros = restTemplate.getForObject(serviceUrl, VRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VRiesgos> findByEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VRiesgos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRiesgos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    Riesgos create(@RequestBody Riesgos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, Riesgos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Riesgos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
