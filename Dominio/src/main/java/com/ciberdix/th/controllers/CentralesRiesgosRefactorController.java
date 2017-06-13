package com.ciberdix.th.controllers;

import com.ciberdix.th.models.CentralesRiesgos;
import com.ciberdix.th.repositories.CentralesRiesgosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 13/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/centralesRiesgos")
public class CentralesRiesgosRefactorController {

    @Autowired
    private CentralesRiesgosRefactorRepository centralesRiesgosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<CentralesRiesgos> findAll() {
        return (List<CentralesRiesgos>) centralesRiesgosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<CentralesRiesgos> findEnabled() {
        return  centralesRiesgosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    CentralesRiesgos findOne(@PathVariable Integer id) {
        return centralesRiesgosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CentralesRiesgos create(@RequestBody CentralesRiesgos o) {
        return centralesRiesgosRefactorRepository.save(
                new CentralesRiesgos(
                        o.getCodigo(),o.getNombre(),o.getUrl(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario(),o.getIndicadorReporta()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CentralesRiesgos o) {
        centralesRiesgosRefactorRepository.save(
                new CentralesRiesgos(
                        o.getIdCentralRiesgo(),o.getCodigo(),o.getNombre(),o.getUrl(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario(),o.getIndicadorReporta()
                )
        );
    }

}
