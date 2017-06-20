package com.ciberdix.th.controllers;

import com.ciberdix.th.models.InstitucionesMedicasEstructurasFisicas;
import com.ciberdix.th.models.VInstitucionesMedicasEstructurasFisicas;
import com.ciberdix.th.repositories.InstitucionesMedicasEstructurasFisicasRefactorRepository;
import com.ciberdix.th.repositories.VInstitucionesMedicasEstructurasFisicasRefactorRepository;
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

    @Autowired
    private VInstitucionesMedicasEstructurasFisicasRefactorRepository vInstitucionesMedicasEstructurasFisicasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VInstitucionesMedicasEstructurasFisicas> findAll() {
        return (List<VInstitucionesMedicasEstructurasFisicas>) vInstitucionesMedicasEstructurasFisicasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VInstitucionesMedicasEstructurasFisicas> findEnabled() {
        return vInstitucionesMedicasEstructurasFisicasRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VInstitucionesMedicasEstructurasFisicas findOne(@PathVariable Integer id) {
        return vInstitucionesMedicasEstructurasFisicasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/institucionMedica/{idInstitucionMedica}")
    List<VInstitucionesMedicasEstructurasFisicas> findByIdInstitucionMedica(@PathVariable Integer idInstitucionMedica) {
        return vInstitucionesMedicasEstructurasFisicasRefactorRepository.findAllByIdInstitucionMedica(idInstitucionMedica);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/estructuraFisica/{idEstructuraFisica}")
    List<VInstitucionesMedicasEstructurasFisicas> findByIdEstructuraFisica(@PathVariable Integer idEstructuraFisica) {
        return vInstitucionesMedicasEstructurasFisicasRefactorRepository.findAllByIdEstructuraFisica(idEstructuraFisica);
    }

    @RequestMapping(method = RequestMethod.POST)
    InstitucionesMedicasEstructurasFisicas create(@RequestBody InstitucionesMedicasEstructurasFisicas o) {
        return institucionesMedicasEstructurasFisicasRefactorRepository.save(
                new InstitucionesMedicasEstructurasFisicas(
                        o.getIdInstitucionMedica(),o.getIdEstructuraFisica(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario(),o.getIndicadorViaja(),
                        o.getValorViaje()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody InstitucionesMedicasEstructurasFisicas o) {
        institucionesMedicasEstructurasFisicasRefactorRepository.save(
                new InstitucionesMedicasEstructurasFisicas(
                        o.getIdInstitucionMedicaEstructuraFisica(),o.getIdInstitucionMedica(),
                        o.getIdEstructuraFisica(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario(),
                        o.getIndicadorViaja(),o.getValorViaje()
                )
        );
    }

}
