package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Widgets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 21/04/2017.
 */
@RestController
@RequestMapping("/api/widgets")
@CrossOrigin
public class WidgetsRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<Widgets> findAll() {
        String serviceUrl = baseUrl + "/api/widgets/";
        RestTemplate restTemplate = new RestTemplate();
        Widgets[] widgets = restTemplate.getForObject(serviceUrl, Widgets[].class);
        return Arrays.asList(widgets);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idWidget}")
    Widgets findOne(@PathVariable Integer idWidget) {
        String serviceUrl = baseUrl + "/api/widgets/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idWidget, Widgets.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarUsuario/{id}")
    List<Widgets> findByIdUsuario(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/widgets/buscarUsuario/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + id, Widgets[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<Widgets> findEnabled() {
        String serviceUrl = baseUrl + "/api/widgets/";
        RestTemplate restTemplate = new RestTemplate();
        Widgets[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", Widgets[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Widgets create(@RequestBody Widgets widgets) {
        String serviceUrl = baseUrl + "/api/widgets/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, widgets, Widgets.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Widgets widgets) {
        String serviceUrl = baseUrl + "/api/widgets/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, widgets);
    }

}
