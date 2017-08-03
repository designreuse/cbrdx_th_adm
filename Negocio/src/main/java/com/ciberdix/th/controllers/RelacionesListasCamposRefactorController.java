package com.ciberdix.th.controllers;

import com.ciberdix.th.model.RelacionesListasCampos;
import com.ciberdix.th.model.VRelacionesListasCampos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 27/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/relacionesListasCampos")
public class RelacionesListasCamposRefactorController {

    @Value("${business.url}")
    String businessURL;

    @Value("${domain.url}")
    String domainURL;

    RestTemplate restTemplate;

    private String serviceUrl;

    @PostConstruct
    void init() {
        serviceUrl = domainURL + "/api/relacionesListasCampos";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VRelacionesListasCampos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VRelacionesListasCampos[] parametros = restTemplate.getForObject(serviceUrl, VRelacionesListasCampos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRelacionesListasCampos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VRelacionesListasCampos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VRelacionesListasCampos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VRelacionesListasCampos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VRelacionesListasCampos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/relacionLista/{id}")
    List<VRelacionesListasCampos> findRelacionLista(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VRelacionesListasCampos[] parametros = restTemplate.getForObject(serviceUrl + "/relacionLista/" + id, VRelacionesListasCampos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/funcionalidadControl/{id}")
    List<VRelacionesListasCampos> findFuncionalidadControl(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VRelacionesListasCampos[] parametros = restTemplate.getForObject(serviceUrl + "/funcionalidadControl/" + id, VRelacionesListasCampos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    RelacionesListasCampos create(@RequestBody RelacionesListasCampos obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, RelacionesListasCampos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RelacionesListasCampos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
