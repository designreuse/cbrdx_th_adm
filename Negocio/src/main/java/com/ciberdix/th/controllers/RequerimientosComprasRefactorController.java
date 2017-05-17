package com.ciberdix.th.controllers;

import com.ciberdix.th.model.RequerimientosCompras;
import com.ciberdix.th.model.VRequerimientosCompras;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 17/05/2017.
 */

@RestController
@CrossOrigin
@RequestMapping("/api/requerimientosCompras")
public class RequerimientosComprasRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientosCompras> findAll() {
        String serviceUrl = baseUrl + "/api/requerimientosCompras/";
        RestTemplate restTemplate = new RestTemplate();
        List<VRequerimientosCompras> requerimientosReferidos = Arrays.asList(restTemplate.getForObject(serviceUrl, VRequerimientosCompras[].class));

        return requerimientosReferidos;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRequerimientosCompras findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/requerimientosCompras/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, VRequerimientosCompras.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/requerimiento/{idRequerimiento}")
    List<VRequerimientosCompras> findByIdRequerimiento(@PathVariable Integer idRequerimiento) {
        String serviceUrl = baseUrl + "/api/requerimientosCompras/requerimiento/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientosCompras[] requerimientosReferidos = restTemplate.getForObject(serviceUrl + idRequerimiento, VRequerimientosCompras[].class);
        return Arrays.asList(requerimientosReferidos);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosCompras create(@RequestBody RequerimientosCompras o) {
        String serviceUrl = baseUrl + "/api/requerimientosCompras/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, o, RequerimientosCompras.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosCompras o) {
        String serviceUrl = baseUrl + "/api/requerimientosCompras/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o);
    }

}
