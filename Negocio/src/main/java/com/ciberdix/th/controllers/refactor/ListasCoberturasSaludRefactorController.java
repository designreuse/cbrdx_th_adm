package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasCoberturasSalud;
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
@RequestMapping("/api/coberturasSalud")
@Api(value = "coberturasSalud", description = "Coberturas salud")
public class ListasCoberturasSaludRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Obtener coberturas de salud", notes = "Retorna el listado de Coberturas de Salud")
    List<ListasCoberturasSalud> listarCoberturasSalud() {
        RestTemplate restTemplate = new RestTemplate();
        ListasCoberturasSalud[] coberturasSalud = restTemplate.getForObject(serviceUrl + "api/coberturasSalud", ListasCoberturasSalud[].class);

        return Arrays.asList(coberturasSalud);
    }

    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    @ApiOperation(value = "Obtener cobertura de salud", notes = "Retorna la cobertura de salud")
    ListasCoberturasSalud obtenerCoberturasSalud(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        ListasCoberturasSalud coberturasSalud = restTemplate.getForObject(serviceUrl + "api/coberturasSalud/" + id, ListasCoberturasSalud.class);

        return coberturasSalud;
    }    
}
