package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.CentralesRiesgos;
import com.ciberdix.th.model.VCentralesRiesgos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 13/06/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/centralesRiesgos")
public class CentralesRiesgosRefactorController {
    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/centralesRiesgos/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    List<VCentralesRiesgos> findAll() {
        VCentralesRiesgos[] parametros = restTemplate.getForObject(serviceUrl, VCentralesRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCentralesRiesgos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(serviceUrl + "/" + id, VCentralesRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCentralesRiesgos> findEnabled() {
        VCentralesRiesgos[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/", VCentralesRiesgos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{code}")
    Boolean findByCodigoIfExist(@PathVariable String code) {
        List<VCentralesRiesgos> cr = Arrays.asList(restTemplate.getForObject(serviceUrl + "code/" + code, VCentralesRiesgos[].class));
        if(cr.size()>0){
            return true;
        }else{
            return false;
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    CentralesRiesgos create(@RequestBody CentralesRiesgos obj){
        return restTemplate.postForObject(serviceUrl, obj, CentralesRiesgos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CentralesRiesgos obj){
        restTemplate.put(serviceUrl, obj);
    }
}
