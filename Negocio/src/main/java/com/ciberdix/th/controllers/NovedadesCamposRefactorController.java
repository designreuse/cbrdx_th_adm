package com.ciberdix.th.controllers;

import com.ciberdix.th.model.NovedadesCampos;
import com.ciberdix.th.model.VNovedadesCampos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/novedadesCampos")
@CrossOrigin
public class NovedadesCamposRefactorController {
    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/novedadesCampos/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VNovedadesCampos> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VNovedadesCampos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VNovedadesCampos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VNovedadesCampos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VNovedadesCampos> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VNovedadesCampos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/novedad/{id}")
    List<VNovedadesCampos> findByIdNovedad(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "novedad/" + id, VNovedadesCampos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/campoNovedad/{id}")
    List<VNovedadesCampos> findByIdCampoNovedad(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "campoNovedad/" + id, VNovedadesCampos[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    NovedadesCampos create(@RequestBody NovedadesCampos o) {
        return restTemplate.postForObject(serviceUrl, o, NovedadesCampos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody NovedadesCampos o) {
        restTemplate.put(serviceUrl, o);
    }
}
