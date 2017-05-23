package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEstadosRequerimientos;
import com.ciberdix.th.repositories.ListasEstadosRequerimientosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/ListasEstadosRequerimientos")
@CrossOrigin
public class ListasEstadosRequerimientosRefactorController {

    private final ListasEstadosRequerimientosRefactorRepository repository;

    @Autowired
    public ListasEstadosRequerimientosRefactorController(ListasEstadosRequerimientosRefactorRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosRequerimientos> findAll() {
        return (List<ListasEstadosRequerimientos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosRequerimientos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEstadosRequerimientos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEstadosRequerimientos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEstadosRequerimientos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosRequerimientos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosRequerimientos create(@RequestBody ListasEstadosRequerimientos obj) {
        return repository.save(new ListasEstadosRequerimientos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstadosRequerimientos update(@RequestBody ListasEstadosRequerimientos obj) {
        return repository.save(
                new ListasEstadosRequerimientos(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
