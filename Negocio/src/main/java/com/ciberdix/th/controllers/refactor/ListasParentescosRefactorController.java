package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasParentescos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/listasParentescos")
@CrossOrigin
public class ListasParentescosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasParentescos";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasParentescos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasParentescos[] parametros = restTemplate.getForObject(serviceUrl, ListasParentescos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasParentescos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasParentescos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasParentescos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasParentescos create(@RequestBody ListasParentescos request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasParentescos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasParentescos request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasParentescos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLista}")
    ListasParentescos findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        ListasParentescos parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idLista, ListasParentescos.class);
        return parametro;
    }
}
