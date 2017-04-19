package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasEstadosProyecciones;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/listasEstadosProyecciones")
@Api(value = "listasEstadosProyecciones", description = "listasEstadosProyecciones")
public class ListasEstadosProyeccionesRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/listasEstadosProyecciones";

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosProyecciones> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstadosProyecciones[] parametros = restTemplate.getForObject(serviceUrl, ListasEstadosProyecciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosProyecciones> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstadosProyecciones[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", ListasEstadosProyecciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosProyecciones findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, ListasEstadosProyecciones.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosProyecciones create(@RequestBody ListasEstadosProyecciones request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, ListasEstadosProyecciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasEstadosProyecciones request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, ListasEstadosProyecciones.class);
    }
}
