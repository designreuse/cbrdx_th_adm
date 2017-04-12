package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.RiesgosSubTipos;
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
@RequestMapping("/api/riesgosSubTipos")
@Api(value = "riesgosSubTipos", description = "Riesgos Sub Tipos")
public class RiesgosSubTiposRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/riesgosSubTipos";

    @RequestMapping(method = RequestMethod.GET)
    List<RiesgosSubTipos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        RiesgosSubTipos[] parametros = restTemplate.getForObject(serviceUrl, RiesgosSubTipos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<RiesgosSubTipos> findByEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        RiesgosSubTipos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", RiesgosSubTipos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RiesgosSubTipos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, RiesgosSubTipos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    RiesgosSubTipos create(@RequestBody RiesgosSubTipos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, RiesgosSubTipos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RiesgosSubTipos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
