package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasTiposServiciosVehiculos;
import com.ciberdix.th.repositories.ListasTiposServiciosVehiculosRefactorRepository;
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
@RequestMapping("/api/ListasTiposServiciosVehiculos")
public class ListasTiposServiciosVehiculosRefactorController {
    @Autowired
    private ListasTiposServiciosVehiculosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposServiciosVehiculos> findAll() {
        return (List<ListasTiposServiciosVehiculos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposServiciosVehiculos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposServiciosVehiculos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposServiciosVehiculos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposServiciosVehiculos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposServiciosVehiculos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposServiciosVehiculos create(@RequestBody ListasTiposServiciosVehiculos obj) {
        return repository.save(new ListasTiposServiciosVehiculos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposServiciosVehiculos update(@RequestBody ListasTiposServiciosVehiculos obj) {
        return repository.save(
                new ListasTiposServiciosVehiculos(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
