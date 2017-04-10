package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasEstadosCargos;
import com.ciberdix.th.repositories.refactor.ListasEstadosCargosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
@RestController
@Transactional
@RequestMapping("/api/listasEstadosCargos")
@CrossOrigin
public class ListasEstadosCargosRefactorController {
    @Autowired
    private ListasEstadosCargosRefactorRepository listasEstadosCargosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosCargos> findAll() {
        return (List<ListasEstadosCargos>) listasEstadosCargosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    ListasEstadosCargos findOne(@PathVariable Integer id) {
        return listasEstadosCargosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/codigo/{codigo}")
    ListasEstadosCargos findOne(@PathVariable String codigo) {
        return listasEstadosCargosRefactorRepository.findByCodigo(codigo);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/enabled/")
    List<ListasEstadosCargos> findEnabled() {
        return listasEstadosCargosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosCargos create(@RequestBody ListasEstadosCargos obj) {
        return listasEstadosCargosRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasEstadosCargos obj) {
        listasEstadosCargosRefactorRepository.save(obj);
    }
}
