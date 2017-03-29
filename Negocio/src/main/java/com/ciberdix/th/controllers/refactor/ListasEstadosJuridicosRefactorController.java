package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasEstadosJuridicos;
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
@RequestMapping("/api/estadosJuridicos")
@Api(value = "estadosJuridicos", description = "Estados jurídicos")
public class ListasEstadosJuridicosRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Obtener estados jurídicos", notes = "Retorna el listado de estados jurídicos")
    List<ListasEstadosJuridicos> listarEstadosJuridicos() {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstadosJuridicos[] estadosJuridicos = restTemplate.getForObject(serviceUrl + "api/estadosJuridicos", ListasEstadosJuridicos[].class);

        return Arrays.asList(estadosJuridicos);
    }

    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    @ApiOperation(value = "Obtener estado jurídico", notes = "Retorna el estado jurídico")
    ListasEstadosJuridicos obtenerEstadosJuridicos(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstadosJuridicos estadosJuridicos = restTemplate.getForObject(serviceUrl + "api/estadosJuridicos/" + id, ListasEstadosJuridicos.class);

        return estadosJuridicos;
    }
}
