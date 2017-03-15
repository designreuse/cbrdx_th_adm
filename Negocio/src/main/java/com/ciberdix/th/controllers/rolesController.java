package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Rol;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/roles")
public class rolesController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/roles/";

    @RequestMapping(method = RequestMethod.GET)
    List<Rol> consultarParametros() {
        RestTemplate restTemplate = new RestTemplate();
        Rol[] parametros = restTemplate.getForObject(serviceUrl, Rol[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Rol crearParametro(@RequestBody Rol request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Rol.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarParametro(@RequestBody Rol request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Rol.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    Rol verParametro(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        Rol parametro = restTemplate.getForObject(serviceUrl + IdParametro, Rol.class);
        return parametro;
    }
}