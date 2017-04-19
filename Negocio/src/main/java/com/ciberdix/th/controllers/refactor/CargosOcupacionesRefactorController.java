package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.CargosOcupaciones;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/cargosOcupaciones")
public class CargosOcupacionesRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargosOcupaciones";

    @RequestMapping(method = RequestMethod.GET)
    List<CargosOcupaciones> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        CargosOcupaciones[] parametros = restTemplate.getForObject(serviceUrl, CargosOcupaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET,path = "/buscarCargo/{idCargo}")
    List<CargosOcupaciones> findByCargo(@PathVariable Integer idCargo) {
        RestTemplate restTemplate = new RestTemplate();
        CargosOcupaciones[] parametros = restTemplate.getForObject(serviceUrl+"/buscarCargo/"+idCargo, CargosOcupaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET,path = "/enabled")
    List<CargosOcupaciones> findEnabled() {
        RestTemplate restTemplate = new RestTemplate();
        CargosOcupaciones[] parametros = restTemplate.getForObject(serviceUrl+"/enabled/", CargosOcupaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    CargosOcupaciones findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, CargosOcupaciones.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosOcupaciones create(@RequestBody CargosOcupaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CargosOcupaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosOcupaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
