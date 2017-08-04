package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasConceptosBienestar;
import com.ciberdix.th.repositories.ListasConceptosBienestarRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/ListasConceptosBienestar")
@CrossOrigin
public class ListasConceptosBienestarRefactorController {

    @Autowired
    private  ListasConceptosBienestarRefactorRepository ListasConceptosBienestarRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasConceptosBienestar> findAll() {
        return (List<ListasConceptosBienestar>) ListasConceptosBienestarRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasConceptosBienestar findAll(@PathVariable Integer id) {
        return ListasConceptosBienestarRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasConceptosBienestar> findByEnabled() {
        return (List<ListasConceptosBienestar>) ListasConceptosBienestarRefactorRepository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasConceptosBienestar create(@RequestBody ListasConceptosBienestar obj) {
        return ListasConceptosBienestarRefactorRepository.save(new ListasConceptosBienestar(obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario(), obj.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasConceptosBienestar update(@RequestBody ListasConceptosBienestar obj) {
        return ListasConceptosBienestarRefactorRepository.save(new ListasConceptosBienestar(obj.getIdLista(), obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario(), obj.getAuditoriaFecha()));
    }
    
}
