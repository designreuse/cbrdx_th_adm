package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Roles;
import com.ciberdix.th.models.VUsuarioRolesCantidad;
import com.ciberdix.th.repositories.RolesRefactorRepository;
import com.ciberdix.th.repositories.VUsuarioRolesCantidadRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/roles")
public class RolesRefactorController {

    @Autowired
    private RolesRefactorRepository rolesRefactorRepository;

    @Autowired
    private VUsuarioRolesCantidadRefactorRepository vUsuarioRolesCantidadRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Roles> findAll() {
        return (List<Roles>) rolesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idRoles}")
    Roles findOne(@PathVariable Integer idRoles) {
        return rolesRefactorRepository.findOne(idRoles);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/usuario/{idUsuario}")
    List<Roles> findAll(@PathVariable Integer idUsuario) {
        return rolesRefactorRepository.findUserAvaliable(idUsuario);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/rol/{codigoRol}")
    List<Roles> findByCodigoRol(@PathVariable String codigoRol) {
        return rolesRefactorRepository.findAllByCodigoRol(codigoRol);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/dashboard")
    List<VUsuarioRolesCantidad> getVLists() {
        return (List<VUsuarioRolesCantidad>) vUsuarioRolesCantidadRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    Roles create(@RequestBody Roles obj) {
        return rolesRefactorRepository.save(new Roles(obj.getRol(), obj.getIndicadorHabilitado(), obj.getDescripcion(), obj.getAuditoriaUsuario(), obj.getCodigoRol(), obj.getFechaInicio(), obj.getFechaFin()
        ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Roles o) {
        rolesRefactorRepository.save(new Roles(o.getIdRol(), o.getRol(), o.getIndicadorHabilitado(), o.getDescripcion(), o.getAuditoriaUsuario(), o.getCodigoRol(), o.getFechaInicio(), o.getFechaFin()));
    }
}
