package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Criterios;
import com.ciberdix.th.repositories.refactor.CriteriosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/criterios")
public class CriteriosRefactorController {
    @Autowired
    private CriteriosRefactorRepository cargosCriteriosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Criterios> findAll() {
        return (List<Criterios>) cargosCriteriosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<Criterios> findEnabled() {
        return (List<Criterios>) cargosCriteriosRefactorRepository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Criterios findOne(@PathVariable Integer id) {
        return cargosCriteriosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Criterios create(@RequestBody Criterios obj) {
        return cargosCriteriosRefactorRepository.save(
                new Criterios(obj.getCriterio(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Criterios obj) {
        cargosCriteriosRefactorRepository.save(obj);
    }
}
