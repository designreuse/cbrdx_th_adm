package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposContratos;
import com.ciberdix.th.repositories.refactor.ListasTiposContratosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/ListasTiposContratos")
public class ListasTiposContratosRefactorController {
    @Autowired
    private ListasTiposContratosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposContratos> findAll() {
        return (List<ListasTiposContratos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposContratos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposContratos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposContratos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposContratos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposContratos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposContratos create(@RequestBody ListasTiposContratos obj) {
        return repository.save(new ListasTiposContratos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposContratos update(@RequestBody ListasTiposContratos obj) {
        return repository.save(obj);
    }
}
