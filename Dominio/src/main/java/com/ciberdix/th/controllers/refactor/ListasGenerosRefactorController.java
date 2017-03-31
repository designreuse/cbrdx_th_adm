package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasGeneros;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.ciberdix.th.repositories.refactor.ListasGenerosRefactorRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/generos")
public class ListasGenerosRefactorController {

    @Autowired
    private ListasGenerosRefactorRepository generosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasGeneros> listarTerceros() {
        return (List<ListasGeneros>) generosRepository.findAll();
    }
    
    @RequestMapping(method = RequestMethod.GET,path = "/enabled/")
    List<ListasGeneros> listEnabled() {
        return generosRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasGeneros crearGeneros(@RequestBody ListasGeneros obj) {
        return generosRepository.save(obj);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void actualizarGeneros(@RequestBody ListasGeneros obj){
        generosRepository.save(obj);
    }    
}
