package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ProyeccionDotacion;
import com.ciberdix.th.model.ProyeccionDotacionEstructuraOrganizacional;
import com.ciberdix.th.model.VProyeccionDotacion;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/proyeccionDotacion")
@CrossOrigin
public class ProyeccionDotacionRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/proyeccionDotacion/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VProyeccionDotacion> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, VProyeccionDotacion[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProyeccionDotacion findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, VProyeccionDotacion.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProyeccionDotacion> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", VProyeccionDotacion[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/entreFechas/{fechaInicio}/{fechaFin}")
    List<VProyeccionDotacion> findByFechaSolicitudBetween(@PathVariable String fechaInicio, @PathVariable String fechaFin) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "entreFechas/" + fechaInicio + "/" + fechaFin, VProyeccionDotacion[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/entreFechas/{fechaInicio}/{fechaFin}/{idUsuario}")
    List<VProyeccionDotacion> findByFechaSolicitudBetweenAndIdUsuario(@PathVariable String fechaInicio, @PathVariable String fechaFin, @PathVariable Integer idUsuario) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "entreFechas/" + fechaInicio + "/" + fechaFin + "/" + idUsuario, VProyeccionDotacion[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionDotacion create(@RequestBody ProyeccionDotacion o) {
        List<Integer> ids = o.getIdEstructuraOrganizacional();
        ProyeccionDotacion PD = restTemplate.postForObject(serviceUrl, o, ProyeccionDotacion.class);
        if(o.getIndicadorNoAreas() != null){
            if(!o.getIndicadorNoAreas()){
                if(o.getIdEstructuraOrganizacional() != null){
                    if(o.getIdEstructuraOrganizacional().size()>0){
                        for (Integer id : ids){
                            ProyeccionDotacionEstructuraOrganizacional pe = new ProyeccionDotacionEstructuraOrganizacional();
                            pe.setIdProyeccionDotacion(PD.getIdProyeccionDotacion());
                            pe.setIdEstructuraOrganizacional(id);
                            pe.setIndicadorHabilitado(true);
                            pe.setAuditoriaUsuario(o.getAuditoriaUsuario());
                            restTemplate.postForObject(baseUrl + "/api/proyeccionDotacionEstructuraOrganizacional", pe, ProyeccionDotacionEstructuraOrganizacional.class);
                        }
                    }
                }
            }
        }
        return PD;
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProyeccionDotacion o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
