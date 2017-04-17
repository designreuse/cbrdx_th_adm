package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.EstructuraFisica;
import com.ciberdix.th.repositories.refactor.EstructuraFisicaRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/estructuraFisica")
public class EstructuraFisicaRefactorController {
    @Autowired
    private EstructuraFisicaRefactorRepository estructuraFisicaRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<EstructuraFisica> findAll() {
        return (List<EstructuraFisica>) estructuraFisicaRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<EstructuraFisica> findEnabled() {
        return (List<EstructuraFisica>) estructuraFisicaRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    EstructuraFisica findOne(@PathVariable Integer id) {
        return estructuraFisicaRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstructuraFisica create(@RequestBody EstructuraFisica obj) {
        return estructuraFisicaRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody EstructuraFisica obj) {
        estructuraFisicaRefactorRepository.save(obj);
    }
}
