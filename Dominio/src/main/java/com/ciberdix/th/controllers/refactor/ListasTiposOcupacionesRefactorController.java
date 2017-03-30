package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposOcupaciones;
import com.ciberdix.th.repositories.refactor.ListasTiposOcupacionesRefactorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@Transactional
@RequestMapping("/api/tiposOcupaciones")
@CrossOrigin
public class ListasTiposOcupacionesRefactorController {

    @Autowired
    private ListasTiposOcupacionesRefactorRepository tiposOcupacionesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposOcupaciones> listarTiposOcupaciones() {
        return (List<ListasTiposOcupaciones>) tiposOcupacionesRepository.findAll();
    }
    
    @RequestMapping(method = RequestMethod.GET,path = "/enabled/")
    List<ListasTiposOcupaciones> listEnabled() {
        return tiposOcupacionesRepository.findByIndicadorHabilitadoIsTrue();
    }    

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    ListasTiposOcupaciones obtenerTiposOcupaciones(@PathVariable Integer id) {
        return tiposOcupacionesRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposOcupaciones crearListasTiposOcupaciones(@RequestBody ListasTiposOcupaciones obj) {
        return tiposOcupacionesRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarListasTiposOcupaciones(@RequestBody ListasTiposOcupaciones obj) {
        tiposOcupacionesRepository.save(obj);
    }
}
