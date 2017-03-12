package com.ciberdix.th.controllers;

import com.ciberdix.th.model.DivisionPolitica;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/cities")
public class DivisionPoliticaController {

    private String serviceUrl = "http://localhost:8080/";

    @RequestMapping(method = RequestMethod.GET, value = "s/{param}")
    List<DivisionPolitica> consultarParametros(@PathVariable String param) {
        RestTemplate restTemplate = new RestTemplate();
        DivisionPolitica[] parametros = restTemplate.getForObject(serviceUrl + "cities/location/5/", DivisionPolitica[].class);        
        
        return Arrays.asList(parametros);
    }

}
