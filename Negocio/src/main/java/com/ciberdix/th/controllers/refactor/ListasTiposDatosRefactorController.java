package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposDatos;
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
@CrossOrigin
@RestController
@RequestMapping("/api/listasTiposDatos")
public class ListasTiposDatosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasTiposDatos";
    
    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposDatos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposDatos[] parametros = restTemplate.getForObject(serviceUrl, ListasTiposDatos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposDatos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "//buscarId/" + id, ListasTiposDatos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasTiposDatos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposDatos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasTiposDatos[].class);
        return Arrays.asList(parametros);
    }    
}
