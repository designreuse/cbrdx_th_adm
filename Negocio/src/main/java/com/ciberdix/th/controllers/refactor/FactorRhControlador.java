package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasFactoresRh;
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
@RequestMapping("/api/factorRh")
public class FactorRhControlador {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();
    
    @RequestMapping(method = RequestMethod.GET)
    List<ListasFactoresRh> listarFactorRh() {
        RestTemplate restTemplate = new RestTemplate();
        ListasFactoresRh[] factores = restTemplate.getForObject(serviceUrl + "api/factorRh", ListasFactoresRh[].class);

        return Arrays.asList(factores);
    }     
}
