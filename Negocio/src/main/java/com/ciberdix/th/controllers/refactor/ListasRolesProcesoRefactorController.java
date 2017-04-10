package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasRolesProceso;
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
@RequestMapping("/api/listasRolesProceso")
@Api(value = "listasRolesProceso", description = "listasRolesProceso")
public class ListasRolesProcesoRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasRolesProceso";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasRolesProceso> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasRolesProceso[] parametros = restTemplate.getForObject(serviceUrl, ListasRolesProceso[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasRolesProceso findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ListasRolesProceso.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasRolesProceso> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasRolesProceso[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasRolesProceso[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasRolesProceso create(@RequestBody ListasRolesProceso obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ListasRolesProceso.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasRolesProceso obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
