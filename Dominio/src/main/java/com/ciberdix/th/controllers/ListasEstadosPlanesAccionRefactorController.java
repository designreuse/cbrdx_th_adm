package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEstadosPlanesAccion;
import com.ciberdix.th.repositories.ListasEstadosPlanesAccionRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/ListasEstadosPlanesAccion")
@CrossOrigin
public class ListasEstadosPlanesAccionRefactorController {
    @Autowired
    private ListasEstadosPlanesAccionRefactorRepository repository;
    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosPlanesAccion> findAll() {
        return (List<ListasEstadosPlanesAccion>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosPlanesAccion> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEstadosPlanesAccion findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEstadosPlanesAccion> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEstadosPlanesAccion> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosPlanesAccion findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosPlanesAccion create(@RequestBody ListasEstadosPlanesAccion obj) {
        return repository.save(new ListasEstadosPlanesAccion(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstadosPlanesAccion update(@RequestBody ListasEstadosPlanesAccion obj) {
        return repository.save(
                new ListasEstadosPlanesAccion(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
