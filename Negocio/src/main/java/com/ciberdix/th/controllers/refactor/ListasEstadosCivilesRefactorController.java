package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasEstadosCiviles;
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
@RequestMapping("/api/estadosCiviles")
public class ListasEstadosCivilesRefactorController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();
    
    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosCiviles> listarEstadosCiviles() {
        RestTemplate restTemplate = new RestTemplate();
        ListasEstadosCiviles[] estados = restTemplate.getForObject(serviceUrl + "api/estadosCiviles", ListasEstadosCiviles[].class);

        return Arrays.asList(estados);
    }    
}
