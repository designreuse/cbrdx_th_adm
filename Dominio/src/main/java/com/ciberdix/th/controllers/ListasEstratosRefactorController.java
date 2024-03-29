package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEstratos;
import com.ciberdix.th.repositories.ListasEstratosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@RestController
@Transactional
@RequestMapping("/api/ListasEstratos")
@CrossOrigin
public class ListasEstratosRefactorController {
    @Autowired
    private ListasEstratosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstratos> findAll() {
        return (List<ListasEstratos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstratos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEstratos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEstratos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEstratos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstratos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstratos create(@RequestBody ListasEstratos obj) {
        return repository.save(new ListasEstratos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstratos update(@RequestBody ListasEstratos obj) {
        return repository.save(
                new ListasEstratos(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
