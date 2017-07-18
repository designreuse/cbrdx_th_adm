package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEps;
import com.ciberdix.th.repositories.ListasEpsRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ListasEps")
public class ListasEpsRefactorController {
    @Autowired
    private ListasEpsRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEps> findAll() {
        return (List<ListasEps>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEps> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEps findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEps> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEps> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEps findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEps create(@RequestBody ListasEps obj) {
        return repository.save(new ListasEps(obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEps update(@RequestBody ListasEps obj) {
        return repository.save(
                new ListasEps(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                        obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
