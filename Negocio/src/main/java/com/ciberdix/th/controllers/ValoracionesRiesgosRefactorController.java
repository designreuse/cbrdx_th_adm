package com.ciberdix.th.controllers;

import com.ciberdix.th.model.VValoracionesRiesgos;
import com.ciberdix.th.model.ValoracionesRiesgos;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 04/08/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/valoracionesRiesgos")
@Api(value = "valoracionesRiesgos", description = "Valoraciones Riesgos")
public class ValoracionesRiesgosRefactorController {

    @Value("${domain.url}")
    private String serviceUrl;

    RestTemplate restTemplate;

    @PostConstruct
    void init() {
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VValoracionesRiesgos> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "/api/valoracionesRiesgos", VValoracionesRiesgos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VValoracionesRiesgos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + "/api/valoracionesRiesgos/" + id, VValoracionesRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    ValoracionesRiesgos create(@RequestBody ValoracionesRiesgos obj) {
        return restTemplate.postForObject(serviceUrl, obj, ValoracionesRiesgos.class);
    }
}
