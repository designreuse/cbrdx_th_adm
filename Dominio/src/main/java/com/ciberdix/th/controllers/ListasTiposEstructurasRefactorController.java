package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasTiposEstructuras;
import com.ciberdix.th.repositories.ListasTiposEstructurasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/ListasTiposEstructuras")
public class ListasTiposEstructurasRefactorController {
    @Autowired
    private ListasTiposEstructurasRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposEstructuras> findAll() {
        return (List<ListasTiposEstructuras>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposEstructuras> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposEstructuras findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposEstructuras> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposEstructuras> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposEstructuras findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposEstructuras create(@RequestBody ListasTiposEstructuras obj) {
        return repository.save(new ListasTiposEstructuras(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposEstructuras update(@RequestBody ListasTiposEstructuras obj) {
        return repository.save(
                new ListasTiposEstructuras(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
