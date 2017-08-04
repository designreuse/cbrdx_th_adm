package com.ciberdix.th.controllers;

import com.ciberdix.th.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/tercerosTipos")
@CrossOrigin
public class TercerosTiposRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/tercerosTipos/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosTipos> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, TercerosTipos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<TercerosTipos> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", TercerosTipos[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosTipos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, TercerosTipos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosTipos create(@RequestBody TercerosTipos o) {
        TercerosTipos tt = restTemplate.postForObject(serviceUrl, o, TercerosTipos.class);
        TercerosTiposDocumentosTerceros ttdt = new TercerosTiposDocumentosTerceros();
        ttdt.setIdTerceroTipo(tt.getIdTerceroTipo());
        ttdt.setIndicadorHabilitado(true);
        ttdt.setIndicadorObligatorio(false);
        ttdt.setIndicadorRequiere(false);
        ttdt.setAuditoriaFecha(tt.getAuditoriaFecha());
        ttdt.setAuditoriaUsuario(tt.getAuditoriaUsuario());
        TercerosTiposCentralesRiesgos ttcr = new TercerosTiposCentralesRiesgos();
        ttcr.setIdTerceroTipo(tt.getIdTerceroTipo());
        ttcr.setIndicadorHabilitado(true);
        ttcr.setIndicadorRequiere(false);
        ttcr.setAuditoriaFecha(tt.getAuditoriaFecha());
        ttcr.setAuditoriaUsuario(tt.getAuditoriaUsuario());
        List<DocumentosTerceros> dt = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/documentosTerceros/enabled", DocumentosTerceros[].class));
        for(DocumentosTerceros fdt: dt){
            ttdt.setIdDocumentoTercero(fdt.getIdDocumentoTercero());
            restTemplate.postForObject(baseUrl + "/api/tercerosTiposDocumentosTerceros",ttdt, TercerosTiposDocumentosTerceros.class);
        }
        List<CentralesRiesgos> cr = Arrays.asList(restTemplate.getForObject(baseUrl + "/api/centralesRiesgos/enabled/", CentralesRiesgos[].class));
        for(CentralesRiesgos fcr : cr){
            ttcr.setIdCentralRiesgo(fcr.getIdCentralRiesgo());
            restTemplate.postForObject(baseUrl + "/api/tercerosTiposCentralesRiesgos",ttcr, TercerosTiposCentralesRiesgos.class);
        }
        return tt;
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosTipos o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
