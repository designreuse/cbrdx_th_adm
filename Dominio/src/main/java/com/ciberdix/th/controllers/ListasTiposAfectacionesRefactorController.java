package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasTiposAfectaciones;
import com.ciberdix.th.repositories.ListasTiposAfectacionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
@RestController
@Transactional
@RequestMapping("/api/ListasTiposAfectaciones")
@CrossOrigin
public class ListasTiposAfectacionesRefactorController {
    @Autowired
    private ListasTiposAfectacionesRefactorRepository repository;
    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposAfectaciones> findAll() {
        return (List<ListasTiposAfectaciones>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposAfectaciones> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposAfectaciones findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposAfectaciones> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposAfectaciones> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposAfectaciones findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposAfectaciones create(@RequestBody ListasTiposAfectaciones obj) {
        return repository.save(new ListasTiposAfectaciones(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposAfectaciones update(@RequestBody ListasTiposAfectaciones obj) {
        return repository.save(
                new ListasTiposAfectaciones(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
