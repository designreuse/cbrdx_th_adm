package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasTiposDocumentos;
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
@RequestMapping("/api/tiposDocumentos")
public class TiposDocumentosControlador {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposDocumentos> listarTiposDocumentos() {
        RestTemplate restTemplate = new RestTemplate();
        ListasTiposDocumentos[] tiposDocumentos = restTemplate.getForObject(serviceUrl + "api/tiposDocumentos", ListasTiposDocumentos[].class);

        return Arrays.asList(tiposDocumentos);
    }    
}
