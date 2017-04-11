package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.CargosPersonalidadAtributos;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosPersonalidadAtributos")
public class CargosPersonalidadAtributosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargosPersonalidadAtributos";

    @RequestMapping(method = RequestMethod.GET)
    List<CargosPersonalidadAtributos> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        CargosPersonalidadAtributos[] cargosPersonalidadAtributos = restTemplate.getForObject(serviceUrl, CargosPersonalidadAtributos[].class);
        return Arrays.asList(cargosPersonalidadAtributos);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{idCargo}")
    List<CargosPersonalidadAtributos> findEnabled(@PathVariable Integer idCargo) {
        RestTemplate restTemplate = new RestTemplate();
        CargosPersonalidadAtributos[] cargosPersonalidadAtributos = restTemplate.getForObject(serviceUrl + "/buscarCargo/" + idCargo, CargosPersonalidadAtributos[].class);
        return Arrays.asList(cargosPersonalidadAtributos);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosPersonalidadAtributos create(@RequestBody CargosPersonalidadAtributos obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CargosPersonalidadAtributos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosPersonalidadAtributos obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
