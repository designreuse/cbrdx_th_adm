package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.UsuarioRoles;
import com.ciberdix.th.models.refactor.VUsuarioRoles;
import com.ciberdix.th.repositories.refactor.UsuariosRolesRefactorRepository;
import com.ciberdix.th.repositories.refactor.VUsuarioRolesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/usuariosRoles")
public class UsuariosRolesController {

    @Autowired
    private UsuariosRolesRefactorRepository usuariosRolesRepository;
    @Autowired
    private VUsuarioRolesRefactorRepository vUsuariosRolesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<UsuarioRoles> getLists() {
        return (List<UsuarioRoles>) usuariosRolesRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/vista/{idUsuario}")
    List<VUsuarioRoles> getVLists(@PathVariable Integer idUsuario) {
        return (List<VUsuarioRoles>) vUsuariosRolesRepository.findByIdUsuario(idUsuario);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/secure/{idUsuario}")
    List<UsuarioRoles> getRoleList(@PathVariable Integer idUsuario) {
        return (List<UsuarioRoles>) usuariosRolesRepository.findByIdUsuarioAndIndicadorHabilitadoTrue(idUsuario);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/query/{idLista}")
    UsuarioRoles findList(@PathVariable Integer idLista) {
        return usuariosRolesRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    UsuarioRoles createList(@RequestBody UsuarioRoles c) {
        return usuariosRolesRepository.save(new UsuarioRoles(c.getIdUsuario(), c.getIdRol(), c.getAuditoriaUsuario(), c.getFechaInicio(), c.getFechaFin(), c.getIndicadorHabilitado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    UsuarioRoles updateList(@RequestBody UsuarioRoles roles) {
        return usuariosRolesRepository.save(roles);
    }
}
