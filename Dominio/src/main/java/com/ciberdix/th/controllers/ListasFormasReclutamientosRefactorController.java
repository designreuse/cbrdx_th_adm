package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasFormasReclutamientos;
import com.ciberdix.th.repositories.ListasFormasReclutamientosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 16/05/2017.
 */

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ListasFormasReclutamientos")
public class ListasFormasReclutamientosRefactorController {

    @Autowired
    private ListasFormasReclutamientosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasFormasReclutamientos> findAll() {
        return (List<ListasFormasReclutamientos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasFormasReclutamientos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasFormasReclutamientos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasFormasReclutamientos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasFormasReclutamientos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasFormasReclutamientos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasFormasReclutamientos create(@RequestBody ListasFormasReclutamientos obj) {
        return repository.save(new ListasFormasReclutamientos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasFormasReclutamientos update(@RequestBody ListasFormasReclutamientos obj) {
        return repository.save(obj);
    }

}