package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.CentralesRiesgos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 13/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/centralesRiesgos")
public class CentralesRiesgosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/centralesRiesgos";

    @RequestMapping(method = RequestMethod.GET)
    List<CentralesRiesgos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        CentralesRiesgos[] parametros = restTemplate.getForObject(serviceUrl, CentralesRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    CentralesRiesgos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, CentralesRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<CentralesRiesgos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        CentralesRiesgos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", CentralesRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    CentralesRiesgos create(@RequestBody CentralesRiesgos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CentralesRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CentralesRiesgos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
