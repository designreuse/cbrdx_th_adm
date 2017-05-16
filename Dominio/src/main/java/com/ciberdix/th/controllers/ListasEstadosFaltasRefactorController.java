package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEstadosFaltas;
import com.ciberdix.th.repositories.ListasEstadosFaltasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 6/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/ListasEstadosFaltas")
public class ListasEstadosFaltasRefactorController {
    @Autowired
    private ListasEstadosFaltasRefactorRepository repository;
    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosFaltas> findAll() {
        return (List<ListasEstadosFaltas>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosFaltas> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEstadosFaltas findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEstadosFaltas> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEstadosFaltas> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosFaltas findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosFaltas create(@RequestBody ListasEstadosFaltas obj) {
        return repository.save(new ListasEstadosFaltas(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstadosFaltas update(@RequestBody ListasEstadosFaltas obj) {
        return repository.save(obj);
    }
}
