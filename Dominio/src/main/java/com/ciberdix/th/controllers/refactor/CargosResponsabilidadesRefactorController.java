package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.CargosResponsabilidades;
import com.ciberdix.th.models.refactor.VCargosResponsabilidades;
import com.ciberdix.th.repositories.refactor.CargosResponsabilidadesRefactorRepository;
import com.ciberdix.th.repositories.refactor.VCargosResponsabilidadesRefactorRepository;
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
@RequestMapping("/api/cargosResponsabilidades")
public class CargosResponsabilidadesRefactorController {
    @Autowired
    private CargosResponsabilidadesRefactorRepository cargosResponsabilidadesRefactorRepository;

    @Autowired
    private VCargosResponsabilidadesRefactorRepository vCargosResponsabilidadesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosResponsabilidades> findAll() {
        return (List<VCargosResponsabilidades>) vCargosResponsabilidadesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VCargosResponsabilidades> findEnabled() {
        return (List<VCargosResponsabilidades>) vCargosResponsabilidadesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosResponsabilidades findOne(@PathVariable Integer id) {
        return vCargosResponsabilidadesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosResponsabilidades create(@RequestBody CargosResponsabilidades obj) {
        return cargosResponsabilidadesRefactorRepository.save(
                new CargosResponsabilidades(obj.getIdResponsabilidad(),obj.getIdCargo(),
                        obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosResponsabilidades obj) {
        cargosResponsabilidadesRefactorRepository.save(obj);
    }
}
