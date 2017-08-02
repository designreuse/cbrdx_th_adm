package com.ciberdix.th.controllers;

import com.ciberdix.th.models.InstitucionesMedicasTiposExamenes;
import com.ciberdix.th.models.VInstitucionesMedicasTiposExamenes;
import com.ciberdix.th.repositories.InstitucionesMedicasTiposExamenesRefactorRepository;
import com.ciberdix.th.repositories.VInstitucionesMedicasTiposExamenesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/institucionesMedicasTiposExamenes")
public class InstitucionesMedicasTiposExamenesRefactorController {

    @Autowired
    private InstitucionesMedicasTiposExamenesRefactorRepository institucionesMedicasTiposExamenesRefactorRepository;

    @Autowired
    private VInstitucionesMedicasTiposExamenesRefactorRepository vInstitucionesMedicasTiposExamenesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VInstitucionesMedicasTiposExamenes> findAll() {
        return (List<VInstitucionesMedicasTiposExamenes>) vInstitucionesMedicasTiposExamenesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VInstitucionesMedicasTiposExamenes> findEnabled() {
        return vInstitucionesMedicasTiposExamenesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VInstitucionesMedicasTiposExamenes findOne(@PathVariable Integer id) {
        return vInstitucionesMedicasTiposExamenesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/institucionMedica/{id}")
    List<VInstitucionesMedicasTiposExamenes> findByInstitucionMedica(@PathVariable Integer id) {
        return vInstitucionesMedicasTiposExamenesRefactorRepository.findAllByIdInstitucionMedica(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tipoExamenMedico/{id}")
    List<VInstitucionesMedicasTiposExamenes> findByTipoExamenMedico(@PathVariable Integer id) {
        return vInstitucionesMedicasTiposExamenesRefactorRepository.findAllByIdTipoExamen(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    InstitucionesMedicasTiposExamenes create(@RequestBody InstitucionesMedicasTiposExamenes o) {
        return institucionesMedicasTiposExamenesRefactorRepository.save(
                new InstitucionesMedicasTiposExamenes(

                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody InstitucionesMedicasTiposExamenes o) {
        institucionesMedicasTiposExamenesRefactorRepository.save(
                new InstitucionesMedicasTiposExamenes(

                )
        );
    }
    
}
