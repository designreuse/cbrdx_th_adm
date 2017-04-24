package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.Funcionalidades;
import com.ciberdix.th.model.refactor.VFuncionalidades;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 22/04/2017.
 */

@RestController
@RequestMapping("/api/funcionalidades")
@CrossOrigin
public class FuncionalidadesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<VFuncionalidades> findAll() {
        String serviceUrl = baseUrl + "/api/funcionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        VFuncionalidades[] vFuncionalidades = restTemplate.getForObject(serviceUrl, VFuncionalidades[].class);
        return Arrays.asList(vFuncionalidades);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/id/{idFuncionalidad}")
    VFuncionalidades findOne(@PathVariable Integer idFuncionalidad) {
        String serviceUrl = baseUrl + "/api/funcionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "id/" + idFuncionalidad, VFuncionalidades.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VFuncionalidades> findEnabled() {
        String serviceUrl = baseUrl + "/api/funcionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        VFuncionalidades[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", VFuncionalidades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Funcionalidades create(@RequestBody Funcionalidades f) {
        String serviceUrl = baseUrl + "/api/funcionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, f, Funcionalidades.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Funcionalidades f) {
        String serviceUrl = baseUrl + "/api/funcionalidades/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, f);
    }

}
