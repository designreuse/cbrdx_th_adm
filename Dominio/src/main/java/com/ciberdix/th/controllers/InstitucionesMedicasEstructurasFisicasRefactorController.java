package com.ciberdix.th.controllers;

import com.ciberdix.th.models.InstitucionesMedicasEstructurasFisicas;
import com.ciberdix.th.repositories.InstitucionesMedicasEstructurasFisicasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 16/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/institucionesMedicasEstructurasFisicas")
public class InstitucionesMedicasEstructurasFisicasRefactorController {

    @Autowired
    private InstitucionesMedicasEstructurasFisicasRefactorRepository institucionesMedicasEstructurasFisicasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<InstitucionesMedicasEstructurasFisicas> findAll() {
        return (List<InstitucionesMedicasEstructurasFisicas>) institucionesMedicasEstructurasFisicasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<InstitucionesMedicasEstructurasFisicas> findEnabled() {
        return institucionesMedicasEstructurasFisicasRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    InstitucionesMedicasEstructurasFisicas findOne(@PathVariable Integer id) {
        return institucionesMedicasEstructurasFisicasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    InstitucionesMedicasEstructurasFisicas create(@RequestBody InstitucionesMedicasEstructurasFisicas o) {
        return institucionesMedicasEstructurasFisicasRefactorRepository.save(
                new InstitucionesMedicasEstructurasFisicas(
                        o.getIdInstitucionMedica(),o.getIdEstructuraFisica(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody InstitucionesMedicasEstructurasFisicas o) {
        institucionesMedicasEstructurasFisicasRefactorRepository.save(
                new InstitucionesMedicasEstructurasFisicas(
                        o.getIdInstitucionMedicaEstructuraFisica(),o.getIdInstitucionMedica(),
                        o.getIdEstructuraFisica(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

}
