package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposCargosRelaciones;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listasTiposCargosRelaciones")
@CrossOrigin
public class ListasTiposCargosRelacionesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasTiposCargosRelaciones";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposCargosRelaciones> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposCargosRelaciones[] parametros = restTemplate.getForObject(serviceUrl, ListasTiposCargosRelaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasTiposCargosRelaciones> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposCargosRelaciones[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", ListasTiposCargosRelaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposCargosRelaciones create(@RequestBody ListasTiposCargosRelaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ListasTiposCargosRelaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposCargosRelaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
