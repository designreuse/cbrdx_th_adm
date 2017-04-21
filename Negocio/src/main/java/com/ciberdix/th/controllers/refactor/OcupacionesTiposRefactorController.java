package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.model.refactor.OcupacionesTipos;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Danny on 21/04/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/ocupacionesTipos")
public class OcupacionesTiposRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @RequestMapping(method = RequestMethod.GET)
    List<OcupacionesTipos> queryCenrtosCostos() {
        String serviceUrl = baseUrl + "/api/ocupacionesTipos/";
        RestTemplate restTemplate = new RestTemplate();
        OcupacionesTipos[] parametros = restTemplate.getForObject(serviceUrl, OcupacionesTipos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<OcupacionesTipos> findEnabled() {
        String serviceUrl = baseUrl + "/api/ocupacionesTipos/";
        RestTemplate restTemplate = new RestTemplate();
        OcupacionesTipos[] parametros = restTemplate.getForObject(serviceUrl + "enabled/", OcupacionesTipos[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    OcupacionesTipos createCentrosCostos(@RequestBody OcupacionesTipos request) {
        String serviceUrl = baseUrl + "/api/ocupacionesTipos/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, OcupacionesTipos.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateCentrosCostos(@RequestBody OcupacionesTipos request) {
        String serviceUrl = baseUrl + "/api/ocupacionesTipos/";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, OcupacionesTipos.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{IdParametro}")
    OcupacionesTipos viewCentrosCostos(@PathVariable Integer IdParametro) {
        String serviceUrl = baseUrl + "/api/ocupacionesTipos/";
        RestTemplate restTemplate = new RestTemplate();
        OcupacionesTipos parametro = restTemplate.getForObject(serviceUrl + IdParametro, OcupacionesTipos.class);
        return parametro;
    }

}
