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
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ocupaciones")
public class ListasOcupacionesRefactorController {

    @Autowired
    private OcupacionesRefactorRepository ocupacionesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Ocupaciones> listarNivelAcademico() {
        return (List<Ocupaciones>) ocupacionesRepository.findAll();
    }
    
    @RequestMapping(method = RequestMethod.GET,path = "/enabled/")
    List<Ocupaciones> listEnabled() {
        return ocupacionesRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    Ocupaciones crearOcupaciones(@RequestBody Ocupaciones obj) {
        return ocupacionesRepository.save(obj);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void actualizarOcupaciones(@RequestBody Ocupaciones obj){
        ocupacionesRepository.save(obj);
    }     
}
