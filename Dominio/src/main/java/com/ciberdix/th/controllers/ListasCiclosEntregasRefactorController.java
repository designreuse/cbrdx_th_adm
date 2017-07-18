package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasCiclosEntregas;
import com.ciberdix.th.repositories.ListasCiclosEntregasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/ListasCiclosEntregas")
@CrossOrigin
public class ListasCiclosEntregasRefactorController {
    @Autowired
    private ListasCiclosEntregasRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasCiclosEntregas> findAll() {
        return (List<ListasCiclosEntregas>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasCiclosEntregas> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasCiclosEntregas findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasCiclosEntregas> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasCiclosEntregas> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasCiclosEntregas findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasCiclosEntregas create(@RequestBody ListasCiclosEntregas obj) {
        return repository.save(new ListasCiclosEntregas(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasCiclosEntregas update(@RequestBody ListasCiclosEntregas obj) {
        return repository.save(
                new ListasCiclosEntregas(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
