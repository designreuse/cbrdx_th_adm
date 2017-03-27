package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.Ocupaciones;
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
@RequestMapping("/api/ocupaciones")
public class OcupacionesControlador {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();
    
    @RequestMapping(method = RequestMethod.GET)
    List<Ocupaciones> listarOcupaciones() {
        RestTemplate restTemplate = new RestTemplate();
        Ocupaciones[] ocupaciones = restTemplate.getForObject(serviceUrl + "api/ocupaciones", Ocupaciones[].class);

        return Arrays.asList(ocupaciones);
    }    
}
