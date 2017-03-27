package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasSectoresEmpresas;
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
@RequestMapping("/api/sectoresEmpresas")
public class SectoresEmpresasControlador {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();
    
    @RequestMapping(method = RequestMethod.GET)
    List<ListasSectoresEmpresas> listarSectoresEmpresas() {
        RestTemplate restTemplate = new RestTemplate();
        ListasSectoresEmpresas[] sectoresEmpresas = restTemplate.getForObject(serviceUrl + "api/sectoresEmpresas", ListasSectoresEmpresas[].class);

        return Arrays.asList(sectoresEmpresas);
    }    
}
