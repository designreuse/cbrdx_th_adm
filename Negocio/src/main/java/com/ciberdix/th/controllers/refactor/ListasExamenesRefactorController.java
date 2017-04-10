package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasExamenes;
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
@RequestMapping("/api/listasExamenes")
@Api(value = "listasExamenes", description = "listasExamenes")
public class ListasExamenesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasExamenes";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasExamenes> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasExamenes[] parametros = restTemplate.getForObject(serviceUrl, ListasExamenes[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasExamenes findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ListasExamenes.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasExamenes> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasExamenes[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasExamenes[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasExamenes create(@RequestBody ListasExamenes obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ListasExamenes.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasExamenes obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
