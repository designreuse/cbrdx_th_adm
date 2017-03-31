package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.DivisionPoliticaTipos;
import io.swagger.annotations.Api;
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
@CrossOrigin
@RestController
@RequestMapping("/api/divisionPoliticaTipos")
@Api(value = "divisionPoliticaTipos", description = "División Política Tipos")
public class DivisionPoliticaTiposRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/divisionPoliticaTipos";
    
    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPoliticaTipos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        DivisionPoliticaTipos[] parametros = restTemplate.getForObject(serviceUrl, DivisionPoliticaTipos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idLista}")
    DivisionPoliticaTipos findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + idLista, DivisionPoliticaTipos.class);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    DivisionPoliticaTipos create(@RequestBody DivisionPoliticaTipos obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, DivisionPoliticaTipos.class);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody DivisionPoliticaTipos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }    
}
