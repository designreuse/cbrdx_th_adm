package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasFormasContrataciones;
import com.ciberdix.th.repositories.ListasFormasContratacionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 18/05/2017.
 */

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ListasFormasContrataciones")
public class ListasFormasContratacionesRefactorController {

    @Autowired
    private ListasFormasContratacionesRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasFormasContrataciones> findAll() {
        return (List<ListasFormasContrataciones>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasFormasContrataciones> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasFormasContrataciones findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasFormasContrataciones> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasFormasContrataciones> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasFormasContrataciones findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasFormasContrataciones create(@RequestBody ListasFormasContrataciones obj) {
        return repository.save(new ListasFormasContrataciones(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasFormasContrataciones update(@RequestBody ListasFormasContrataciones obj) {
        return repository.save(obj);
    }

}
