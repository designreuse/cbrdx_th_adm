package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Ocupaciones;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ciberdix.th.repositories.refactor.OcupacionesRefactorRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ocupaciones")
public class OcupacionesControlador {

    @Autowired
    private OcupacionesRefactorRepository ocupacionesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Ocupaciones> listarNivelAcademico() {
        return (List<Ocupaciones>) ocupacionesRepository.findAll();
    }
}
