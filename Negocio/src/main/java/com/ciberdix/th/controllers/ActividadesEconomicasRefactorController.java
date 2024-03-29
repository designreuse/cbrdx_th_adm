package com.ciberdix.th.controllers;

import com.ciberdix.th.model.ActividadesEconomicas;
import com.ciberdix.th.model.VActividadesEconomicas;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
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
@RequestMapping("/api/actividadesEconomicas")
@Api(value = "actividadesEconomicas", description = "Actividades Económicas")
public class ActividadesEconomicasRefactorController {

    @Value("${domain.url}")
    private String serviceUrl;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Obtener actividades económicas", notes = "Retorna el listado de actividades económicas")
    List<ActividadesEconomicas> listarActividadesEconomicas() {
        RestTemplate restTemplate = new RestTemplate();
        ActividadesEconomicas[] actividadesEconomicas = restTemplate.getForObject(serviceUrl + "api/actividadesEconomicas", ActividadesEconomicas[].class);

        return Arrays.asList(actividadesEconomicas);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/padre/{id}")
    @ApiOperation(value = "Obtener actividades economicas por padre", notes = "Retorna la lista de actividades economicas por padre")
    List<ActividadesEconomicas> obtenerActividadEconomicaPorPadre(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        ActividadesEconomicas[] actividades = restTemplate.getForObject(serviceUrl + "api/actividadesEconomicas/padre/" + id, ActividadesEconomicas[].class);

        return Arrays.asList(actividades);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @ApiOperation(value = "Obtener actividades economicas padre", notes = "Retorna la actividad economica")
    ActividadesEconomicas obtenerActividadEconomica(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        ActividadesEconomicas actividad = restTemplate.getForObject(serviceUrl + "api/actividadesEconomicas/" + id, ActividadesEconomicas.class);

        return actividad;
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/lastChild/{id}")
    @ApiOperation(value = "Obtener actividades economicas Last Child", notes = "Retorna la actividad economica last child")
    List<ActividadesEconomicas> obtenerActividadEconomicaLastChild(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        ActividadesEconomicas[] actividad = restTemplate.getForObject(serviceUrl + "api/actividadesEconomicas/lastChild/" + id, ActividadesEconomicas[].class);

        return Arrays.asList(actividad);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/search/{label}")
    List<VActividadesEconomicas> consultarParametros(@PathVariable String label) {
        RestTemplate restTemplate = new RestTemplate();
        VActividadesEconomicas[] parametros = restTemplate.getForObject(serviceUrl + "api/actividadesEconomicas/search/" + label + "/", VActividadesEconomicas[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Crear actividades económicas", notes = "Retorna la actividad económica creado")
    ActividadesEconomicas crearActividadEconomica(@RequestBody ActividadesEconomicas obj) {
        RestTemplate restTemplate = new RestTemplate();
        ActividadesEconomicas tercero = restTemplate.postForObject(serviceUrl + "api/actividadesEconomicas", obj, ActividadesEconomicas.class);

        return tercero;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "Actualizar Actividad Economica", notes = "Actualiza la Actividad Economica")
    void actualizarActividadEconomica(@RequestBody ActividadesEconomicas obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "api/actividadesEconomicas", obj);
    }    
}
