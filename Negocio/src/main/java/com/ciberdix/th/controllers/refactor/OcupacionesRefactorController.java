package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.Ocupaciones;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping("/api/ocupaciones")
@Api(value = "ocupaciones", description = "Ocupaciones")
public class OcupacionesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Obtener ocupaciones", notes = "Retorna el listado de ocupaciones")
    List<Ocupaciones> listarOcupaciones() {
        RestTemplate restTemplate = new RestTemplate();
        Ocupaciones[] ocupaciones = restTemplate.getForObject(serviceUrl + "api/ocupaciones", Ocupaciones[].class);

        return Arrays.asList(ocupaciones);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tipo/{id}")
    @ApiOperation(value = "Obtener una Ocupación", notes = "Retorna la ocupación")
    List<Ocupaciones> listarOcupacionesPorTipo(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        Ocupaciones[] ocupaciones = restTemplate.getForObject(serviceUrl + "api/ocupaciones/tipo/" + id, Ocupaciones[].class);

        return Arrays.asList(ocupaciones);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarCargo/{idCargo}")
    List<Ocupaciones> listarOcupacionesPorCargo(@PathVariable Integer idCargo) {
        RestTemplate restTemplate = new RestTemplate();
        Ocupaciones[] ocupaciones = restTemplate.getForObject(serviceUrl + "api/ocupaciones/buscarCargo/" + idCargo, Ocupaciones[].class);
        return Arrays.asList(ocupaciones);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/enabled")
    @ApiOperation(value = "Crear una Ocupación", notes = "Retorna la ocupación creada")
    List<Ocupaciones> listarOcupacionesHabilitadas(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        Ocupaciones[] ocupaciones = restTemplate.getForObject(serviceUrl + "api/ocupaciones/enabled", Ocupaciones[].class);

        return Arrays.asList(ocupaciones);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Crear una Ocupación", notes = "Retorna la ocupación creada")
    Ocupaciones crearTercero(@RequestBody Ocupaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        Ocupaciones ocupacion = restTemplate.postForObject(serviceUrl + "api/ocupaciones", obj, Ocupaciones.class);

        return ocupacion;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "Actualizar ocupación", notes = "Actualiza la ocupación")
    void actualizarTercero(@RequestBody Ocupaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "api/ocupaciones", obj);
    }
}
