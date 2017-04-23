package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.RolesFuncionalidades;
import com.ciberdix.th.repositories.refactor.RolesFuncionalidadesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 23/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/rolesFuncionalidades")
public class RolesFuncionalidadesRefactorController {
    @Autowired
    private RolesFuncionalidadesRefactorRepository rolesFuncionalidadesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<RolesFuncionalidades> findAll() {
        return (List<RolesFuncionalidades>) rolesFuncionalidadesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<RolesFuncionalidades> findEnabled() {
        return rolesFuncionalidadesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RolesFuncionalidades findOne(@PathVariable Integer id) {
        return rolesFuncionalidadesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    RolesFuncionalidades create(@RequestBody RolesFuncionalidades obj) {
        return rolesFuncionalidadesRefactorRepository.save(
                new RolesFuncionalidades(obj.getIdRol(),obj.getIdFuncionalidad(),
                        obj.getIndicadorHabilitado(),obj.getIndicadorExportar(),
                        obj.getIndicadorImprimir(),obj.getIndicadorInsertar(),
                        obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RolesFuncionalidades obj) {
        rolesFuncionalidadesRefactorRepository.save(obj);
    }
}
