package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Nomenclaturas;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/nomenclatures")
public class NomenclaturaPrincipalController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();
    
    @RequestMapping(method = RequestMethod.GET, value = "/principal")
    List<Nomenclaturas> consultarPrincipales() {
        RestTemplate restTemplate = new RestTemplate();
        Nomenclaturas[] parametros = restTemplate.getForObject(serviceUrl + "principalNomenclature", Nomenclaturas[].class);

        return Arrays.asList(parametros);
    }   
    
    @RequestMapping(method = RequestMethod.GET, value = "/complementary")
    List<Nomenclaturas> consultarComplementarias() {
        RestTemplate restTemplate = new RestTemplate();
        Nomenclaturas[] parametros = restTemplate.getForObject(serviceUrl + "complementaryNomenclature", Nomenclaturas[].class);

        return Arrays.asList(parametros);
    }    
    
    @RequestMapping(method = RequestMethod.GET, value = "/addressType")
    List<Nomenclaturas> consultarParametros() {
        RestTemplate restTemplate = new RestTemplate();
        Nomenclaturas[] parametros = restTemplate.getForObject(serviceUrl + "addresstype", Nomenclaturas[].class);

        return Arrays.asList(parametros);
    }    
}
