package com.ciberdix.th.controllers;

import com.ciberdix.th.models.CargosRiesgos;
import com.ciberdix.th.models.VCargosRiesgos;
import com.ciberdix.th.repositories.CargosRiesgosRefactorRepository;
import com.ciberdix.th.repositories.VCargosRiesgosRefactorRepository;
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
@RequestMapping("/api/cargosRiesgos")
public class CargosRiesgosRefactorController {
    @Autowired
    private CargosRiesgosRefactorRepository cargosRiesgosRefactorRepository;

    @Autowired
    private VCargosRiesgosRefactorRepository vCargosRiesgosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosRiesgos> findAll() {
        return (List<VCargosRiesgos>) vCargosRiesgosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosRiesgos findOne(@PathVariable Integer id) {
        return vCargosRiesgosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<VCargosRiesgos> findByIdCargo(@PathVariable Integer id) {
        return vCargosRiesgosRefactorRepository.findByIdCargo(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosRiesgos create(@RequestBody CargosRiesgos o) {
        return cargosRiesgosRefactorRepository.save(
                new CargosRiesgos(
                        o.getIdCargo(),o.getIdRiesgo(),o.getAuditoriaUsuario(),o.getIndicadorHabilitado()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosRiesgos o) {
        cargosRiesgosRefactorRepository.save(
                new CargosRiesgos(
                        o.getIdCargoRiesgo(),o.getIdCargo(),o.getIdRiesgo(),o.getAuditoriaUsuario(),
                        o.getIndicadorHabilitado()
                )
        );
    }
}
