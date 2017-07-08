package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasPruebasTecnicas;
import com.ciberdix.th.repositories.ListasPruebasTecnicasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
@RestController
@Transactional
@RequestMapping("/api/ListasPruebasTecnicas")
@CrossOrigin
public class ListasPruebasTecnicasRefactorController {
    @Autowired
    private ListasPruebasTecnicasRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasPruebasTecnicas> findAll() {
        return (List<ListasPruebasTecnicas>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasPruebasTecnicas> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasPruebasTecnicas findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasPruebasTecnicas> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasPruebasTecnicas> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasPruebasTecnicas findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasPruebasTecnicas create(@RequestBody ListasPruebasTecnicas obj) {
        return repository.save(new ListasPruebasTecnicas(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasPruebasTecnicas update(@RequestBody ListasPruebasTecnicas obj) {
        return repository.save(
                new ListasPruebasTecnicas(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
