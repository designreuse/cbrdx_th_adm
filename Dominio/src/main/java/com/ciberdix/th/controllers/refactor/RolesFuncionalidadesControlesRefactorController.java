package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.RolesFuncionalidadesControles;
import com.ciberdix.th.repositories.refactor.RolesFuncionalidadesControlesRefactorRepository;
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
@RequestMapping("/api/rolesFuncionalidadesControles")
public class RolesFuncionalidadesControlesRefactorController {
    @Autowired
    private RolesFuncionalidadesControlesRefactorRepository rolesFuncionalidadesControlesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<RolesFuncionalidadesControles> findAll() {
        return (List<RolesFuncionalidadesControles>) rolesFuncionalidadesControlesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<RolesFuncionalidadesControles> findEnabled() {
        return rolesFuncionalidadesControlesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RolesFuncionalidadesControles findOne(@PathVariable Integer id) {
        return rolesFuncionalidadesControlesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    RolesFuncionalidadesControles create(@RequestBody RolesFuncionalidadesControles obj) {
        return rolesFuncionalidadesControlesRefactorRepository.save(
                new RolesFuncionalidadesControles(obj.getIdRol(),obj.getIdFuncionalidadControl(),
                        obj.getIndicadorEditar(),obj.getIndicadorHabilitado(),obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RolesFuncionalidadesControles obj) {
        rolesFuncionalidadesControlesRefactorRepository.save(obj);
    }
}
