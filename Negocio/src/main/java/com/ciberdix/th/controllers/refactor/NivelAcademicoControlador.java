package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.refactor.ListasNivelesEstudios;
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
@RequestMapping("/api/nivelAcademico")
public class NivelAcademicoControlador {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();
    
    @RequestMapping(method = RequestMethod.GET)
    List<ListasNivelesEstudios> listarNivelesEstudios() {
        RestTemplate restTemplate = new RestTemplate();
        ListasNivelesEstudios[] nivelesEstudio = restTemplate.getForObject(serviceUrl + "api/nivelAcademico", ListasNivelesEstudios[].class);

        return Arrays.asList(nivelesEstudio);
    }    
}
