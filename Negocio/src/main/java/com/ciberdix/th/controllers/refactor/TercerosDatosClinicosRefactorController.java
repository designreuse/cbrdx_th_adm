package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.TercerosDatosClinicos;
import com.ciberdix.th.model.refactor.VTercerosDatosClinicos;
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
@RequestMapping("/api/tercerosDatosClinicos")
@Api(value = "tercerosDatosClinicos", description = "Terceros Datos Clínicos")
public class TercerosDatosClinicosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosDatosClinicos";    
    
    @RequestMapping(method = RequestMethod.GET)
    List<TercerosDatosClinicos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosDatosClinicos[] parametros = restTemplate.getForObject(serviceUrl, TercerosDatosClinicos[].class);
        return Arrays.asList(parametros);
    }
    
    @RequestMapping(method = RequestMethod.GET, path="/{id}")
    List<TercerosDatosClinicos> findOne(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        TercerosDatosClinicos[] parametros = restTemplate.getForObject(serviceUrl + "/" + id, TercerosDatosClinicos[].class);
        return Arrays.asList(parametros);
    }
    
    @RequestMapping(method = RequestMethod.GET, path="/buscarTercero/{id}")
    List<VTercerosDatosClinicos> findPorTercero(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosDatosClinicos[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTercero/" + id, VTercerosDatosClinicos[].class);
        return Arrays.asList(parametros);
    }
    
    @RequestMapping(method = RequestMethod.GET, path="/buscarId/{id}")
    VTercerosDatosClinicos findId(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosDatosClinicos parametros = restTemplate.getForObject(serviceUrl + "/buscarId/" + id, VTercerosDatosClinicos.class);
        return parametros;
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosDatosClinicos create(@RequestBody TercerosDatosClinicos request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, TercerosDatosClinicos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosDatosClinicos request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, TercerosDatosClinicos.class);
    }    
}
