package com.ciberdix.th.controllers;

import com.ciberdix.th.model.RolesFuncionalidadesControles;
import com.ciberdix.th.model.VRolesFuncionalidadesControles;
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
    List<VRolesFuncionalidadesControles> findAll() {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidadesControles";
        RestTemplate restTemplate = new RestTemplate();
        VRolesFuncionalidadesControles[] parametros = restTemplate.getForObject(serviceUrl, VRolesFuncionalidadesControles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VRolesFuncionalidadesControles> findEnabled() {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        VRolesFuncionalidadesControles[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", VRolesFuncionalidadesControles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarFuncionalidad//{idRol}/{idFuncionalidad}")
    List<VRolesFuncionalidadesControles> findByIdFuncionalidadControl(@PathVariable Integer idRol, @PathVariable Integer idFuncionalidad) {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        VRolesFuncionalidadesControles[] parametros = restTemplate.getForObject(serviceUrl + "buscarFuncionalidad/" + idRol + "/" + idFuncionalidad, VRolesFuncionalidadesControles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRolesFuncionalidadesControles findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, VRolesFuncionalidadesControles.class);
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
