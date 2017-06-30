package com.ciberdix.th.controllers;

import com.ciberdix.th.model.FuncionalidadesControles;
import com.ciberdix.th.model.VFuncionalidadesControles;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 22/04/2017.
 */

@RestController
@RequestMapping("/api/funcionalidadesControles")
@CrossOrigin
public class FuncionalidadesControlesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<VFuncionalidadesControles> findAll() {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        VFuncionalidadesControles[] vFuncionalidadesControles = restTemplate.getForObject(serviceUrl, VFuncionalidadesControles[].class);
        return Arrays.asList(vFuncionalidadesControles);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/id/{idFuncionalidadControl}")
    VFuncionalidadesControles findOne(@PathVariable Integer idFuncionalidadControl) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "id/" + idFuncionalidadControl, VFuncionalidadesControles.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VFuncionalidadesControles> findEnabled() {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        VFuncionalidadesControles[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", VFuncionalidadesControles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/{idFuncionalidad}")
    List<VFuncionalidadesControles> findEnabled(@PathVariable Integer idFuncionalidad) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        VFuncionalidadesControles[] parametros = restTemplate.getForObject(serviceUrl + "enabled/" + idFuncionalidad, VFuncionalidadesControles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPadre/{idPadre}")
    List<VFuncionalidadesControles> findByParent(@PathVariable Integer idPadre) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        VFuncionalidadesControles[] vFuncionalidadesControles = restTemplate.getForObject(serviceUrl + "buscarPadre/" + idPadre, VFuncionalidadesControles[].class);
        return Arrays.asList(vFuncionalidadesControles);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/secycam/{idFuncionalidad}/{indicador}")
    List<VFuncionalidadesControles> queryAllByIdSecCam(@PathVariable Integer idFuncionalidad, @PathVariable Boolean indicador) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "secycam/" + idFuncionalidad + "/" + indicador, VFuncionalidadesControles[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/indicadorsecycam/{indicador}")
    List<VFuncionalidadesControles> queryAllBySecCam(@PathVariable Boolean indicador) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "indicadorsecycam/" + indicador, VFuncionalidadesControles[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    FuncionalidadesControles create(@RequestBody FuncionalidadesControles fc) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, fc, FuncionalidadesControles.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody FuncionalidadesControles fc) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, fc);
    }

}
