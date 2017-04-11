package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasAtributosCargos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/listasAtributosCargos")
@CrossOrigin
public class ListasAtributosCargosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasAtributosCargos";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasAtributosCargos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasAtributosCargos[] parametros = restTemplate.getForObject(serviceUrl, ListasAtributosCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasAtributosCargos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasAtributosCargos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasAtributosCargos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasAtributosCargos create(@RequestBody ListasAtributosCargos request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasAtributosCargos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasAtributosCargos request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasAtributosCargos.class);
    }
}
