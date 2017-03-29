package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposOcupaciones;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/api/tiposOcupaciones")
@Api(value = "tiposOcupaciones", description = "Tipos de ocupaciones")
public class ListasTiposOcupacionesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Obtener Tipos de ocupaciones", notes = "Retorna el listado de Tipos de ocupaciones")
    List<ListasTiposOcupaciones> listarTiposOcupaciones() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposOcupaciones[] tiposOcupaciones = restTemplate.getForObject(serviceUrl + "api/tiposOcupaciones", ListasTiposOcupaciones[].class);

        return Arrays.asList(tiposOcupaciones);
    }

    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    @ApiOperation(value = "Obtener Tipo de ocupacion", notes = "Retorna el Tipo de ocupacion")
    ListasTiposOcupaciones obtenerTipoOcupacion(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposOcupaciones tiposOcupaciones = restTemplate.getForObject(serviceUrl + "api/tiposOcupaciones/" + id, ListasTiposOcupaciones.class);

        return tiposOcupaciones;
    }
}
