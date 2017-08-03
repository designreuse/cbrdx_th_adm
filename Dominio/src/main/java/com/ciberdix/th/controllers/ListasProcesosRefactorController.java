package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasProcesos;
import com.ciberdix.th.repositories.ListasProcesosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 03/08/17.
 */
@RestController
@Transactional
@RequestMapping("/api/ListasProcesos")
@CrossOrigin
public class ListasProcesosRefactorController {

    @Autowired
    private ListasProcesosRefactorRepository listasProcesosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasProcesos> findAll() {
        return (List<ListasProcesos>) listasProcesosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasProcesos findAll(@PathVariable Integer id) {
        return listasProcesosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasProcesos> findByEnabled() {
        return (List<ListasProcesos>) listasProcesosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasProcesos create(@RequestBody ListasProcesos obj) {
        return listasProcesosRefactorRepository.save(new ListasProcesos(obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario(), obj.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasProcesos update(@RequestBody ListasProcesos obj) {
        return listasProcesosRefactorRepository.save(new ListasProcesos(obj.getIdLista(), obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario(), obj.getAuditoriaFecha()));
    }
}
