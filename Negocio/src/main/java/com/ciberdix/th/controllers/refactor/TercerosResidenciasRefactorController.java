package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.TercerosResidencias;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
@CrossOrigin
@RestController
@RequestMapping("/api/tercerosResidencias")
public class TercerosResidenciasRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosResidencias> listarTercerosResidencias() {
        RestTemplate restTemplate = new RestTemplate();
        TercerosResidencias[] TercerosResidencias = restTemplate.getForObject(serviceUrl + "api/TercerosResidencias", TercerosResidencias[].class);

        return Arrays.asList(TercerosResidencias);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarId/{id}")
    TercerosResidencias obtenerActividadEconomica(@PathVariable Long id) {
        RestTemplate restTemplate = new RestTemplate();
        TercerosResidencias actividad = restTemplate.getForObject(serviceUrl + "api/TercerosResidencias/buscarId/" + id, TercerosResidencias.class);

        return actividad;
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosResidencias crearActividadEconomica(@RequestBody TercerosResidencias obj) {
        RestTemplate restTemplate = new RestTemplate();
        TercerosResidencias tercero = restTemplate.postForObject(serviceUrl + "api/TercerosResidencias", obj, TercerosResidencias.class);

        return tercero;
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarActividadEconomica(@RequestBody TercerosResidencias obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "api/TercerosResidencias", obj);
    }
}
