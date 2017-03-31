package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposTerceros;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/listasTiposTerceros")
@CrossOrigin
public class ListasTiposTercerosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasTiposTerceros";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposTerceros> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposTerceros[] parametros = restTemplate.getForObject(serviceUrl, ListasTiposTerceros[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposTerceros> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposTerceros[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasTiposTerceros[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposTerceros create(@RequestBody ListasTiposTerceros request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasTiposTerceros.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposTerceros request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasTiposTerceros.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLista}")
    ListasTiposTerceros findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposTerceros parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idLista, ListasTiposTerceros.class);
        return parametro;
    }
}
