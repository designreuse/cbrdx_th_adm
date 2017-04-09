package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.CargosExamenes;
import com.ciberdix.th.models.refactor.VCargosExamenes;
import com.ciberdix.th.repositories.refactor.CargosExamenesRefactorRepository;
import com.ciberdix.th.repositories.refactor.VCargosExamenesRefactorRepository;
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
        cargosExamenesRefactorRepository.save(obj);
    }
}
