package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposAfiliacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ciberdix.th.repositories.refactor.TiposAfiliacionRefactorRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/tiposAfiliacion")
public class TiposAfiliacionControlador {

    @Autowired
    private TiposAfiliacionRefactorRepository tiposAfiliacionRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposAfiliacion> listarTerceros() {
        return (List<ListasTiposAfiliacion>) tiposAfiliacionRepository.findAll();
    }
}
