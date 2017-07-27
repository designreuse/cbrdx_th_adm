package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.VTerceros;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
@CrossOrigin
@RestController
@RequestMapping("/api/vterceros")
@Api(value = "vterceros", description = "Vista Terceros")
public class VTercerosRefactorController {

    @Value("${domain.url}")
    private String baseUrl;

    @Value("${business.url}")
    private String businessUrl;

    private String serviceUrl;

    private RestTemplate restTemplate;

    @PostConstruct
    void init() {
        serviceUrl = baseUrl + "/api/vterceros/";
        restTemplate = new RestTemplate();
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Obtener terceros", notes = "Retorna el listado de terceros")
    List<VTerceros> listarTerceros() {
        VTerceros[] terceros = restTemplate.getForObject(serviceUrl, VTerceros[].class);
        return Arrays.asList(terceros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @ApiOperation(value = "Obtener terceros por id", notes = "Retorna el tercero por ID")
    VTerceros obtenerTercero(@PathVariable Long id) {
        VTerceros tercero = restTemplate.getForObject(serviceUrl + id, VTerceros.class);
        return tercero;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarTerceros/{tipo}")
    @ApiOperation(value = "Obtener terceros por tipo", notes = "Retorna el tercero por Tipo")
    List<VTerceros> obtenerTerceros(@PathVariable String tipo) {
        VTerceros[] tercero = restTemplate.getForObject(serviceUrl + "buscarTerceros/" + tipo, VTerceros[].class);
        return Arrays.asList(tercero);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/asignarColaborador/{queryString}/")
    List<VTerceros> obtenerTercero(@PathVariable String queryString) {
        VTerceros[] tercero = restTemplate.getForObject(serviceUrl + "asignarColaborador/"+queryString+"/", VTerceros[].class);
        return Arrays.asList(tercero);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/estructuraOrganizacional/{id}")
    List<VTerceros> queryAllByIdEstructuraOrganizacional(@PathVariable Integer id) {
        VTerceros[] tercero = restTemplate.getForObject(serviceUrl + "estructuraOrganizacional/"+id+"/", VTerceros[].class);
        return Arrays.asList(tercero);
    }

}
