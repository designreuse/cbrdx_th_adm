package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.DivisionPolitica;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/divisionPolitica")
public class DivisionPoliticaController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = RequestMethod.GET, value = "/cities/s/{param}")
    List<DivisionPolitica> consultarParametros(@PathVariable String param) {
        RestTemplate restTemplate = new RestTemplate();
        DivisionPolitica[] parametros = restTemplate.getForObject(serviceUrl + "cities/location/5/", DivisionPolitica[].class);        
        
        return Arrays.asList(parametros);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/hoods/s/{param}")
    List<DivisionPolitica> consultarBarrios(@PathVariable String param) {
        RestTemplate restTemplate = new RestTemplate();
        DivisionPolitica[] parametros = restTemplate.getForObject(serviceUrl + "cities/location/7/", DivisionPolitica[].class);        
        
        return Arrays.asList(parametros);
    }

}