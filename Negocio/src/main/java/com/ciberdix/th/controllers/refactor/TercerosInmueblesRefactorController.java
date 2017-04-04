package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.TercerosInmuebles;
import com.ciberdix.th.model.refactor.VTercerosInmuebles;
import io.swagger.annotations.Api;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@CrossOrigin
@RestController
@RequestMapping("/api/tercerosInmuebles")
@Api(value = "tercerosInmuebles", description = "Terceros Inmuebles")
public class TercerosInmueblesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "/api/tercerosInmuebles";

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosInmuebles> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosInmuebles[] parametros = restTemplate.getForObject(serviceUrl, VTercerosInmuebles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path="/buscarTercero/{id}")
    List<VTercerosInmuebles> findAllPorTercero(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosInmuebles[] parametros = restTemplate.getForObject(serviceUrl + "/buscarTercero/" + id, VTercerosInmuebles[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosInmuebles findOne(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        TercerosInmuebles parametros = restTemplate.getForObject(serviceUrl + "/" + id, TercerosInmuebles.class);
        return parametros;
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosInmuebles create(@RequestBody TercerosInmuebles request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl, request, TercerosInmuebles.class);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosInmuebles request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl, request, TercerosInmuebles.class);
    }
}
