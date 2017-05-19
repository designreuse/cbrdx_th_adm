package com.ciberdix.th.controllers;

import com.ciberdix.th.model.RequerimientosTics;
import com.ciberdix.th.model.VRequerimientosTics;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 18/05/2017.
 */

@RestController
@CrossOrigin
@RequestMapping("/api/requerimientosTics")
public class RequerimientosTicsRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientosTics> findAll() {
        String serviceUrl = baseUrl + "/api/requerimientosTics/";
        RestTemplate restTemplate = new RestTemplate();
        List<VRequerimientosTics> requerimientosReferidos = Arrays.asList(restTemplate.getForObject(serviceUrl, VRequerimientosTics[].class));

        return requerimientosReferidos;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRequerimientosTics findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/requerimientosTics/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, VRequerimientosTics.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/requerimiento/{idRequerimiento}")
    List<VRequerimientosTics> findByIdRequerimiento(@PathVariable Integer idRequerimiento) {
        String serviceUrl = baseUrl + "/api/requerimientosTics/requerimiento/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientosTics[] parametros = restTemplate.getForObject(serviceUrl + idRequerimiento, VRequerimientosTics[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosTics create(@RequestBody RequerimientosTics o) {
        String serviceUrl = baseUrl + "/api/requerimientosTics/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, o, RequerimientosTics.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosTics o) {
        String serviceUrl = baseUrl + "/api/requerimientosTics/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o);
    }

}
