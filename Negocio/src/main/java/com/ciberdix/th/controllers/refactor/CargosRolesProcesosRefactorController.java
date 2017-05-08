package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.CargosRolesProcesos;
import com.ciberdix.th.model.refactor.VCargosRolesProcesos;
import com.ciberdix.th.model.refactor.VListaRolesProcesoCargoRolesProceso;
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
@RequestMapping("/api/cargosRolesProcesos")
@Api(value = "cargosRolesProcesos", description = "cargosRolesProcesos")
public class CargosRolesProcesosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargosRolesProcesos";

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosRolesProcesos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VCargosRolesProcesos[] parametros = restTemplate.getForObject(serviceUrl, VCargosRolesProcesos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosRolesProcesos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VCargosRolesProcesos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCargosRolesProcesos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VCargosRolesProcesos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VCargosRolesProcesos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<VCargosRolesProcesos> findByIdCargo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VCargosRolesProcesos[] parametros = restTemplate.getForObject(serviceUrl + "/buscarCargo/" + id, VCargosRolesProcesos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarRolesProceso/{idCargo}")
    List<VListaRolesProcesoCargoRolesProceso> findAllByIdCargo(@PathVariable Integer idCargo){
        RestTemplate restTemplate = new RestTemplate();
        VListaRolesProcesoCargoRolesProceso[] parametros = restTemplate.getForObject(serviceUrl + "/buscarRolesProceso/" + idCargo, VListaRolesProcesoCargoRolesProceso[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosRolesProcesos create(@RequestBody CargosRolesProcesos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CargosRolesProcesos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosRolesProcesos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
