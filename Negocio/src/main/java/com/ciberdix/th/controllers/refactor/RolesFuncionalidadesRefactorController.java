package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.RolesFuncionalidades;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 23/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/rolesFuncionalidades")
public class RolesFuncionalidadesRefactorController {
    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<RolesFuncionalidades> findAll() {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidades";
        RestTemplate restTemplate = new RestTemplate();
        RolesFuncionalidades[] parametros = restTemplate.getForObject(serviceUrl, RolesFuncionalidades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<RolesFuncionalidades> findEnabled() {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        RolesFuncionalidades[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", RolesFuncionalidades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path="/{id}")
    RolesFuncionalidades findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, RolesFuncionalidades.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    RolesFuncionalidades create(@RequestBody RolesFuncionalidades request) {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, RolesFuncionalidades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RolesFuncionalidades request) {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, RolesFuncionalidades.class);
    }
}
