package com.ciberdix.th.controllers;

import com.ciberdix.th.model.LocalizacionesNomenclaturas;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/localizacionesNomenclaturas")
@CrossOrigin
public class LocalizacionesNomenclaturasRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/localizacionesNomenclaturas/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<LocalizacionesNomenclaturas> findAll() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl, LocalizacionesNomenclaturas[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    LocalizacionesNomenclaturas findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + id, LocalizacionesNomenclaturas.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<LocalizacionesNomenclaturas> findEnabled() {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "enabled", LocalizacionesNomenclaturas[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/localizacion/{id}")
    List<LocalizacionesNomenclaturas> findByIdLocalizacion(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "localizacion/" + id, LocalizacionesNomenclaturas[].class));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tipoNomenCompl/{id}")
    List<LocalizacionesNomenclaturas> findByIdTipoNomenCompl(@PathVariable Integer id) {
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "tipoNomenCompl/" + id, LocalizacionesNomenclaturas[].class));
    }

    @RequestMapping(method = RequestMethod.POST)
    LocalizacionesNomenclaturas create(@RequestBody LocalizacionesNomenclaturas o) {
        return restTemplate.postForObject(serviceUrl, o, LocalizacionesNomenclaturas.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody LocalizacionesNomenclaturas o) {
        restTemplate.put(serviceUrl, o);
    }
    
}
