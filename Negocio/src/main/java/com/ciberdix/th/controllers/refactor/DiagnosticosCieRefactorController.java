package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.DiagnosticosCie;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 4/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/diagnosticosCie")
@Api(value = "diagnosticosCie", description = "Diagnosticos")
public class DiagnosticosCieRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/diagnosticosCie";

    @RequestMapping(method = RequestMethod.GET)
    List<DiagnosticosCie> findAll(){
        RestTemplate restTemplate = new RestTemplate();
        DiagnosticosCie[] parametros = restTemplate.getForObject(serviceUrl, DiagnosticosCie[].class);
        return Arrays.asList(parametros);
    }
}
