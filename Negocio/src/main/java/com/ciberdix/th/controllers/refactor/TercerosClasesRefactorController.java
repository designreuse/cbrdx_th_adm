package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.TercerosClases;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 26/04/2017.
 */

@RestController
@RequestMapping("/api/tercerosClases")
@CrossOrigin
public class TercerosClasesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosClases> findAll() {
        String serviceUrl = baseUrl + "/api/tercerosClases/";
        RestTemplate restTemplate = new RestTemplate();
        TercerosClases[] widgets = restTemplate.getForObject(serviceUrl, TercerosClases[].class);
        return Arrays.asList(widgets);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{IdTercerosClases}")
    TercerosClases findOneById(@PathVariable Integer IdTercerosClases) {
        String serviceUrl = baseUrl + "/api/tercerosClases/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + IdTercerosClases, TercerosClases.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/idTercero/{IdTerceros}")
    List<TercerosClases> findOneByIdTerceros(@PathVariable Long IdTerceros) {
        String serviceUrl = baseUrl + "/api/tercerosClases/";
        RestTemplate restTemplate = new RestTemplate();
        TercerosClases[] parametros = restTemplate.getForObject(serviceUrl + "idTercero/" + IdTerceros, TercerosClases[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<TercerosClases> findEnabled() {
        String serviceUrl = baseUrl + "/api/tercerosClases/";
        RestTemplate restTemplate = new RestTemplate();
        TercerosClases[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", TercerosClases[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosClases create(@RequestBody TercerosClases tercerosClases) {
        String serviceUrl = baseUrl + "/api/tercerosClases/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, tercerosClases, TercerosClases.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosClases tercerosClases) {
        String serviceUrl = baseUrl + "/api/tercerosClases/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, tercerosClases);
    }

}
