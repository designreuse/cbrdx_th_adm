package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.Funcionalidades;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 22/04/2017.
 */

@RestController
@RequestMapping("/api/funcionalidades")
@CrossOrigin
public class FuncionalidadesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<Funcionalidades> findAll() {
        String serviceUrl = baseUrl + "/api/funcionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        Funcionalidades[] listasClasificaciones = restTemplate.getForObject(serviceUrl, Funcionalidades[].class);
        return Arrays.asList(listasClasificaciones);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/id/{idFuncionalidad}")
    Funcionalidades findOne(@PathVariable Integer idFuncionalidad) {
        String serviceUrl = baseUrl + "/api/funcionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "id/" + idFuncionalidad, Funcionalidades.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<Funcionalidades> findEnabled() {
        String serviceUrl = baseUrl + "/api/funcionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        Funcionalidades[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", Funcionalidades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Funcionalidades create(@RequestBody Funcionalidades f) {
        String serviceUrl = baseUrl + "/api/funcionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, f, Funcionalidades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Funcionalidades f) {
        String serviceUrl = baseUrl + "/api/funcionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, f);
    }

}
