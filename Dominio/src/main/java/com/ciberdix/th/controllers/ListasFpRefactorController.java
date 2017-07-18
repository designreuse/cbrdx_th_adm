package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasFp;
import com.ciberdix.th.repositories.ListasFpRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ListasFp")
public class ListasFpRefactorController {
    @Autowired
    private ListasFpRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasFp> findAll() {
        return (List<ListasFp>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasFp> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasFp findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasFp> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasFp> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasFp findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasFp create(@RequestBody ListasFp obj) {
        return repository.save(new ListasFp(obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasFp update(@RequestBody ListasFp obj) {
        return repository.save(
                new ListasFp(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                        obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
