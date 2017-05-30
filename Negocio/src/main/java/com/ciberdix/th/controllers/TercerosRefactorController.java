package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.Terceros;
import com.ciberdix.th.model.VTercerosCargosAreasFisicas;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.access.method.P;
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
@RequestMapping("/api/terceros")
@Api(value = "terceros", description = "Terceros")
public class TercerosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Obtener terceros", notes = "Retorna el listado de terceros")
    List<Terceros> listarTerceros() {
        RestTemplate restTemplate = new RestTemplate();
        Terceros[] terceros = restTemplate.getForObject(serviceUrl + "api/terceros", Terceros[].class);

        return Arrays.asList(terceros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @ApiOperation(value = "Obtener terceros por id", notes = "Retorna el tercero por ID")
    Terceros obtenerTercero(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        Terceros tercero = restTemplate.getForObject(serviceUrl + "api/terceros/" + id, Terceros.class);

        return tercero;
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{cedula}/{id}")
    @ApiOperation(value = "Obtener terceros por número de documento e id de documento", notes = "Retorna el tercero por numero de documento e id de documento")
    Terceros obtenerTerceroCedula(@PathVariable String cedula, @PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        Terceros tercero = restTemplate.getForObject(serviceUrl + "api/terceros/" + cedula + "/" + id, Terceros.class);

        return tercero;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tercerosCargosAreasFisica/{idTercero}")
    @ApiOperation(value = "Obtener tercerosCargosAreasFisicas", notes = "Retorna el listado de tercerosCargosAreasFisica")
    VTercerosCargosAreasFisicas findAllTCAF(@PathVariable Long idTercero) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "api/terceros/tercerosCargosAreasFisica/" + idTercero, VTercerosCargosAreasFisicas.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarJefes/{idArea}/{query}")
    @ApiOperation(value = "Obtener tercerosCargosAreasFisicas por idEstructuraFisica", notes = "Retorna el listado de tercerosCargosAreasFisica por idEstructuraFisica")
    List<VTercerosCargosAreasFisicas> findByIdEstructuraFisica(@PathVariable Integer idArea, @PathVariable String query) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosCargosAreasFisicas[] parametros = restTemplate.getForObject(serviceUrl + "api/terceros/buscarJefes/" + idArea + "/" + query, VTercerosCargosAreasFisicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarJefes/{idArea}/{query}/{idCargo}")
    @ApiOperation(value = "Obtener tercerosCargosAreasFisicas por idEstructuraFisica", notes = "Retorna el listado de tercerosCargosAreasFisica por idEstructuraFisica")
    List<VTercerosCargosAreasFisicas> findByIdEstructuraFisica(@PathVariable Integer idArea, @PathVariable String query, @PathVariable Integer idCargo) {
        RestTemplate restTemplate = new RestTemplate();
        VTercerosCargosAreasFisicas[] parametros = restTemplate.getForObject(serviceUrl + "api/terceros/buscarJefes/" + idArea + "/" + query + "/" + idCargo, VTercerosCargosAreasFisicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Crear tercero", notes = "Retorna el tercero creado")
    Terceros crearTercero(@RequestBody Terceros t) {
        RestTemplate restTemplate = new RestTemplate();
        Terceros tercero = restTemplate.postForObject(serviceUrl + "api/terceros", t, Terceros.class);

        return tercero;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "Actualizar tercero", notes = "Actualiza el tercero")
    void actualizarTercero(@RequestBody Terceros tercero) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "api/terceros", tercero);
    }
}
