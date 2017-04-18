package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.EstructuraFisica;
import com.ciberdix.th.models.refactor.VEstructuraFisica;
import com.ciberdix.th.repositories.refactor.EstructuraFisicaRefactorRepository;
import com.ciberdix.th.repositories.refactor.VEstructuraFisicaRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/estructuraFisica")
public class EstructuraFisicaRefactorController {
    @Autowired
    private EstructuraFisicaRefactorRepository estructuraFisicaRefactorRepository;

    @Autowired
    private VEstructuraFisicaRefactorRepository vEstructuraFisicaRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VEstructuraFisica> findAll() {
        return (List<VEstructuraFisica>) vEstructuraFisicaRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VEstructuraFisica> findEnabled() {
        return (List<VEstructuraFisica>) vEstructuraFisicaRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VEstructuraFisica findOne(@PathVariable Integer id) {
        return vEstructuraFisicaRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstructuraFisica create(@RequestBody EstructuraFisica obj) {
        return estructuraFisicaRefactorRepository.save(
                new EstructuraFisica(obj.getCodigo(),obj.getEstructuraFisica(),
                        obj.getIdClasificacionSede(),obj.getIdLocalizacion(),
                        obj.getTelefono(),obj.getCelular(),obj.getCorreoElectronico(),
                        obj.getIndicadorVirtual(),obj.getIndicadorHabilitado(),
                        obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody EstructuraFisica obj) {
        estructuraFisicaRefactorRepository.save(obj);
    }
}
