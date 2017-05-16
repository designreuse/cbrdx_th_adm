package com.ciberdix.th.controllers;

import com.ciberdix.th.models.RequerimientosAcciones;
import com.ciberdix.th.repositories.RequerimientosAccionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 16/05/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/requerimientosAcciones")
public class RequerimientosAccionesRefactorController {

    @Autowired
    private RequerimientosAccionesRefactorRepository requerimientosAccionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<RequerimientosAcciones> findAll() {
        return (List<RequerimientosAcciones>) requerimientosAccionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RequerimientosAcciones findOne(@PathVariable Integer id) {
        return requerimientosAccionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosAcciones create(@RequestBody RequerimientosAcciones o) {
        return requerimientosAccionesRefactorRepository.save(

                new RequerimientosAcciones(o.getIdRequerimiento(),o.getIdAccion(),o.getObservacion(),o.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosAcciones obj) {
        requerimientosAccionesRefactorRepository.save(obj);
    }

}
