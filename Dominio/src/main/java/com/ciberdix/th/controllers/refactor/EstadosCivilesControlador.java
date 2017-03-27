package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasEstadosCiviles;
import com.ciberdix.th.repositories.refactor.EstadosCivilesRepository;
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
@RequestMapping("/api/estadosCiviles")
public class EstadosCivilesControlador {

    @Autowired
    private EstadosCivilesRepository estadosCivilesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosCiviles> listarTerceros() {
        return (List<ListasEstadosCiviles>) estadosCivilesRepository.findAll();
    }
}
