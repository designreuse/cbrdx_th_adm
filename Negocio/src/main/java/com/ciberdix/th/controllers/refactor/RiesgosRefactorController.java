package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.Riesgos;
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
    List<Riesgos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Riesgos[] parametros = restTemplate.getForObject(serviceUrl, Riesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Riesgos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, Riesgos.class);
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
