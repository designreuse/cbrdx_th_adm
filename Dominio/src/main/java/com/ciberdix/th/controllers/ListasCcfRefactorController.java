package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasCcf;
import com.ciberdix.th.repositories.ListasCcfRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ListasCcf")
public class ListasCcfRefactorController {
    @Autowired
    private ListasCcfRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasCcf> findAll() {
        return (List<ListasCcf>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasCcf> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasCcf findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasCcf> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasCcf> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasCcf findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasCcf create(@RequestBody ListasCcf obj) {
        return repository.save(new ListasCcf(obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasCcf update(@RequestBody ListasCcf obj) {
        return repository.save(
                new ListasCcf(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                        obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
