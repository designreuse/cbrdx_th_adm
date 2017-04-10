package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.CargosRiesgos;
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
@RequestMapping("/api/cargosRiesgos")
@Api(value = "cargosRiesgos", description = "Cargos Riesgos")
public class CargosRiesgosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargosRiesgos";

    @RequestMapping(method = RequestMethod.GET)
    List<CargosRiesgos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        CargosRiesgos[] parametros = restTemplate.getForObject(serviceUrl, CargosRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    CargosRiesgos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, CargosRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<CargosRiesgos> findByIdCargo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        CargosRiesgos[] parametros = restTemplate.getForObject(serviceUrl + "/buscarCargo/" + id, CargosRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosRiesgos create(@RequestBody CargosRiesgos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CargosRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosRiesgos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
