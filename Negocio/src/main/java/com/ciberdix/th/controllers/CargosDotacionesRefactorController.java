package com.ciberdix.th.controllers;

import com.ciberdix.th.model.CargosDotaciones;
import com.ciberdix.th.model.VCargosDotaciones;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */

@RestController
@RequestMapping("/api/cargosDotaciones")
@CrossOrigin
public class CargosDotacionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/cargosDotaciones/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosDotaciones> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VCargosDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosDotaciones findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VCargosDotaciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCargosDotaciones> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VCargosDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cargo/{id}")
    List<VCargosDotaciones> findByIdCargo(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "cargo/" + id, VCargosDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/grupoDotacion/{id}")
    List<VCargosDotaciones> findByIdGrupoDotacion(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "grupoDotacion/" + id, VCargosDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosDotaciones create(@RequestBody CargosDotaciones o) {
        return restTemplate.postForObject(serviceUrl, o, CargosDotaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosDotaciones o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
