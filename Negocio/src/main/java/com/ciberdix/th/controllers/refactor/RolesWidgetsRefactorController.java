package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.RolesWidgets;
import com.ciberdix.th.model.refactor.VRolesWidgets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 24/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/rolesWidgets")
public class RolesWidgetsRefactorController {
    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<VRolesWidgets> findAll() {
        String serviceUrl = baseUrl + "/api/rolesWidgets";
        RestTemplate restTemplate = new RestTemplate();
        VRolesWidgets[] parametros = restTemplate.getForObject(serviceUrl, VRolesWidgets[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VRolesWidgets> findEnabled() {
        String serviceUrl = baseUrl + "/api/rolesWidgets/";
        RestTemplate restTemplate = new RestTemplate();
        VRolesWidgets[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", VRolesWidgets[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarRol/{id}")
    List<VRolesWidgets> findByIdRol(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/rolesFuncionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        VRolesWidgets[] parametros = restTemplate.getForObject(serviceUrl + "buscarRol/" + id, VRolesWidgets[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path="/{id}")
    VRolesWidgets findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/rolesWidgets/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, VRolesWidgets.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    RolesWidgets create(@RequestBody RolesWidgets request) {
        String serviceUrl = baseUrl + "/api/rolesWidgets/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, RolesWidgets.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RolesWidgets request) {
        String serviceUrl = baseUrl + "/api/rolesWidgets/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, RolesWidgets.class);
    }
}
