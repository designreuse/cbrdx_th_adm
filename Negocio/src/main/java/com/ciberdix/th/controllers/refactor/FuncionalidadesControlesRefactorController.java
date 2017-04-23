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

    @RequestMapping(method = RequestMethod.GET, path = "/id/{idFuncionalidadControl}")
    FuncionalidadesControles findOne(@PathVariable Integer idFuncionalidadControl) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "id/" + idFuncionalidadControl, FuncionalidadesControles.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<FuncionalidadesControles> findEnabled() {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        FuncionalidadesControles[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", FuncionalidadesControles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPadre/{idPadre}")
    List<FuncionalidadesControles> findByParent(@PathVariable Integer idPadre) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        FuncionalidadesControles[] funcionalidadesControles = restTemplate.getForObject(serviceUrl + "buscarPadre/" + idPadre, FuncionalidadesControles[].class);
        return Arrays.asList(funcionalidadesControles);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/secycam/{idFuncionalidad}/{indicador}")
    List<FuncionalidadesControles> queryAllByIdSecCam(@PathVariable Integer idFuncionalidadControl, @PathVariable Boolean indicador) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "secycam/" + idFuncionalidadControl + "/" + indicador, FuncionalidadesControles[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/indicadorsecycam/{indicador}")
    List<FuncionalidadesControles> queryAllBySecCam(@PathVariable Boolean indicador) {
        String serviceUrl = baseUrl + "/api/funcionalidadesControles/";
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "indicadorsecycam/" + indicador, FuncionalidadesControles[].class));
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
