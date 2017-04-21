package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.Usuarios;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 21/04/2017.
 */
@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin
public class UsuariosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<Usuarios> findAll() {
        String serviceUrl = baseUrl + "/api/usuarios/";
        RestTemplate restTemplate = new RestTemplate();
        Usuarios[] usuarios = restTemplate.getForObject(serviceUrl, Usuarios[].class);
        return Arrays.asList(usuarios);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idUsuarios}")
    Usuarios findOne(@PathVariable Integer idUsuarios) {
        String serviceUrl = baseUrl + "/api/usuarios/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idUsuarios, Usuarios.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    Usuarios create(@RequestBody Usuarios usuarios) {
        String serviceUrl = baseUrl + "/api/usuarios/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, usuarios, Usuarios.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Usuarios usuarios) {
        String serviceUrl = baseUrl + "/api/usuarios/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, usuarios);
    }
}
