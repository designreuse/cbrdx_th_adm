package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.TercerosFamiliares;
import com.ciberdix.th.model.refactor.VTercerosFamiliares;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/tercerosFamiliares")
@CrossOrigin
public class TercerosFamiliaresRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosFamiliares";

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosFamiliares> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosFamiliares[] parametros = restTemplate.getForObject(serviceUrl, TercerosFamiliares[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosFamiliares create(@RequestBody TercerosFamiliares request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, TercerosFamiliares.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosFamiliares request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, TercerosFamiliares.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTercero}")
    VTercerosFamiliares findOne(@PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosFamiliares parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idTercero, VTercerosFamiliares.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<VTercerosFamiliares> findForTercero(@PathVariable Integer idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosFamiliares[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTercero/" + idTercero, VTercerosFamiliares[].class);
        return Arrays.asList(parametros);
    }
}
