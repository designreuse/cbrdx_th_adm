package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasResultadosAccidente;
import com.ciberdix.th.repositories.ListasResultadosAccidenteRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/ListasResultadosAccidente")
@CrossOrigin
public class ListasResultadosAccidenteRefactorController {

    @Autowired
    private ListasResultadosAccidenteRefactorRepository ListasResultadosAccidenteRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasResultadosAccidente> findAll() {
        return (List<ListasResultadosAccidente>) ListasResultadosAccidenteRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasResultadosAccidente findAll(@PathVariable Integer id) {
        return ListasResultadosAccidenteRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasResultadosAccidente> findByEnabled() {
        return (List<ListasResultadosAccidente>) ListasResultadosAccidenteRefactorRepository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasResultadosAccidente create(@RequestBody ListasResultadosAccidente obj) {
        return ListasResultadosAccidenteRefactorRepository.save(new ListasResultadosAccidente(obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario(), obj.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasResultadosAccidente update(@RequestBody ListasResultadosAccidente obj) {
        return ListasResultadosAccidenteRefactorRepository.save(new ListasResultadosAccidente(obj.getIdLista(), obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario(), obj.getAuditoriaFecha()));
    }
    
}
