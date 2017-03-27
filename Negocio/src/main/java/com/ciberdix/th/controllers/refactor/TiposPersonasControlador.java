package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposPersonas;
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
@RequestMapping("/api/tiposPersonas")
public class TiposPersonasControlador {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposPersonas> listarTiposPersonas() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposPersonas[] tiposPersonas = restTemplate.getForObject(serviceUrl + "api/tiposPersonas", ListasTiposPersonas[].class);

        return Arrays.asList(tiposPersonas);
    }    
}
