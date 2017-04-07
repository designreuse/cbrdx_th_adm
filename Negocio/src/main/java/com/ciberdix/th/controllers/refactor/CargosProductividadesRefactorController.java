package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.Cargos;
import com.ciberdix.th.model.refactor.CargosProductividades;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/cargosProductividades")
public class CargosProductividadesRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargosProductividades";

    @RequestMapping(method = RequestMethod.GET)
    List<CargosProductividades> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        CargosProductividades[] parametros = restTemplate.getForObject(serviceUrl, CargosProductividades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{id}")
    CargosProductividades findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, CargosProductividades.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosProductividades create(@RequestBody CargosProductividades obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CargosProductividades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosProductividades obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
