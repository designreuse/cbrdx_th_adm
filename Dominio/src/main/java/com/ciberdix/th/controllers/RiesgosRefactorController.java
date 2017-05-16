package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Riesgos;
import com.ciberdix.th.models.VRiesgos;
import com.ciberdix.th.repositories.RiesgosRefactorRepository;
import com.ciberdix.th.repositories.VRiesgosRefactorRepository;
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

    @Autowired
    private VRiesgosRefactorRepository vRiesgosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VRiesgos> findAll() {
        return (List<VRiesgos>) vRiesgosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRiesgos findOne(@PathVariable Integer id) {
        return vRiesgosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VRiesgos> findByEnabled(){
        return vRiesgosRefactorRepository.findByIndicadorHabilitadoIsTrue();
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
