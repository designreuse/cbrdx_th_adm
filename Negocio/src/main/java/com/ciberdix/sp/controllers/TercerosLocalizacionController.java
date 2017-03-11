package com.ciberdix.sp.controllers;

import com.ciberdix.sp.model.TercerosLocalizacion;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/employeeLocation")
public class TercerosLocalizacionController {
    
    private String serviceUrl = "http://localhost:8080/employeesLocations/";
 
    @RequestMapping(method = RequestMethod.GET, value = "employees/{id}")
    List<TercerosLocalizacion> consultarParametros(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        TercerosLocalizacion[] parametros = restTemplate.getForObject(serviceUrl + "employees/" + id, TercerosLocalizacion[].class);
        return Arrays.asList(parametros);
    }    
    
    @RequestMapping(method = RequestMethod.POST)
    TercerosLocalizacion createCentrosCostos(@RequestBody TercerosLocalizacion request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, TercerosLocalizacion.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateCentrosCostos(@RequestBody TercerosLocalizacion request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, TercerosLocalizacion.class);
    }    
}
