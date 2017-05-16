package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Constantes;
import com.ciberdix.th.model.VConstantes;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/constantes")
public class ConstantesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "api/constantes/";

    @RequestMapping(method = RequestMethod.GET)
    List<VConstantes> list() {
        RestTemplate restTemplate = new RestTemplate();
        VConstantes[] Constantes = restTemplate.getForObject(serviceUrl, VConstantes[].class);

        return Arrays.asList(Constantes);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    VConstantes getOne(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        VConstantes actividad = restTemplate.getForObject(serviceUrl + id, VConstantes.class);

        return actividad;
    }

    @RequestMapping(method = RequestMethod.POST)
    Constantes create(@RequestBody Constantes obj) {
        RestTemplate restTemplate = new RestTemplate();
        Constantes tercero = restTemplate.postForObject(serviceUrl, obj, Constantes.class);

        return tercero;
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Constantes obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}