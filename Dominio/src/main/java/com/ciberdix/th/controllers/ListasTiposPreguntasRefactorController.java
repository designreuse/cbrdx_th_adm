package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasTiposPreguntas;
import com.ciberdix.th.repositories.ListasTiposPreguntasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 9/07/2017.
 */
@CrossOrigin
@RestController
@Transactional
@RequestMapping("/api/ListasTiposPreguntas")
public class ListasTiposPreguntasRefactorController {
    @Autowired
    private ListasTiposPreguntasRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposPreguntas> findAll() {
        return (List<ListasTiposPreguntas>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposPreguntas> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposPreguntas findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposPreguntas> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposPreguntas> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposPreguntas findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposPreguntas create(@RequestBody ListasTiposPreguntas obj) {
        return repository.save(new ListasTiposPreguntas(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposPreguntas update(@RequestBody ListasTiposPreguntas obj) {
        return repository.save(
                new ListasTiposPreguntas(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
