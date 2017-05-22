package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.EstructuraOrganizacionalCargos;
import com.ciberdix.th.model.VEstructuraOrganizacionalCargos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/estructuraOrganizacionalCargos")
public class EstructuraOrganizacionalCargosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/estructuraOrganizacionalCargos";

    @RequestMapping(method = RequestMethod.GET)
    List<VEstructuraOrganizacionalCargos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraOrganizacionalCargos[] parametros = restTemplate.getForObject(serviceUrl, VEstructuraOrganizacionalCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VEstructuraOrganizacionalCargos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VEstructuraOrganizacionalCargos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VEstructuraOrganizacionalCargos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraOrganizacionalCargos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VEstructuraOrganizacionalCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<VEstructuraOrganizacionalCargos> findByIdCargo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VEstructuraOrganizacionalCargos[] parametros = restTemplate.getForObject(serviceUrl + "/buscarCargo/" + id, VEstructuraOrganizacionalCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargoEstructura/{idCargo}/{idEstructura}")
    VEstructuraOrganizacionalCargos findAllByIdCAndIdE(@PathVariable Integer idCargo, @PathVariable Integer idEstructura) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/buscarCargoEstructura/" + idCargo + "/" + idEstructura, VEstructuraOrganizacionalCargos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstructuraOrganizacionalCargos create(@RequestBody EstructuraOrganizacionalCargos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, EstructuraOrganizacionalCargos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody EstructuraOrganizacionalCargos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
