package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEstadosDiligenciados;
import com.ciberdix.th.repositories.ListasEstadosDiligenciadosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 13/06/2017.
 */

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ListasEstadosDiligenciados")
public class ListasEstadosDiligenciadosRefactorController {

    @Autowired
    private ListasEstadosDiligenciadosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosDiligenciados> findAll() {
        return (List<ListasEstadosDiligenciados>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosDiligenciados> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEstadosDiligenciados findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEstadosDiligenciados> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEstadosDiligenciados> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosDiligenciados findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosDiligenciados create(@RequestBody ListasEstadosDiligenciados obj) {
        return repository.save(new ListasEstadosDiligenciados(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstadosDiligenciados update(@RequestBody ListasEstadosDiligenciados obj) {
        return repository.save(
                new ListasEstadosDiligenciados(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }

}
