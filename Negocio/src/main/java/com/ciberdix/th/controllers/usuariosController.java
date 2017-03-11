package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Usuario;
import com.ciberdix.th.model.VUsuario;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/usuarios")
public class usuariosController {

    private String serviceUrl = "http://localhost:8445/usuarios/";

    @RequestMapping(method = RequestMethod.GET)
    List<Usuario> consultarParametros() {
        RestTemplate restTemplate = new RestTemplate();
        Usuario[] parametros = restTemplate.getForObject(serviceUrl, Usuario[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/vista")
    List<VUsuario> consultarVParametros() {
        RestTemplate restTemplate = new RestTemplate();
        VUsuario[] parametros = restTemplate.getForObject(serviceUrl+"/vista", VUsuario[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Usuario crearParametro(@RequestBody Usuario request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Usuario.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarParametro(@RequestBody Usuario request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Usuario.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    Usuario verParametro(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        Usuario parametro = restTemplate.getForObject(serviceUrl + IdParametro, Usuario.class);
        return parametro;
    }
}