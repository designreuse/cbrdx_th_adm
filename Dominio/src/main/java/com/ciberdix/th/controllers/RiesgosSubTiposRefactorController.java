package com.ciberdix.th.controllers;

import com.ciberdix.th.models.RiesgosSubTipos;
import com.ciberdix.th.repositories.RiesgosSubTiposRefactorRepository;
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
@RequestMapping("/api/riesgosSubTipos")
public class RiesgosSubTiposRefactorController {
    @Autowired
    private RiesgosSubTiposRefactorRepository riesgosSubTiposRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<RiesgosSubTipos> findAll() {
        return (List<RiesgosSubTipos>) riesgosSubTiposRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RiesgosSubTipos findOne(@PathVariable Integer id) {
        return riesgosSubTiposRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<RiesgosSubTipos> findByEnabled(){
        return riesgosSubTiposRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    RiesgosSubTipos create(@RequestBody RiesgosSubTipos obj) {
        return riesgosSubTiposRefactorRepository.save(
                new RiesgosSubTipos(obj.getIdRiesgoTipo(), obj.getRiesgoSubTipo(),
                        obj.getIndicadorHabilitado(),obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RiesgosSubTipos obj) {
        riesgosSubTiposRefactorRepository.save(
                new RiesgosSubTipos(obj.getIdRiesgoTipo(),obj.getIdRiesgoTipo(), obj.getRiesgoSubTipo(),
                        obj.getIndicadorHabilitado(),obj.getAuditoriaUsuario())
        );
    }
}
