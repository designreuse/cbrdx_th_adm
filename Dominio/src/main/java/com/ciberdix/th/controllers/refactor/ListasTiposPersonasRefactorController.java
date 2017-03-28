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
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/tiposPersonas")
public class ListasTiposPersonasRefactorController {

    @Autowired
    TiposPersonaRefactorRepository tiposPersonaRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposPersonas> listarTiposPersonas() {
        return (List<ListasTiposPersonas>) tiposPersonaRepository.findAll();
    }
    
    @RequestMapping(method = RequestMethod.GET,path = "/enabled/")
    List<ListasTiposPersonas> listEnabled() {
        return tiposPersonaRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposPersonas crearTiposPersonas(@RequestBody ListasTiposPersonas obj) {
        return tiposPersonaRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarTiposPersonas(@RequestBody ListasTiposPersonas obj) {
        tiposPersonaRepository.save(obj);
    }    
}
