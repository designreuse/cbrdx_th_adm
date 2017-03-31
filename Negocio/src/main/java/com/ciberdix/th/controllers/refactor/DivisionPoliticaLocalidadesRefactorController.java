package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.DivisionPoliticaLocalidades;
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
@RequestMapping("/api/divisionPoliticaLocalidades")
@Api(value = "divisionPoliticaLocalidades", description = "División Política Localidades")
public class DivisionPoliticaLocalidadesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/divisionPoliticaLocalidades";
    
    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPoliticaLocalidades> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        DivisionPoliticaLocalidades[] parametros = restTemplate.getForObject(serviceUrl, DivisionPoliticaLocalidades[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idLista}")
    DivisionPoliticaLocalidades findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + idLista, DivisionPoliticaLocalidades.class);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    DivisionPoliticaLocalidades create(@RequestBody DivisionPoliticaLocalidades obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, DivisionPoliticaLocalidades.class);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody DivisionPoliticaLocalidades obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }    
}
