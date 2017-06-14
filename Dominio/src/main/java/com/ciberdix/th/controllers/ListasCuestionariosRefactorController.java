package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasCuestionarios;
import com.ciberdix.th.repositories.ListasCuestionariosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 19/05/2017.
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ListasCuestionarios")
public class ListasCuestionariosRefactorController {

    @Autowired
    private ListasCuestionariosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasCuestionarios> findAll() {
        return (List<ListasCuestionarios>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasCuestionarios> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasCuestionarios findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasCuestionarios> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasCuestionarios> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasCuestionarios findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasCuestionarios create(@RequestBody ListasCuestionarios obj) {
        return repository.save(new ListasCuestionarios(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasCuestionarios update(@RequestBody ListasCuestionarios obj) {
        return repository.save(
                new ListasCuestionarios(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }

}
