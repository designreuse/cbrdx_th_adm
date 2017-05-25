package com.ciberdix.th.controllers;

import com.ciberdix.th.model.Zonas;
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
@RequestMapping("/api/zonas")
public class ZonasRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<Zonas> findAll() {
        String serviceUrl = baseUrl + "/api/zonas/";
        RestTemplate restTemplate = new RestTemplate();
        List<Zonas> zonas = Arrays.asList(restTemplate.getForObject(serviceUrl, Zonas[].class));
        return zonas;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Zonas findOne(@PathVariable Integer id) {
        String serviceUrl = baseUrl + "/api/zonas/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + id, Zonas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/byEstrucOrganizacional/{idEstructuraOrganizacional}")
    List<Zonas> findAllByIdEstructuraOrganizacional(@PathVariable Integer idEstructuraOrganizacional) {
        String serviceUrl = baseUrl + "/api/zonas/byEstrucOrganizacional/";
        RestTemplate restTemplate = new RestTemplate();
        List<Zonas> zonas = Arrays.asList(restTemplate.getForObject(serviceUrl + idEstructuraOrganizacional, Zonas[].class));
        return zonas;
    }

    @RequestMapping(method = RequestMethod.POST)
    Zonas create(@RequestBody Zonas o) {
        String serviceUrl = baseUrl + "/api/zonas/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, o, Zonas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Zonas o) {
        String serviceUrl = baseUrl + "/api/zonas/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, o);
    }

}
