package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.TercerosCentralesRiesgos;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 13/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/tercerosCentralesRiesgos")
public class TercerosCentralesRiesgosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosCentralesRiesgos";

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosCentralesRiesgos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosCentralesRiesgos[] parametros = restTemplate.getForObject(serviceUrl, TercerosCentralesRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosCentralesRiesgos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, TercerosCentralesRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<TercerosCentralesRiesgos> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosCentralesRiesgos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled", TercerosCentralesRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosCentralesRiesgos create(@RequestBody TercerosCentralesRiesgos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, TercerosCentralesRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosCentralesRiesgos obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }

}
