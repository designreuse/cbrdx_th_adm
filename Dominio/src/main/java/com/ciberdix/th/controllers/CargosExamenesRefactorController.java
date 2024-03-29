package com.ciberdix.th.controllers;

import com.ciberdix.th.models.CargosExamenes;
import com.ciberdix.th.models.VCargosExamenes;
import com.ciberdix.th.repositories.CargosExamenesRefactorRepository;
import com.ciberdix.th.repositories.VCargosExamenesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosExamenes")
public class CargosExamenesRefactorController {
    @Autowired
    private CargosExamenesRefactorRepository cargosExamenesRefactorRepository;

    @Autowired
    private VCargosExamenesRefactorRepository vCargosExamenesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosExamenes> findAll() {
        return (List<VCargosExamenes>) vCargosExamenesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<VCargosExamenes> findByIdCargo(@PathVariable Integer id) {
        return (List<VCargosExamenes>) vCargosExamenesRefactorRepository.findByIdCargo(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosExamenes findOne(@PathVariable Integer id) {
        return vCargosExamenesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosExamenes create(@RequestBody CargosExamenes obj) {
        return cargosExamenesRefactorRepository.save(
                new CargosExamenes(obj.getIdCargo(), obj.getIdExamen(), obj.getIndicadorIngreso(),
                        obj.getIndicadorPeriodicidad(), obj.getIndicadorRetiro(), obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosExamenes obj) {
        cargosExamenesRefactorRepository.save(
                new CargosExamenes(obj.getIdCargoExamen(),obj.getIdCargo(), obj.getIdExamen(), obj.getIndicadorIngreso(),
                        obj.getIndicadorPeriodicidad(), obj.getIndicadorRetiro(), obj.getAuditoriaUsuario())
        );
    }
}
