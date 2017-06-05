package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Procesos;
import com.ciberdix.th.repositories.ProcesosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 5/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/procesos")
public class ProcesosRefactorController {

    @Autowired
    private ProcesosRefactorRepository procesosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Procesos> findAll() {
        return (List<Procesos>) procesosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Procesos findOne(@PathVariable Integer id) {
        return procesosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Procesos create(@RequestBody Procesos o) {
        return procesosRefactorRepository.save(new Procesos(
                o.getIdEstado(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
        ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Procesos o) {
        procesosRefactorRepository.save(
                new Procesos(
                        o.getIdProceso(),o.getIdEstado(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

}
