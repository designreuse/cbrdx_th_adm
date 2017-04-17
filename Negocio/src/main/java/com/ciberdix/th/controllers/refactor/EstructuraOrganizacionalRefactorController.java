package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.EstructuraOrganizacional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/EstructuraOrganizacional")
public class EstructuraOrganizacionalRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/EstructuraOrganizacional";

    @RequestMapping(method = RequestMethod.GET)
    List<EstructuraOrganizacional> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        EstructuraOrganizacional[] parametros = restTemplate.getForObject(serviceUrl, EstructuraOrganizacional[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    EstructuraOrganizacional findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, EstructuraOrganizacional.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<EstructuraOrganizacional> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        EstructuraOrganizacional[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", EstructuraOrganizacional[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPadre/{id}")
    List<EstructuraOrganizacional> findByIdPadre(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        EstructuraOrganizacional[] parametros = restTemplate.getForObject(serviceUrl + "/buscarPadre/" + id, EstructuraOrganizacional[].class);
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
