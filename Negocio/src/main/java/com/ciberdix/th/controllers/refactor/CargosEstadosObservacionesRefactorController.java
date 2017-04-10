package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.CargosEstadosObservaciones;
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
@RequestMapping("/api/cargosEstadosObservaciones")
@Api(value = "cargosEstadosObservaciones", description = "cargosEstadosObservaciones")
public class CargosEstadosObservacionesRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargosEstadosObservaciones";

    @RequestMapping(method = RequestMethod.GET)
    List<CargosEstadosObservaciones> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        CargosEstadosObservaciones[] parametros = restTemplate.getForObject(serviceUrl, CargosEstadosObservaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<CargosEstadosObservaciones> findByIdCargo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        CargosEstadosObservaciones[] parametros = restTemplate.getForObject(serviceUrl + "/buscarCargo/" + id, CargosEstadosObservaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    CargosEstadosObservaciones findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + id, CargosEstadosObservaciones.class);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosEstadosObservaciones create(@RequestBody CargosEstadosObservaciones obj){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CargosEstadosObservaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosEstadosObservaciones obj){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
