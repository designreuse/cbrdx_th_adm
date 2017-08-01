package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEstadosAccidentes;
import com.ciberdix.th.repositories.ListasEstadosAccidentesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ListasEstadosAccidentes")
public class ListasEstadosAccidentesRefactorController {
    @Autowired
    private ListasEstadosAccidentesRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosAccidentes> findAll() {
        return (List<ListasEstadosAccidentes>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosAccidentes> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEstadosAccidentes findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEstadosAccidentes> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEstadosAccidentes> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosAccidentes findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosAccidentes create(@RequestBody ListasEstadosAccidentes obj) {
        return repository.save(new ListasEstadosAccidentes(obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstadosAccidentes update(@RequestBody ListasEstadosAccidentes obj) {
        return repository.save(
                new ListasEstadosAccidentes(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                        obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
