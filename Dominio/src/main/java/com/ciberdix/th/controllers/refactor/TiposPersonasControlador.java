package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposPersonas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ciberdix.th.repositories.refactor.TiposPersonaRefactorRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/tiposPersonas")
public class TiposPersonasControlador {

    @Autowired
    TiposPersonaRefactorRepository tiposPersonaRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposPersonas> listarTiposPersonas() {
        return (List<ListasTiposPersonas>) tiposPersonaRepository.findAll();
    }
}
