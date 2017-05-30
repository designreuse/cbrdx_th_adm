package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasTiposVehiculos;
import com.ciberdix.th.repositories.ListasTiposVehiculosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@CrossOrigin
@RestController
@Transactional
@RequestMapping("/api/ListasTiposVehiculos")
public class ListasTiposVehiculosRefactorController {
    @Autowired
    private ListasTiposVehiculosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposVehiculos> findAll() {
        return (List<ListasTiposVehiculos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposVehiculos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposVehiculos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposVehiculos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposVehiculos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposVehiculos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposVehiculos create(@RequestBody ListasTiposVehiculos obj) {
        return repository.save(new ListasTiposVehiculos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposVehiculos update(@RequestBody ListasTiposVehiculos obj) {
        return repository.save(
                new ListasTiposVehiculos(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
