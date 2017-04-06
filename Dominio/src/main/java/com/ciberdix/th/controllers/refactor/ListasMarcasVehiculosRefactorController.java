package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasMarcasVehiculos;
import com.ciberdix.th.repositories.refactor.ListasMarcasVehiculosRefactorRepository;
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
@RequestMapping("/api/listasMarcasVehiculos")
public class ListasMarcasVehiculosRefactorController {
    @Autowired
    private ListasMarcasVehiculosRefactorRepository listasMarcasVehiculosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasMarcasVehiculos> findAll() {
        return (List<ListasMarcasVehiculos>) listasMarcasVehiculosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasMarcasVehiculos findOne(@PathVariable Integer id) {
        return listasMarcasVehiculosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasMarcasVehiculos create(@RequestBody ListasMarcasVehiculos obj) {
        return listasMarcasVehiculosRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasMarcasVehiculos obj) {
        listasMarcasVehiculosRefactorRepository.save(obj);
    }
}
