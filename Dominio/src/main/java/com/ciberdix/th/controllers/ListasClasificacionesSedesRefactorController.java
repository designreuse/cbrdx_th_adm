package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasClasificacionesSedes;
import com.ciberdix.th.repositories.ListasClasificacionesSedesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/ListasClasificacionesSedes")
public class ListasClasificacionesSedesRefactorController {
    @Autowired
    private ListasClasificacionesSedesRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasClasificacionesSedes> findAll() {
        return (List<ListasClasificacionesSedes>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasClasificacionesSedes> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasClasificacionesSedes findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasClasificacionesSedes> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasClasificacionesSedes> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasClasificacionesSedes findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasClasificacionesSedes create(@RequestBody ListasClasificacionesSedes obj) {
        return repository.save(new ListasClasificacionesSedes(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasClasificacionesSedes update(@RequestBody ListasClasificacionesSedes obj) {
        return repository.save(obj);
    }
}
