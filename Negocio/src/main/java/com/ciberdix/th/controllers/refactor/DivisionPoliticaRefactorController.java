package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.DivisionPolitica;
import com.ciberdix.th.model.refactor.VDivisionPoliticaRec;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/divisionPolitica")
public class DivisionPoliticaRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/divisionPolitica";

    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPolitica> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        DivisionPolitica[] parametros = restTemplate.getForObject(serviceUrl, DivisionPolitica[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    DivisionPolitica create(@RequestBody DivisionPolitica request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, DivisionPolitica.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody DivisionPolitica request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, DivisionPolitica.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idDivisionPolitica}")
    DivisionPolitica findOne(@PathVariable Integer idDivisionPolitica) {
        RestTemplate restTemplate = new RestTemplate();
        DivisionPolitica parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idDivisionPolitica, DivisionPolitica.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarHijos/{idDivisionPoliticaPadre}")
    List<DivisionPolitica> findSons(@PathVariable Integer idDivisionPoliticaPadre) {
        RestTemplate restTemplate = new RestTemplate();
        DivisionPolitica[] parametros = restTemplate.getForObject(serviceUrl + "/buscarHijos/" + idDivisionPoliticaPadre, DivisionPolitica[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarLocalizaciones/{queryString}/")
    List<VDivisionPoliticaRec> findLocations(@PathVariable String queryString) {
        RestTemplate restTemplate = new RestTemplate();
        VDivisionPoliticaRec[] parametros = restTemplate.getForObject(serviceUrl + "/buscarLocalizaciones/" + queryString + "/", VDivisionPoliticaRec[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCiudad/{queryString}/")
    List<VDivisionPoliticaRec> findCities(@PathVariable String queryString) {
        RestTemplate restTemplate = new RestTemplate();
        VDivisionPoliticaRec[] parametros = restTemplate.getForObject(serviceUrl + "/buscarCiudad/" + queryString + "/", VDivisionPoliticaRec[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarLocalizacion/{idLocalizacion}")
    VDivisionPoliticaRec findLocation(@PathVariable Integer idLocalizacion) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/buscarLocalizacion/" + idLocalizacion, VDivisionPoliticaRec.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/search/{label}/")
    List<VDivisionPolitica> getLists(@PathVariable String label) {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(restTemplate.getForObject(serviceUrl + "/search/" + label + "/", VDivisionPolitica[].class));
    }
}
