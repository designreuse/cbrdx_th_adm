package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.DivisionPoliticaComunas;
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
@RequestMapping("/api/divisionPoliticaComunas")
@Api(value = "divisionPoliticaComunas", description = "División Política Comunas")
public class DivisionPoliticaComunasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/divisionPoliticaComunas";
    
    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPoliticaComunas> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        DivisionPoliticaComunas[] parametros = restTemplate.getForObject(serviceUrl, DivisionPoliticaComunas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idLista}")
    DivisionPoliticaComunas findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + idLista, DivisionPoliticaComunas.class);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    DivisionPoliticaComunas create(@RequestBody DivisionPoliticaComunas obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, DivisionPoliticaComunas.class);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody DivisionPoliticaComunas obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }    
}
