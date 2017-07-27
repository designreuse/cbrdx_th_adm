package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
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
@RequestMapping("/api/dotaciones")
@CrossOrigin
public class DotacionesRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/dotaciones/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VDotaciones> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VDotaciones findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VDotaciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VDotaciones> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/grupoDotacion/{id}")
    List<VDotaciones> findByIdGrupoDotacion(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "grupoDotacion/" + id, VDotaciones[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/ProyeccionDotacion/{id}")
    List<VDotaciones> findByIdProyeccionDotacion(@PathVariable Integer id) {
        List<VDotaciones> d = Arrays.asList(restTemplate.getForObject(serviceUrl + "idProyeccionDotacion/" + id, VDotaciones[].class));
        Integer count = 0, cant = 0;
        VProyeccionDotacion pd = restTemplate.getForObject(baseUrl + "/api/proyeccionDotacion/" + id, VProyeccionDotacion.class);
        List<VProyeccionDotacionEstructuraOrganizacional> pe = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/proyeccionDotacionEstructuraOrganizacional/proyeccionDotacion/" + id, VProyeccionDotacionEstructuraOrganizacional[].class));
        for(VDotaciones vd : d){
            if(pd.getIndicadorNoAreas()){
                cant = pd.getCantidadProyeccion();
            }else{
                for(VProyeccionDotacionEstructuraOrganizacional vpe : pe){
                    List<VTerceros> t = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/vterceros/estructuraOrganizacional/" + vpe.getIdEstructuraOrganizacional() + "/", VTerceros[].class));
                    cant += (t.size() * vd.getCantidad());
                }
            }
            vd.setCantidadTotal(cant);
        }
        return d;
    }

    @RequestMapping(method = RequestMethod.POST)
    Dotaciones create(@RequestBody Dotaciones o) {
        return restTemplate.postForObject(serviceUrl, o, Dotaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Dotaciones o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
