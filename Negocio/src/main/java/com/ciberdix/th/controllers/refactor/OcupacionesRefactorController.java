package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.Ocupaciones;
import com.ciberdix.th.model.refactor.VOcupaciones;
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
    List<Ocupaciones> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Ocupaciones[] ocupaciones = restTemplate.getForObject(serviceUrl + "api/ocupaciones", Ocupaciones[].class);

        return Arrays.asList(ocupaciones);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    @ApiOperation(value = "Obtener ocupaciones", notes = "Retorna el listado de ocupaciones por IdOcupacion")
    Ocupaciones findOne(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "api/ocupaciones/" + id, Ocupaciones.class);
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
    List<Ocupaciones> listarOcupacionesHabilitadas() {
        RestTemplate restTemplate = new RestTemplate();
        Ocupaciones[] ocupaciones = restTemplate.getForObject(serviceUrl + "api/ocupaciones/enabled", Ocupaciones[].class);

        return Arrays.asList(ocupaciones);
    }

    @RequestMapping(method = RequestMethod.GET, value = "search/{label}/")
    List<VOcupaciones> consultarParametros(@PathVariable String label) {
        RestTemplate restTemplate = new RestTemplate();
        VOcupaciones[] parametros = restTemplate.getForObject(serviceUrl + "search/" + label + "/", VOcupaciones[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Crear una Ocupación", notes = "Retorna la ocupación creada")
    Ocupaciones create(@RequestBody Ocupaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        Ocupaciones ocupacion = restTemplate.postForObject(serviceUrl + "api/ocupaciones", obj, Ocupaciones.class);

        return ocupacion;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "Actualizar ocupación", notes = "Actualiza la ocupación")
    void update(@RequestBody Ocupaciones obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "api/ocupaciones", obj);
    }
}
