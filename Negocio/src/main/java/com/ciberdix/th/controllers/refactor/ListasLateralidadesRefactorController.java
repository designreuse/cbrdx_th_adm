package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasLateralidades;
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
@RequestMapping("/api/listasLateralidades")
@CrossOrigin
public class ListasLateralidadesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasLateralidades";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasLateralidades> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasLateralidades[] parametros = restTemplate.getForObject(serviceUrl, ListasLateralidades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, name = "/{id}")
    ListasLateralidades findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ListasLateralidades.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasLateralidades> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasLateralidades[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", ListasLateralidades[].class);
        return Arrays.asList(parametros);
    }
}
