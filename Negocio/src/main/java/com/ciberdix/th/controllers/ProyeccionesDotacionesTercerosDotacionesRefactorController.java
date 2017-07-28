package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ProyeccionesDotacionesTercerosDotaciones;
import com.ciberdix.th.model.VProyeccionesDotacionesTerceros;
import com.ciberdix.th.model.VProyeccionesDotacionesTercerosDotaciones;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/proyeccionesDotacionesTercerosDotaciones")
@CrossOrigin
public class ProyeccionesDotacionesTercerosDotacionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/proyeccionesDotacionesTercerosDotaciones/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VProyeccionesDotacionesTercerosDotaciones> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VProyeccionesDotacionesTercerosDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProyeccionesDotacionesTercerosDotaciones findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VProyeccionesDotacionesTercerosDotaciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProyeccionesDotacionesTercerosDotaciones> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VProyeccionesDotacionesTercerosDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/dotacion/{id}")
    List<VProyeccionesDotacionesTercerosDotaciones> findByIdDotacion(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "dotacion/" + id, VProyeccionesDotacionesTercerosDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proyeccionDotacionTercero/{id}")
    List<VProyeccionesDotacionesTercerosDotaciones> findByIdProyeccionDotacionTercero(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "proyeccionDotacionTercero/" + id, VProyeccionesDotacionesTercerosDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proyeccionDotacionTercero/{idProyeccionDotacion}/{idTercero}")
    List<VProyeccionesDotacionesTercerosDotaciones> findByIdProyeccionDotacionTercero(@PathVariable Integer idProyeccionDotacion, @PathVariable Long idTercero) {
        VProyeccionesDotacionesTerceros pd = restTemplate.getForObject(baseUrl + "/api/proyeccionesDotacionesTerceros/proyeccionDotacionTercero/" + idProyeccionDotacion + "/" + idTercero, VProyeccionesDotacionesTerceros.class);
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "proyeccionDotacionTercero/" + pd.getIdProyeccionDotacionTerceros(), VProyeccionesDotacionesTercerosDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionesDotacionesTercerosDotaciones create(@RequestBody ProyeccionesDotacionesTercerosDotaciones o) {
        return restTemplate.postForObject(serviceUrl, o, ProyeccionesDotacionesTercerosDotaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody List<ProyeccionesDotacionesTercerosDotaciones> o) {
        for(ProyeccionesDotacionesTercerosDotaciones p : o){
            restTemplate.put(serviceUrl, p);
        }
    }
    
}
