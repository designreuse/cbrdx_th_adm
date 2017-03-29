package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposAfiliacion;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/api/tiposAfiliacion")
public class TiposAfiliacionControlador {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposAfiliacion> listarTiposAfiliacion() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposAfiliacion[] tiposAfiliacion = restTemplate.getForObject(serviceUrl + "api/tiposAfiliacion", ListasTiposAfiliacion[].class);

        return Arrays.asList(tiposAfiliacion);
    }    
}
