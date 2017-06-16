package com.ciberdix.th.controllers;

import com.ciberdix.th.models.InstitucionesMedicas;
import com.ciberdix.th.models.VInstitucionesMedicas;
import com.ciberdix.th.repositories.InstitucionesMedicasRefactorRepository;
import com.ciberdix.th.repositories.VInstitucionesMedicasRefactorRepository;
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
@RequestMapping("/api/institucionesMedicas")
public class InstitucionesMedicasRefactorController {

    @Autowired
    private InstitucionesMedicasRefactorRepository institucionesMedicasRefactorRepository;

    @Autowired
    private VInstitucionesMedicasRefactorRepository vInstitucionesMedicasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VInstitucionesMedicas> findAll() {
        return (List<VInstitucionesMedicas>) vInstitucionesMedicasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VInstitucionesMedicas> findEnabled() {
        return  vInstitucionesMedicasRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VInstitucionesMedicas findOne(@PathVariable Integer id) {
        return vInstitucionesMedicasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    InstitucionesMedicas create(@RequestBody InstitucionesMedicas o) {
        return institucionesMedicasRefactorRepository.save(
                new InstitucionesMedicas(
                        o.getInstitucionMedica(),o.getRepresentanteLegal(),
                        o.getIdLocalizacion(),o.getCorreoElectronico(),o.getTelefonoContacto(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody InstitucionesMedicas o) {
        institucionesMedicasRefactorRepository.save(
                new InstitucionesMedicas(
                        o.getIdInstitucionMedica(),o.getInstitucionMedica(),o.getRepresentanteLegal(),
                        o.getIdLocalizacion(),o.getCorreoElectronico(),o.getTelefonoContacto(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

}
