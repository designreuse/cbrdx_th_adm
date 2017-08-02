package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TiposDatosContacto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/tiposDatosContacto")
public class TiposDatosContactoRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tiposDatosContacto/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<TiposDatosContacto> findAll() {
        TiposDatosContacto[] parametros = restTemplate.getForObject(serviceUrl, TiposDatosContacto[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TiposDatosContacto findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + "/" + id, TiposDatosContacto.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<TiposDatosContacto> findEnabled() {
        TiposDatosContacto[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", TiposDatosContacto[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    TiposDatosContacto create(@RequestBody TiposDatosContacto obj){
        return restTemplate.postForObject(serviceUrl, obj, TiposDatosContacto.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TiposDatosContacto obj){
        restTemplate.put(serviceUrl, obj);
    }
    
}
