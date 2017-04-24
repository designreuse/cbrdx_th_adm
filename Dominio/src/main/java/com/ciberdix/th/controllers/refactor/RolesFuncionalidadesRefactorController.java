package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.RolesFuncionalidades;
import com.ciberdix.th.models.refactor.VRolesFuncionalidades;
import com.ciberdix.th.repositories.refactor.RolesFuncionalidadesRefactorRepository;
import com.ciberdix.th.repositories.refactor.VRolesFuncionalidadesRefactorRepository;
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

    @Autowired
    private VRolesFuncionalidadesRefactorRepository vRolesFuncionalidadesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VRolesFuncionalidades> findAll() {
        return (List<VRolesFuncionalidades>) vRolesFuncionalidadesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VRolesFuncionalidades> findEnabled() {
        return vRolesFuncionalidadesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarRol/{id}")
    List<VRolesFuncionalidades> findByIdRol(@PathVariable Integer id) {
        return vRolesFuncionalidadesRefactorRepository.findByIdRol(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRolesFuncionalidades findOne(@PathVariable Integer id) {
        return vRolesFuncionalidadesRefactorRepository.findOne(id);
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
