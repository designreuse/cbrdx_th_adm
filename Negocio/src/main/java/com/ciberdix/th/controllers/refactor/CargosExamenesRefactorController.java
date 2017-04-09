package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.CargosExamenes;
import com.ciberdix.th.model.refactor.VCargosExamenes;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/cargosExamenes")
@Api(value = "cargosExamenes", description = "cargosExamenes")
public class CargosExamenesRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargosExamenes";

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosExamenes> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VCargosExamenes[] parametros = restTemplate.getForObject(serviceUrl, VCargosExamenes[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosExamenes findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VCargosExamenes.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosExamenes create(@RequestBody CargosExamenes obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CargosExamenes.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosExamenes obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
