package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.TercerosExperienciasLaborales;
import com.ciberdix.th.model.refactor.VTercerosExperienciasLaborales;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/tercerosExperienciasLaborales")
@CrossOrigin
public class TercerosExperienciasLaboralesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosExperienciasLaborales";

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosExperienciasLaborales> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosExperienciasLaborales[] parametros = restTemplate.getForObject(serviceUrl, TercerosExperienciasLaborales[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosExperienciasLaborales create(@RequestBody TercerosExperienciasLaborales request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, TercerosExperienciasLaborales.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosExperienciasLaborales request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, TercerosExperienciasLaborales.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTercero}")
    VTercerosExperienciasLaborales findOne(@PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosExperienciasLaborales parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idTercero, VTercerosExperienciasLaborales.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<VTercerosExperienciasLaborales> findForTercero(@PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosExperienciasLaborales[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTercero/" + idTercero, VTercerosExperienciasLaborales[].class);
        return Arrays.asList(parametros);
    }
}
