package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposVehiculos;
import com.ciberdix.th.repositories.refactor.ListasTiposVehiculosRefactorRepository;
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
@RequestMapping("/api/listasTiposVehiculos")
public class ListasTiposVehiculosRefactorController {
    @Autowired
    private ListasTiposVehiculosRefactorRepository listasTiposVehiculosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposVehiculos> findAll() {
        return (List<ListasTiposVehiculos>) listasTiposVehiculosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposVehiculos findOne(@PathVariable Integer id) {
        return listasTiposVehiculosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposVehiculos create(@RequestBody ListasTiposVehiculos obj) {
        return listasTiposVehiculosRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposVehiculos obj) {
        listasTiposVehiculosRefactorRepository.save(obj);
    }
}
