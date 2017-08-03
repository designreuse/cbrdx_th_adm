package com.ciberdix.th.controllers;

import com.ciberdix.th.model.RelacionesListas;
import com.ciberdix.th.model.VRelacionesListas;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 20/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/relacionesListas")
public class RelacionesListasRefactorController {

    @Value("${business.url}")
    String businessURL;

    @Value("${domain.url}")
    String domainURL;

    RestTemplate restTemplate;

    private String serviceUrl;

    @PostConstruct
    void init() {
        serviceUrl = domainURL + "/api/relacionesListas";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VRelacionesListas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VRelacionesListas[] parametros = restTemplate.getForObject(serviceUrl, VRelacionesListas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRelacionesListas findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VRelacionesListas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VRelacionesListas> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        VRelacionesListas[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VRelacionesListas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    RelacionesListas create(@RequestBody RelacionesListas obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, RelacionesListas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RelacionesListas obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
