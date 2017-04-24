package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.RolesFuncionalidadesControles;
import com.ciberdix.th.models.refactor.VRolesFuncionalidadesControles;
import com.ciberdix.th.repositories.refactor.RolesFuncionalidadesControlesRefactorRepository;
import com.ciberdix.th.repositories.refactor.VRolesFuncionalidadesControlesRefactorRepository;
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

    @Autowired
    private VRolesFuncionalidadesControlesRefactorRepository vRolesFuncionalidadesControlesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VRolesFuncionalidadesControles> findAll() {
        return (List<VRolesFuncionalidadesControles>) vRolesFuncionalidadesControlesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VRolesFuncionalidadesControles> findEnabled() {
        return vRolesFuncionalidadesControlesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRolesFuncionalidadesControles findOne(@PathVariable Integer id) {
        return vRolesFuncionalidadesControlesRefactorRepository.findOne(id);
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
