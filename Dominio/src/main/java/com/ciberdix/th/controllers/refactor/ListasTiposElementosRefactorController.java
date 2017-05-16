package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.ListasTiposElementos;
import com.ciberdix.th.repositories.ListasTiposElementosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/ListasTiposElementos")
public class ListasTiposElementosRefactorController {
    @Autowired
    private ListasTiposElementosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposElementos> findAll() {
        return (List<ListasTiposElementos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposElementos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposElementos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposElementos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposElementos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposElementos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposElementos create(@RequestBody ListasTiposElementos obj) {
        return repository.save(new ListasTiposElementos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposElementos update(@RequestBody ListasTiposElementos obj) {
        return repository.save(obj);
    }
}
