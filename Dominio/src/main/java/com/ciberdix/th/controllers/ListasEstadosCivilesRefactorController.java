package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEstadosCiviles;
import com.ciberdix.th.repositories.ListasEstadosCivilesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ListasEstadosCiviles")
public class ListasEstadosCivilesRefactorController {

    @Autowired
    private ListasEstadosCivilesRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosCiviles> findAll() {
        return (List<ListasEstadosCiviles>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosCiviles> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEstadosCiviles findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEstadosCiviles> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEstadosCiviles> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosCiviles findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosCiviles create(@RequestBody ListasEstadosCiviles obj) {
        return repository.save(new ListasEstadosCiviles(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstadosCiviles update(@RequestBody ListasEstadosCiviles obj) {
        return repository.save(obj);
    }
}
