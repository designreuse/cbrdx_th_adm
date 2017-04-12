package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.CargosCriterios;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/api/cargosCriterios")
@Api(value = "cargosCriterios", description = "cargosCriterios")
public class CargosCriteriosRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargosCriterios";

    @RequestMapping(method = RequestMethod.GET)
    List<CargosCriterios> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        CargosCriterios[] parametros = restTemplate.getForObject(serviceUrl, CargosCriterios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/{id}")
    List<CargosCriterios> findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        CargosCriterios[] parametros = restTemplate.getForObject(serviceUrl + "/enabled/" + id, CargosCriterios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<CargosCriterios> findByIdCargo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        CargosCriterios[] parametros = restTemplate.getForObject(serviceUrl + "/buscarCargo/" + id, CargosCriterios[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosCriterios[] create(@RequestBody CargosCriterios[] obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CargosCriterios[].class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosCriterios obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
