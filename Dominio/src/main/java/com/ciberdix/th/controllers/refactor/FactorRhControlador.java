package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasFactoresRh;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ciberdix.th.repositories.refactor.FactorRhRefactorRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/factorRh")
public class FactorRhControlador {

    @Autowired
    private FactorRhRefactorRepository factorRhRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasFactoresRh> listarGeneros() {
        return (List<ListasFactoresRh>) factorRhRepository.findAll();
    }
    
    @RequestMapping(method = RequestMethod.GET,path = "/enabled/")
    List<ListasFactoresRh> listEnabled() {
        return factorRhRepository.findByIndicadorHabilitadoIsTrue();
    }    
}
