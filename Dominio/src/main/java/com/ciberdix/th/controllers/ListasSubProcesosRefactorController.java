package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasSubProcesos;
import com.ciberdix.th.repositories.ListasSubProcesosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 03/08/17.
 */
@RestController
@Transactional
@RequestMapping("/api/ListasSubProcesos")
@CrossOrigin
public class ListasSubProcesosRefactorController {
    @Autowired
    private ListasSubProcesosRefactorRepository listasSubProcesosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasSubProcesos> findAll() {
        return (List<ListasSubProcesos>) listasSubProcesosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasSubProcesos findAll(@PathVariable Integer id) {
        return listasSubProcesosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasSubProcesos> findByEnabled() {
        return (List<ListasSubProcesos>) listasSubProcesosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasSubProcesos create(@RequestBody ListasSubProcesos obj) {
        return listasSubProcesosRefactorRepository.save(new ListasSubProcesos(obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario(), obj.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasSubProcesos update(@RequestBody ListasSubProcesos obj) {
        return listasSubProcesosRefactorRepository.save(new ListasSubProcesos(obj.getIdLista(), obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario(), obj.getAuditoriaFecha()));
    }
}
