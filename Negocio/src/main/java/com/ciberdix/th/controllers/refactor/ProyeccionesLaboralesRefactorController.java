package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ProyeccionesLaborales;
import com.ciberdix.th.model.refactor.VProyeccionLaboral;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/proyeccionesLaborales")
@Api(value = "proyeccionesLaborales", description = "proyeccionesLaborales")
public class ProyeccionesLaboralesRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/proyeccionesLaborales";

    @RequestMapping(method = RequestMethod.GET)
    List<VProyeccionLaboral> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VProyeccionLaboral[] parametros = restTemplate.getForObject(serviceUrl, VProyeccionLaboral[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ProyeccionesLaborales findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ProyeccionesLaborales.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarArea/{id}")
    List<VProyeccionLaboral> findAll(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        VProyeccionLaboral[] parametros = restTemplate.getForObject(serviceUrl + "/buscarArea/" + id, VProyeccionLaboral[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/generarProyeccion/{idUsuario}")
    Integer runProc(@PathVariable Integer idUsuario) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/generarProyeccion/" + idUsuario, Integer.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionesLaborales create(@RequestBody ProyeccionesLaborales request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ProyeccionesLaborales.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProyeccionesLaborales request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ProyeccionesLaborales.class);
    }
}
