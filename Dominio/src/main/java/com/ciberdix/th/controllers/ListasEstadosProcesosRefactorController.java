package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEstadosProcesos;
import com.ciberdix.th.repositories.ListasEstadosProcesosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 5/06/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/ListasEstadosProcesos")
@CrossOrigin
public class ListasEstadosProcesosRefactorController {

    @Autowired
    private ListasEstadosProcesosRefactorRepository repository;
    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosProcesos> findAll() {
        return (List<ListasEstadosProcesos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosProcesos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEstadosProcesos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEstadosProcesos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEstadosProcesos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosProcesos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosProcesos create(@RequestBody ListasEstadosProcesos obj) {
        return repository.save(new ListasEstadosProcesos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstadosProcesos update(@RequestBody ListasEstadosProcesos obj) {
        return repository.save(
                new ListasEstadosProcesos(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }

}
