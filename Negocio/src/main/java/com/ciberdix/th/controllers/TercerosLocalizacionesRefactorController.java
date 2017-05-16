package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.TercerosLocalizaciones;
import com.ciberdix.th.model.VLocalizaciones;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@RequestMapping("/api/tercerosLocalizaciones")
@CrossOrigin
public class TercerosLocalizacionesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosLocalizaciones";
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    List<VLocalizaciones> findAll(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();      
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "/buscarTercero/" + id, VLocalizaciones[].class));
    }    
    
    @RequestMapping(method = RequestMethod.GET, value = "/loc/{id}")
    TercerosLocalizaciones findOne(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();      
        return restTemplate.getForObject(serviceUrl + "/" + id, TercerosLocalizaciones.class);
    }    
    
    @RequestMapping(method = RequestMethod.POST)
    TercerosLocalizaciones crear(@RequestBody TercerosLocalizaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, TercerosLocalizaciones.class);
    }    
    
    @RequestMapping(method = RequestMethod.PUT)
    void actualizar(@RequestBody TercerosLocalizaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }    
}
