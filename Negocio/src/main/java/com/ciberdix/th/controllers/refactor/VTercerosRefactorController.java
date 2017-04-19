package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.VTerceros;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Obtener terceros", notes = "Retorna el listado de terceros")
    List<VTerceros> listarTerceros() {
        RestTemplate restTemplate = new RestTemplate();
        VTerceros[] terceros = restTemplate.getForObject(serviceUrl + "api/vterceros", VTerceros[].class);

        return Arrays.asList(terceros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @ApiOperation(value = "Obtener terceros por id", notes = "Retorna el tercero por ID")
    VTerceros obtenerTercero(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        VTerceros tercero = restTemplate.getForObject(serviceUrl + "api/vterceros/" + id, VTerceros.class);

        return tercero;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarTerceros/{tipo}")
    @ApiOperation(value = "Obtener terceros por tipo", notes = "Retorna el tercero por Tipo")
    List<VTerceros> obtenerTerceros(@PathVariable String tipo) {
        RestTemplate restTemplate = new RestTemplate();
        VTerceros[] tercero = restTemplate.getForObject(serviceUrl + "api/vterceros/buscarTerceros/" + tipo, VTerceros[].class);
        return Arrays.asList(tercero);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/asignarColaborador/}")
    List<VTerceros> obtenerTerceros() {
        RestTemplate restTemplate = new RestTemplate();
        VTerceros[] tercero = restTemplate.getForObject(serviceUrl + "api/vterceros/asignarColaborador/", VTerceros[].class);
        return Arrays.asList(tercero);
    }
}
