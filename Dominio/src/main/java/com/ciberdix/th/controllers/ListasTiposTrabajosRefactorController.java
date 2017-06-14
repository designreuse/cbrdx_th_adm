package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasTiposTrabajos;
import com.ciberdix.th.repositories.ListasTiposTrabajosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 30/05/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/ListasTiposTrabajos")
@CrossOrigin
public class ListasTiposTrabajosRefactorController {

    @Autowired
    private ListasTiposTrabajosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposTrabajos> findAll() {
        return (List<ListasTiposTrabajos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposTrabajos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposTrabajos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposTrabajos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposTrabajos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposTrabajos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposTrabajos create(@RequestBody ListasTiposTrabajos obj) {
        return repository.save(new ListasTiposTrabajos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposTrabajos update(@RequestBody ListasTiposTrabajos obj) {
        return repository.save(
                new ListasTiposTrabajos(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }

}
