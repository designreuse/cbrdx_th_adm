package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Riesgos;
import com.ciberdix.th.repositories.refactor.RiesgosRefactorRepository;
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
@RequestMapping("/api/riesgos")
public class RiesgosRefactorController {
    @Autowired
    private RiesgosRefactorRepository riesgosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Riesgos> findAll() {
        return (List<Riesgos>) riesgosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Riesgos findOne(@PathVariable Integer id) {
        return riesgosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<Riesgos> findByEnabled(){
        return riesgosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    Riesgos create(@RequestBody Riesgos obj) {
        return riesgosRefactorRepository.save(
                new Riesgos(obj.getIdSubTipoRiesgo(), obj.getIdTipoRiesgo(),
                        obj.getRiesgo(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Riesgos obj) {
        riesgosRefactorRepository.save(obj);
    }
}
