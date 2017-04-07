package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.Categorias;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/categorias")
public class CategoriasRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/categorias";

    @RequestMapping(method = RequestMethod.GET)
    List<Categorias> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Categorias[] parametros = restTemplate.getForObject(serviceUrl, Categorias[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Categorias findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, Categorias.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<Categorias> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        Categorias[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", Categorias[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Categorias create(@RequestBody Categorias obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, Categorias.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Categorias obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
