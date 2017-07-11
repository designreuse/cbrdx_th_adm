package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.ExamenesMedicos;
import com.ciberdix.th.model.VExamenesMedicos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 11/07/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/examenesMedicos")
public class ExamenesMedicosRefactorController {

    @Value("${business.url}")
    String businessURL;

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/examenesMedicos";

    @RequestMapping(method = RequestMethod.GET)
    List<VExamenesMedicos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VExamenesMedicos[] parametros = restTemplate.getForObject(serviceUrl, VExamenesMedicos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VExamenesMedicos findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, VExamenesMedicos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/procesoSeleccion/{id}")
    VExamenesMedicos getByIdProcesoSeleccion(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/procesoSeleccion/" + id, VExamenesMedicos.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    ExamenesMedicos create(@RequestBody ExamenesMedicos obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, ExamenesMedicos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ExamenesMedicos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
    
}
