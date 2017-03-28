package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasEstadosCiviles;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ciberdix.th.repositories.refactor.EstadosCivilesRefactorRepository;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/estadosCiviles")
public class ListasEstadosCivilesRefactorController {

    @Autowired
    private EstadosCivilesRefactorRepository estadosCivilesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosCiviles> listarEstadosCiviles() {
        return (List<ListasEstadosCiviles>) estadosCivilesRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosCiviles> listEnabled() {
        return estadosCivilesRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosCiviles crearEstadosCiviles(@RequestBody ListasEstadosCiviles ec) {
        return estadosCivilesRepository.save(ec);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void actualizarEstadosCiviles(@RequestBody ListasEstadosCiviles ec){
        estadosCivilesRepository.save(ec);
    }    
}
