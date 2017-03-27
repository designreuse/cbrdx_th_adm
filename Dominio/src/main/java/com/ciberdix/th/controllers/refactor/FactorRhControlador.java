package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasFactoresRh;
import com.ciberdix.th.repositories.refactor.FactorRhRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    private FactorRhRepository factorRhRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasFactoresRh> listarGeneros() {
        return (List<ListasFactoresRh>) factorRhRepository.findAll();
    }
}
