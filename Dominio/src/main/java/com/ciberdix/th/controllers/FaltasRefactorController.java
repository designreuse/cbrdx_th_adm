package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Faltas;
import com.ciberdix.th.models.VFaltas;
import com.ciberdix.th.repositories.FaltasRefactorRepository;
import com.ciberdix.th.repositories.VFaltasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 6/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/faltas")
public class FaltasRefactorController {
    @Autowired
    private FaltasRefactorRepository faltasRefactorRepository;

    @Autowired
    private VFaltasRefactorRepository vFaltasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VFaltas> findAll() {
        return (List<VFaltas>) vFaltasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path="/enabled/")
    List<VFaltas> findAllEnabled() {
        return (List<VFaltas>) vFaltasRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VFaltas findOne(@PathVariable Integer id) {
        return vFaltasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Faltas create(@RequestBody Faltas obj) {
        return faltasRefactorRepository.save(new Faltas(obj.getFalta(),obj.getIdTipoFalta(),
                obj.getAccion(),obj.getIndicadorHabilitado(),obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Faltas obj) {
        faltasRefactorRepository.save(obj);
    }
}
