package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.CargosRelacionados;
import com.ciberdix.th.model.refactor.VCargosRelacionados;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosRelacionados")
public class CargosRelacionadosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/cargosRelacionados";

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosRelacionados> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VCargosRelacionados[] vCargosRelacionados = restTemplate.getForObject(serviceUrl, VCargosRelacionados[].class);
        return Arrays.asList(vCargosRelacionados);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarRelacion/{codigoRelacion}/{idCargo}")
    List<VCargosRelacionados> findEnabled(@PathVariable String codigoRelacion, @PathVariable Integer idCargo) {
        RestTemplate restTemplate = new RestTemplate();
        VCargosRelacionados[] vCargosRelacionados = restTemplate.getForObject(serviceUrl + "/buscarRelacion/" + codigoRelacion + "/" + idCargo, VCargosRelacionados[].class);
        return Arrays.asList(vCargosRelacionados);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosRelacionados create(@RequestBody CargosRelacionados obj) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, obj, CargosRelacionados.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosRelacionados obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, obj);
    }
}
