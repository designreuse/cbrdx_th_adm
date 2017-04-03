package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTallas;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@RequestMapping("/api/listasTallas")
@CrossOrigin
public class ListasTallasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasTallas";    
    
    @RequestMapping(method = RequestMethod.GET)
    List<ListasTallas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTallas[] parametros = restTemplate.getForObject(serviceUrl, ListasTallas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTallas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ListasTallas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/{codigo}")
    List<ListasTallas> findEnabled(@PathVariable String codigo) {
        RestTemplate restTemplate = new RestTemplate();
        ListasTallas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/" + codigo, ListasTallas[].class);
        return Arrays.asList(parametros);
    }    
}
