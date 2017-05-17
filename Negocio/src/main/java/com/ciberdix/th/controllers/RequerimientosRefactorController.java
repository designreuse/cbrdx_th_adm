package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ListasItems;
import com.ciberdix.th.model.Requerimientos;
import com.ciberdix.th.model.RequerimientosHistoricos;
import com.ciberdix.th.model.VRequerimientos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 15/05/2017.
 */

@RestController
@RequestMapping("/api/requerimientos")
@CrossOrigin
public class RequerimientosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientos> findAll() {
        String serviceUrl = baseUrl + "/api/requerimientos/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idRequerimientos}")
    VRequerimientos findOne(@PathVariable Integer idRequerimientos) {
        String serviceUrl = baseUrl + "/api/requerimientos/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + idRequerimientos, VRequerimientos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/estado/{idEstado}")
    List<VRequerimientos> findByIdEstado(@PathVariable Integer idEstado) {
        String serviceUrl = baseUrl + "/api/requerimientos/estado/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + idEstado, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/byUser/{idUsuario}")
    List<VRequerimientos> findByIdSolicitante(@PathVariable Integer idUsuario) {
        String serviceUrl = baseUrl + "/api/requerimientos/byUser/";
        RestTemplate restTemplate = new RestTemplate();
        VRequerimientos[] parametros = restTemplate.getForObject(serviceUrl + idUsuario, VRequerimientos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Requerimientos create(@RequestBody Requerimientos requerimientos) {
        String serviceUrl = baseUrl + "/api/requerimientos/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, requerimientos, Requerimientos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Requerimientos requerimientos) {
        String serviceUrl = baseUrl + "/api/requerimientos/";
        RestTemplate restTemplate = new RestTemplate();
        Requerimientos req = restTemplate.getForObject(serviceUrl + requerimientos.getIdRequerimiento(), Requerimientos.class);
        ListasItems EstadoAnterior = restTemplate.getForObject(businessUrl + "/api/listas/tabla/ListasEstadosRequerimientos/idItem/" + req.getIdEstado(), ListasItems.class);
        ListasItems EstadoActual = restTemplate.getForObject(businessUrl + "/api/listas/tabla/ListasEstadosRequerimientos/idItem/" + requerimientos.getIdEstado(), ListasItems.class);
        if (EstadoActual.getCodigo().compareTo("SOLICITADO") == 0) {
            if (EstadoAnterior.getCodigo().compareTo("PRCREQ") == 0 || EstadoAnterior.getCodigo().compareTo("DVLT") == 0) {
                RequerimientosHistoricos requerimientosHistoricos = new RequerimientosHistoricos(req);
                restTemplate.postForObject(baseUrl + "/api/requerimientosHistoricos", requerimientosHistoricos, RequerimientosHistoricos.class);
            }
        }
        restTemplate.put(serviceUrl, requerimientos);
    }
}
