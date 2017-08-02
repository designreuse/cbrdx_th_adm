package com.ciberdix.th.controllers;

import com.ciberdix.th.model.RelacionesListasHijos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 20/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/relacionesListasHijos")
public class RelacionesListasHijosRefactorController {

    @Value("${business.url}")
    String businessURL;

    @Value("${domain.url}")
    String domainURL;

    RestTemplate restTemplate;

    private String serviceUrl;

    @PostConstruct
    void init() {
        serviceUrl = domainURL + "/api/relacionesListasHijos";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<RelacionesListasHijos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        RelacionesListasHijos[] parametros = restTemplate.getForObject(serviceUrl, RelacionesListasHijos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RelacionesListasHijos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, RelacionesListasHijos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<RelacionesListasHijos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        RelacionesListasHijos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", RelacionesListasHijos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/relacionesListas/{id}")
    List<RelacionesListasHijos> findByRelacionLista(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        RelacionesListasHijos[] parametros = restTemplate.getForObject(serviceUrl + "/relacionesListas/" + id, RelacionesListasHijos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    RelacionesListasHijos create(@RequestBody RelacionesListasHijos obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, RelacionesListasHijos.class);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/lista")
    List<RelacionesListasHijos> createList(@RequestBody List<RelacionesListasHijos> obj) {
        RestTemplate restTemplate = new RestTemplate();
        ArrayList<RelacionesListasHijos> list = new ArrayList<>();
        for (RelacionesListasHijos r : obj) {
            RelacionesListasHijos rl = null;
            if (r.getIdRelacionListaHijo() != null) {
                rl = restTemplate.getForObject(serviceUrl + "/" + r.getIdRelacionListaHijo(), RelacionesListasHijos.class);
            }
            if (rl != null) {
                restTemplate.put(serviceUrl, r);
                list.add(r);
            } else {
                list.add(restTemplate.postForObject(serviceUrl, r, RelacionesListasHijos.class));
            }
        }
        return list;
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RelacionesListasHijos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
