package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.Localizaciones;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@RequestMapping("/api/localizaciones")
@CrossOrigin
public class LocalizacionesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/localizaciones";

    @RequestMapping(method = RequestMethod.GET)
    List<Localizaciones> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Localizaciones[] parametros = restTemplate.getForObject(serviceUrl, Localizaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    Localizaciones create(@RequestBody Localizaciones request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, Localizaciones.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Localizaciones request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, Localizaciones.class);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLocalizacion}")
    Localizaciones findOne(@PathVariable Integer idLocalizacion) {
        RestTemplate restTemplate = new RestTemplate();
        Localizaciones parametro = restTemplate.getForObject(serviceUrl + "/buscarId/" + idLocalizacion, Localizaciones.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<Localizaciones> findOthers(@PathVariable Long idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        Localizaciones[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTercero/" + idTercero, Localizaciones[].class);
        return Arrays.asList(parametros);
    }
}
