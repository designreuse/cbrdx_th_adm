package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposServiciosVehiculos;
import com.ciberdix.th.repositories.refactor.ListasTiposServiciosVehiculosRefactorRepository;
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
@RequestMapping("/api/listasTiposServiciosVehiculos")
public class ListasTiposServiciosVehiculosRefactorController {
    @Autowired
    private ListasTiposServiciosVehiculosRefactorRepository listasTiposServiciosVehiculosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposServiciosVehiculos> findAll() {
        return (List<ListasTiposServiciosVehiculos>) listasTiposServiciosVehiculosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposServiciosVehiculos findOne(@PathVariable Integer id) {
        return listasTiposServiciosVehiculosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposServiciosVehiculos create(@RequestBody ListasTiposServiciosVehiculos obj) {
        return listasTiposServiciosVehiculosRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposServiciosVehiculos obj) {
        listasTiposServiciosVehiculosRefactorRepository.save(obj);
    }
}
