package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasRequerimientosAcciones;
import com.ciberdix.th.repositories.ListasRequerimientosAccionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/ListasRequerimientosAcciones")
@CrossOrigin
public class ListasRequerimientosAccionesRefactorController {

    private final ListasRequerimientosAccionesRefactorRepository repository;

    @Autowired
    public ListasRequerimientosAccionesRefactorController(ListasRequerimientosAccionesRefactorRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<ListasRequerimientosAcciones> findAll() {
        return (List<ListasRequerimientosAcciones>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasRequerimientosAcciones> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasRequerimientosAcciones findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasRequerimientosAcciones> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasRequerimientosAcciones> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasRequerimientosAcciones findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasRequerimientosAcciones create(@RequestBody ListasRequerimientosAcciones obj) {
        return repository.save(new ListasRequerimientosAcciones(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasRequerimientosAcciones update(@RequestBody ListasRequerimientosAcciones obj) {
        return repository.save(obj);
    }
}
