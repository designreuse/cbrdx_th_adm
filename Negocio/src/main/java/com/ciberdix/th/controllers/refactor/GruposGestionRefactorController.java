package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.GruposGestion;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/gruposGestion")
public class GruposGestionRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/gruposGestion/";

    @RequestMapping(method = RequestMethod.GET)
    List<GruposGestion> queryCenrtosCostos() {
        RestTemplate restTemplate = new RestTemplate();
        GruposGestion[] parametros = restTemplate.getForObject(serviceUrl, GruposGestion[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "usuario/{idUsuario}")
    List<GruposGestion> queryCenrtosCostos(@PathVariable Integer idUsuario) {
        RestTemplate restTemplate = new RestTemplate();
        GruposGestion[] parametros = restTemplate.getForObject(serviceUrl + "usuario/" + idUsuario, GruposGestion[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    GruposGestion createCentrosCostos(@RequestBody GruposGestion request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, GruposGestion.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateCentrosCostos(@RequestBody GruposGestion request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, GruposGestion.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    GruposGestion viewCentrosCostos(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        GruposGestion parametro = restTemplate.getForObject(serviceUrl + IdParametro, GruposGestion.class);
        return parametro;
    }
}