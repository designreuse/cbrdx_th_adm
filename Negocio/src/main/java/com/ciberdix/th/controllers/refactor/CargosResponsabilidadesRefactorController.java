package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.CargosResponsabilidades;
import com.ciberdix.th.model.refactor.VCargosResponsabilidades;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/cargosResponsabilidades")
@Api(value = "cargosResponsabilidades", description = "cargosResponsabilidades")
public class CargosResponsabilidadesRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargosResponsabilidades";

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosResponsabilidades> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VCargosResponsabilidades[] parametros = restTemplate.getForObject(serviceUrl, VCargosResponsabilidades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosResponsabilidades findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VCargosResponsabilidades.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCargosResponsabilidades> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VCargosResponsabilidades[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VCargosResponsabilidades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosResponsabilidades create(@RequestBody CargosResponsabilidades obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CargosResponsabilidades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosResponsabilidades obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
