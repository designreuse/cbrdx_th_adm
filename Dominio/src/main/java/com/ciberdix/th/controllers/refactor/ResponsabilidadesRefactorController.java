package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Responsabilidades;
import com.ciberdix.th.repositories.refactor.ResponsabilidadesRefactorRepository;
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
@RequestMapping("/api/responsabilidades")
public class ResponsabilidadesRefactorController {
    @Autowired
    private ResponsabilidadesRefactorRepository responsabilidadesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Responsabilidades> findAll() {
        return (List<Responsabilidades>) responsabilidadesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<Responsabilidades> findEnabled() {
        return (List<Responsabilidades>) responsabilidadesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/noAsignadas/{id}")
    List<Responsabilidades> findNoAsignadas(@PathVariable Integer id) {
        return (List<Responsabilidades>) responsabilidadesRefactorRepository.queryAll(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Responsabilidades findOne(@PathVariable Integer id) {
        return responsabilidadesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Responsabilidades create(@RequestBody Responsabilidades obj) {
        return responsabilidadesRefactorRepository.save(
                new Responsabilidades(obj.getResponsabilidad(),obj.getDescripcion(),
                        obj.getIndicadorHabilitado(),obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Responsabilidades obj) {
        responsabilidadesRefactorRepository.save(obj);
    }
}
