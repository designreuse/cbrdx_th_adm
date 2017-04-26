package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasClasesTerceros;
import com.ciberdix.th.repositories.refactor.ListasClasesTercerosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 26/04/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/ListasClasesTerceros")
@CrossOrigin
public class ListasClasesTercerosRefactorController {

    @Autowired
    private ListasClasesTercerosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasClasesTerceros> findAll() {
        return (List<ListasClasesTerceros>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasClasesTerceros> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasClasesTerceros findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasClasesTerceros> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasClasesTerceros> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasClasesTerceros findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasClasesTerceros create(@RequestBody ListasClasesTerceros obj) {
        return repository.save(new ListasClasesTerceros(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasClasesTerceros update(@RequestBody ListasClasesTerceros obj) {
        return repository.save(obj);
    }

}
