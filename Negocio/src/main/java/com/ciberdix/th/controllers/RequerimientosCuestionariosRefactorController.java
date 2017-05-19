package com.ciberdix.th.controllers;

import com.ciberdix.th.model.RequerimientosCuestionarios;
import com.ciberdix.th.model.VRequerimientosCuestionarios;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 19/05/2017.
 */

@RestController
@CrossOrigin
@RequestMapping("/api/requerimientosCuestionarios")
public class RequerimientosCuestionariosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientosCuestionarios> findAll() {
        String serviceUrl = baseUrl + "/api/requerimientosCuestionarios/";
        RestTemplate restTemplate = new RestTemplate();
        List<VRequerimientosCuestionarios> requerimientosReferidos = Arrays.asList(restTemplate.getForObject(serviceUrl, VRequerimientosCuestionarios[].class));

        return requerimientosReferidos;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRequerimientosCuestionarios findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/requerimientosCuestionarios/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, VRequerimientosCuestionarios.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/requerimiento/{idRequerimiento}")
    List<VRequerimientosCuestionarios> findByIdRequerimiento(@PathVariable Integer idRequerimiento) {
        String serviceUrl = baseUrl + "/api/requerimientosCuestionarios/requerimiento/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientosCuestionarios[] requerimientosReferidos = restTemplate.getForObject(serviceUrl + idRequerimiento, VRequerimientosCuestionarios[].class);
        return Arrays.asList(requerimientosReferidos);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosCuestionarios create(@RequestBody RequerimientosCuestionarios o) {
        String serviceUrl = baseUrl + "/api/requerimientosCuestionarios/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, o, RequerimientosCuestionarios.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosCuestionarios o) {
        String serviceUrl = baseUrl + "/api/requerimientosCuestionarios/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o);
    }

}
