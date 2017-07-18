package com.ciberdix.th.controllers;

import com.ciberdix.th.model.NovedadesRoles;
import com.ciberdix.th.model.VNovedadesRoles;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/novedadesRoles")
@CrossOrigin
public class NovedadesRolesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/novedadesRoles/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VNovedadesRoles> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VNovedadesRoles[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VNovedadesRoles findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VNovedadesRoles.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VNovedadesRoles> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VNovedadesRoles[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/novedad/{id}")
    List<VNovedadesRoles> findByIdNovedad(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "novedad/" + id, VNovedadesRoles[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/rol/{id}")
    List<VNovedadesRoles> findByIdRol(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "rol/" + id, VNovedadesRoles[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    NovedadesRoles create(@RequestBody NovedadesRoles o) {
        return restTemplate.postForObject(serviceUrl, o, NovedadesRoles.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody NovedadesRoles o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
