package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.Cargos;
import com.ciberdix.th.model.refactor.VCargos;
import com.ciberdix.th.model.refactor.VCargosB;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/cargos")
@Api(value = "cargos", description = "Cargos")
public class CargosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargos";

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosB> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VCargosB[] parametros = restTemplate.getForObject(serviceUrl, VCargosB[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosB findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VCargosB.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCargosB> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VCargosB[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VCargosB[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Cargos create(@RequestBody Cargos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, Cargos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Cargos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
