package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasEstadosJuridicos;
import com.ciberdix.th.repositories.refactor.ListasEstadosJuridicosRefactorRepository;
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
@RequestMapping("/api/estadosJuridicos")
@CrossOrigin
public class ListasEstadosJuridicosRefactorController {

    @Autowired
    private ListasEstadosJuridicosRefactorRepository estadosJuridicosRepository;
    
    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosJuridicos> listarEstadosJuridicos() {
        return (List<ListasEstadosJuridicos>) estadosJuridicosRepository.findAll();
    }    
    
    @RequestMapping(method = RequestMethod.GET,path = "/enabled/")
    List<ListasEstadosJuridicos> listEnabled() {
        return estadosJuridicosRepository.findByIndicadorHabilitadoIsTrue();
    }     
    
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    ListasEstadosJuridicos obtenerEstadoJuridico(@PathVariable Integer id) {
        return estadosJuridicosRepository.findOne(id);
    }    

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosJuridicos crearListasEstadosJuridicos(@RequestBody ListasEstadosJuridicos obj){
        return estadosJuridicosRepository.save(obj);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void actualizarListasEstadosJuridicos(@RequestBody ListasEstadosJuridicos obj){
        estadosJuridicosRepository.save(obj);
    }     
}
