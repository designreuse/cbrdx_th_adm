package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.DivisionPoliticaLocalidades;
import com.ciberdix.th.model.refactor.DivisionPoliticaResguardos;
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
@RequestMapping("/api/divisionPoliticaResguardos")
@Api(value = "divisionPoliticaResguardos", description = "División Política Resguardos")
public class DivisionPoliticaResguardosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/divisionPoliticaResguardos";
    
    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPoliticaResguardos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        DivisionPoliticaResguardos[] parametros = restTemplate.getForObject(serviceUrl, DivisionPoliticaResguardos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idLista}")
    DivisionPoliticaResguardos findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + idLista, DivisionPoliticaResguardos.class);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    DivisionPoliticaResguardos create(@RequestBody DivisionPoliticaLocalidades obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, DivisionPoliticaResguardos.class);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody DivisionPoliticaResguardos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }    
}
