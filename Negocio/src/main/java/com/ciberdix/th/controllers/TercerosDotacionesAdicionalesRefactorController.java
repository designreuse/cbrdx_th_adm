package com.ciberdix.th.controllers;

import com.ciberdix.th.model.TercerosDotacionesAdicionales;
import com.ciberdix.th.model.VTercerosDotacionesAdicionales;
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
    List<VTercerosDotacionesAdicionales> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VTercerosDotacionesAdicionales[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosDotacionesAdicionales findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VTercerosDotacionesAdicionales.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosDotacionesAdicionales> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VTercerosDotacionesAdicionales[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{idTercero}")
    List<VTercerosDotacionesAdicionales> findEnabled(@PathVariable Long idTercero) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "tercero/" + idTercero, VTercerosDotacionesAdicionales[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroProyeccionDotacion/{idTercero}/{idProyeccionDotacion}")
    List<VTercerosDotacionesAdicionales> findEnabled(@PathVariable Long idTercero, @PathVariable Integer idProyeccionDotacion) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "terceroProyeccionDotacion/" + idTercero + "/" + idProyeccionDotacion, VTercerosDotacionesAdicionales[].class));
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
