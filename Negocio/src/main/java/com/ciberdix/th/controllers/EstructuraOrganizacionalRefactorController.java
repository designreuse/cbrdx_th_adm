package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.EstructuraOrganizacional;
import com.ciberdix.th.model.VEstructuraOrganizacional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/estructuraOrganizacional")
public class EstructuraOrganizacionalRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/estructuraOrganizacional";

    @RequestMapping(method = RequestMethod.GET)
    List<VEstructuraOrganizacional> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraOrganizacional[] parametros = restTemplate.getForObject(serviceUrl, VEstructuraOrganizacional[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VEstructuraOrganizacional findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VEstructuraOrganizacional.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VEstructuraOrganizacional> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraOrganizacional[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VEstructuraOrganizacional[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPadre/{id}")
    List<VEstructuraOrganizacional> findByIdPadre(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraOrganizacional[] parametros = restTemplate.getForObject(serviceUrl + "/buscarPadre/" + id, VEstructuraOrganizacional[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTipo/{id}")
    List<EstructuraOrganizacional> findByIdTipo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        EstructuraOrganizacional[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTipo/" + id, EstructuraOrganizacional[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstructuraOrganizacional create(@RequestBody EstructuraOrganizacional obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, EstructuraOrganizacional.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody EstructuraOrganizacional obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
