package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.RiesgosTipos;
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
@RequestMapping("/api/riesgosTipos")
@Api(value = "riesgosTipos", description = "Riesgos Tipos")
public class RiesgosTiposRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/riesgosTipos";

    @RequestMapping(method = RequestMethod.GET)
    List<RiesgosTipos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        RiesgosTipos[] parametros = restTemplate.getForObject(serviceUrl, RiesgosTipos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<RiesgosTipos> findByEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        RiesgosTipos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", RiesgosTipos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RiesgosTipos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, RiesgosTipos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    RiesgosTipos create(@RequestBody RiesgosTipos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, RiesgosTipos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RiesgosTipos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
