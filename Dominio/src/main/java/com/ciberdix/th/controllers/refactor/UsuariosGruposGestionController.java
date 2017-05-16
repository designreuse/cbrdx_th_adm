package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.UsuarioGruposGestion;
import com.ciberdix.th.models.VUsuarioGruposGestion;
import com.ciberdix.th.repositories.UsuarioGruposGestionRefactorRepository;
import com.ciberdix.th.repositories.VUsuarioGruposGestionRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/usuariosGruposGestion")
public class UsuariosGruposGestionController {

    @Autowired
    private UsuarioGruposGestionRefactorRepository usuarioGruposGestionRepository;
    @Autowired
    private VUsuarioGruposGestionRefactorRepository vUsuarioGruposGestionRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<UsuarioGruposGestion> getLists() {
        return (List<UsuarioGruposGestion>) usuarioGruposGestionRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path="/vistas")
    List<VUsuarioGruposGestion> getVLists() {
        return (List<VUsuarioGruposGestion>) vUsuarioGruposGestionRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/vista/{idUsuario}")
    List<VUsuarioGruposGestion> getVListsId(@PathVariable Integer idUsuario) {
        return (List<VUsuarioGruposGestion>) vUsuarioGruposGestionRefactorRepository.findByIdUsuario(idUsuario);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    UsuarioGruposGestion findList(@PathVariable Integer idLista) {
        return usuarioGruposGestionRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/{idUsuario}")
    List<UsuarioGruposGestion> findEnabled(@PathVariable Integer idUsuario) {
        return (List<UsuarioGruposGestion>) usuarioGruposGestionRepository.findByIndicadorHabilitadoIsTrueAndIdUsuario(idUsuario);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/vista/enabled/{idUsuario}")
    List<VUsuarioGruposGestion> findVEnabled(@PathVariable Integer idUsuario) {
        return (List<VUsuarioGruposGestion>) vUsuarioGruposGestionRefactorRepository.findByIndicadorHabilitadoIsTrueAndIdUsuario(idUsuario);
    }

    @RequestMapping(method = RequestMethod.POST)
    UsuarioGruposGestion createList(@RequestBody UsuarioGruposGestion c) {
        return usuarioGruposGestionRepository.save(new UsuarioGruposGestion(c.getIdUsuario(), c.getIdGrupoGestion(), c.getAuditoriaUsuario(), c.getFechaInicio(), c.getFechaFin(), c.getIndicadorHabilitado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    UsuarioGruposGestion updateList(@RequestBody UsuarioGruposGestion roles) {
        return usuarioGruposGestionRepository.save(roles);
    }
}
