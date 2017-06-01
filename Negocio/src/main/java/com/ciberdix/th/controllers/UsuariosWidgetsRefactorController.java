package com.ciberdix.th.controllers;

import com.ciberdix.th.model.UsuariosWidgets;
import com.ciberdix.th.model.VUsuariosWidgets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 31/05/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/usuariosWidgets")
public class UsuariosWidgetsRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<VUsuariosWidgets> getLists() {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosWidgets/";
        VUsuariosWidgets[] parametros = restTemplate.getForObject(serviceUrl, VUsuariosWidgets[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VUsuariosWidgets findOne(@PathVariable Integer id){
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosWidgets/";
        return restTemplate.getForObject(serviceUrl + id, VUsuariosWidgets.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    UsuariosWidgets createList(@RequestBody UsuariosWidgets request) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosWidgets/";
        return restTemplate.postForObject(serviceUrl, request, UsuariosWidgets.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateList(@RequestBody UsuariosWidgets request) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceUrl = baseUrl + "/api/usuariosWidgets/";
        restTemplate.put(serviceUrl, request, UsuariosWidgets.class);
    }

}
