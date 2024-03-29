package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasClasesViviendas;
import com.ciberdix.th.repositories.ListasClasesViviendasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@RestController
@Transactional
@RequestMapping("/api/ListasClasesViviendas")
@CrossOrigin
public class ListasClasesViviendasRefactorController {
    @Autowired
    private ListasClasesViviendasRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasClasesViviendas> findAll() {
        return (List<ListasClasesViviendas>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasClasesViviendas> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasClasesViviendas findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasClasesViviendas> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasClasesViviendas> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasClasesViviendas findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasClasesViviendas create(@RequestBody ListasClasesViviendas obj) {
        return repository.save(new ListasClasesViviendas(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasClasesViviendas update(@RequestBody ListasClasesViviendas obj) {
        return repository.save(
                new ListasClasesViviendas(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
