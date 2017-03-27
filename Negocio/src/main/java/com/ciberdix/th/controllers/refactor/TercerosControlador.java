package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.Terceros;
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
@RequestMapping("/api/terceros")
@Api(value = "terceros", description = "Terceros")
public class TercerosControlador {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Get Terceros", notes = "Retorna el listado de terceros")
    List<Terceros> listarTerceros() {
        RestTemplate restTemplate = new RestTemplate();
        Terceros[] terceros = restTemplate.getForObject(serviceUrl + "api/terceros", Terceros[].class);

        return Arrays.asList(terceros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @ApiOperation(value = "Get Terceros por id", notes = "Retorna el tercero por ID")
    Terceros obtenerTercero(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        Terceros tercero = restTemplate.getForObject(serviceUrl + "api/terceros/" + id, Terceros.class);

        return tercero;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Post Terceros", notes = "Retorna el tercero creado")
    Terceros crearTercero(@RequestBody Terceros t) {
        RestTemplate restTemplate = new RestTemplate();
        Terceros tercero = restTemplate.postForObject(serviceUrl + "api/terceros", t, Terceros.class);

        return tercero;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "Put Terceros", notes = "Actualiza el tercero")
    void actualizarTercero(@RequestBody Terceros tercero) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "api/terceros", tercero);
    }
}
