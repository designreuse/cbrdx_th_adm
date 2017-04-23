package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.RolesFuncionalidadesControles;
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
@RequestMapping("/api/rolesFuncionalidadesControles")
public class RolesFuncionalidadesControlesRefactorController {
    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<RolesFuncionalidadesControles> findAll() {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidadesControles";
        RestTemplate restTemplate = new RestTemplate();
        RolesFuncionalidadesControles[] parametros = restTemplate.getForObject(serviceUrl, RolesFuncionalidadesControles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<RolesFuncionalidadesControles> findEnabled() {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        RolesFuncionalidadesControles[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", RolesFuncionalidadesControles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path="/{id}")
    RolesFuncionalidadesControles findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, RolesFuncionalidadesControles.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    RolesFuncionalidadesControles create(@RequestBody RolesFuncionalidadesControles request) {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, RolesFuncionalidadesControles.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RolesFuncionalidadesControles request) {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, RolesFuncionalidadesControles.class);
    }
}
