package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasRolesProceso;
import com.ciberdix.th.repositories.refactor.ListasRolesProcesoRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/listasRolesProceso")
public class ListasRolesProcesoRefactorController {
    @Autowired
    private ListasRolesProcesoRefactorRepository listasRolesProcesoRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasRolesProceso> findAll() {
        return (List<ListasRolesProceso>) listasRolesProcesoRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasRolesProceso> findEnabled() {
        return (List<ListasRolesProceso>) listasRolesProcesoRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasRolesProceso findOne(@PathVariable Integer id) {
        return listasRolesProcesoRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasRolesProceso create(@RequestBody ListasRolesProceso obj) {
        return listasRolesProcesoRefactorRepository.save(new ListasRolesProceso(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasRolesProceso obj) {
        listasRolesProcesoRefactorRepository.save(obj);
    }
}
