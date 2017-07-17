package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEstadosTerceros;
import com.ciberdix.th.repositories.ListasEstadosTercerosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
@RestController
@Transactional
@RequestMapping("/api/ListasEstadosTerceros")
@CrossOrigin
public class ListasEstadosTercerosRefactorController {
    @Autowired
    private ListasEstadosTercerosRefactorRepository repository;
    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosTerceros> findAll() {
        return (List<ListasEstadosTerceros>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosTerceros> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEstadosTerceros findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEstadosTerceros> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEstadosTerceros> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosTerceros findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosTerceros create(@RequestBody ListasEstadosTerceros obj) {
        return repository.save(new ListasEstadosTerceros(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstadosTerceros update(@RequestBody ListasEstadosTerceros obj) {
        return repository.save(
                new ListasEstadosTerceros(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
