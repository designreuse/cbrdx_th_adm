package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosDotacionesAdicionales;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/tercerosDotacionesAdicionales")
@CrossOrigin
public class TercerosDotacionesAdicionalesRefactorController {
    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tercerosDotacionesAdicionales/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosDotacionesAdicionales> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, TercerosDotacionesAdicionales[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosDotacionesAdicionales findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, TercerosDotacionesAdicionales.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosDotacionesAdicionales create(@RequestBody TercerosDotacionesAdicionales o) {
        return restTemplate.postForObject(serviceUrl, o, TercerosDotacionesAdicionales.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosDotacionesAdicionales o) {
        restTemplate.put(serviceUrl, o);
    }
}
