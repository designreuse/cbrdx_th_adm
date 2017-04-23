package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.FuncionalidadesControles;
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
    List<FuncionalidadesControles> findAll() {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        FuncionalidadesControles[] funcionalidadesControles = restTemplate.getForObject(serviceUrl, FuncionalidadesControles[].class);
        return Arrays.asList(funcionalidadesControles);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idFuncionalidadControl}")
    FuncionalidadesControles findOne(@PathVariable Integer idFuncionalidadControl) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idFuncionalidadControl, FuncionalidadesControles.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<FuncionalidadesControles> findEnabled() {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        FuncionalidadesControles[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", FuncionalidadesControles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/sec/{idFuncionalidadControl}")
    List<FuncionalidadesControles> findByIdSec(@PathVariable Integer idFuncionalidadControl) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "sec/" + idFuncionalidadControl, FuncionalidadesControles[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cam/{idFuncionalidadControl}")
    List<FuncionalidadesControles> findByIdCam(@PathVariable Integer idFuncionalidadControl) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "cam/" + idFuncionalidadControl, FuncionalidadesControles[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/sec")
    List<FuncionalidadesControles> findBySec() {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "sec/", FuncionalidadesControles[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cam")
    List<FuncionalidadesControles> findByCam() {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "cam/", FuncionalidadesControles[].class));
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
