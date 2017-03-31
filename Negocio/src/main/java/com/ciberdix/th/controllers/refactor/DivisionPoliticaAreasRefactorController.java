package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.DivisionPoliticaAreas;
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
@RequestMapping("/api/divisionPoliticaAreas")
@Api(value = "divisionPoliticaAreas", description = "División Política Areas")
public class DivisionPoliticaAreasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/divisionPoliticaAreas";

    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPoliticaAreas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        DivisionPoliticaAreas[] parametros = restTemplate.getForObject(serviceUrl, DivisionPoliticaAreas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idLista}")
    DivisionPoliticaAreas findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/buscarId/" + idLista, DivisionPoliticaAreas.class);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    DivisionPoliticaAreas create(@RequestBody DivisionPoliticaAreas obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, DivisionPoliticaAreas.class);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody DivisionPoliticaAreas obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
