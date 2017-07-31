package com.ciberdix.th.controllers;

import com.ciberdix.th.configuration.OutSpecialChars;
import com.ciberdix.th.models.Usuarios;
import com.ciberdix.th.models.VHistoricoUsuarios;
import com.ciberdix.th.models.VUsuarios;
import com.ciberdix.th.repositories.UsuariosRefactorRepository;
import com.ciberdix.th.repositories.VHistoricoUsuariosRefactorRepository;
import com.ciberdix.th.repositories.VUsuariosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/usuarios")
public class UsuariosRefactorController {

    @Autowired
    private UsuariosRefactorRepository usuariosRepository;
    @Autowired
    private VUsuariosRefactorRepository vUsuariosRepository;
    @Autowired
    private VHistoricoUsuariosRefactorRepository vHistoricoUsuariosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Usuarios> getLists() {
        return (List<Usuarios>) usuariosRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/vista/")
    List<VUsuarios> getVLists() {
        return (List<VUsuarios>) vUsuariosRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/auditoria/{objeto}/{idObjeto}")
    List<VHistoricoUsuarios> getHLists(@PathVariable String objeto, @PathVariable Long idObjeto) {
        if (objeto.toLowerCase().compareTo("usuarios") == 0) {
            return (List<VHistoricoUsuarios>) vHistoricoUsuariosRepository.findUserRelated(objeto, idObjeto);
        } else {
            return (List<VHistoricoUsuarios>) vHistoricoUsuariosRepository.findByObjetoAndIdObjeto(objeto, idObjeto);
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/query/{idLista}")
    Usuarios findList(@PathVariable Integer idLista) {
        return usuariosRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/usuarioRol/{rol}")
    List<VUsuarios> queryAllByIdRol(@PathVariable String rol) {
        return vUsuariosRepository.queryAllByIdRol(rol);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/queryUsername/{idLista}/")
    Usuarios findUsername(@PathVariable String idLista) {
        return usuariosRepository.queryByUsuarioSistema(OutSpecialChars.getStr(idLista));
    }

    @RequestMapping(method = RequestMethod.POST)
    Usuarios createList(@RequestBody Usuarios c) {
        return usuariosRepository.save(
                new Usuarios(c.getUsuarioSistema(), c.getContrasena(), c.getUsuarioLdap(),
                        c.getFechaInactivacion(), c.getIdTercero(), c.getIndicadorHabilitado(),
                        c.getAuditoriaUsuario(), c.getCorreoElectronico(),c.getFacebook(),c.getGoogle(),c.getLinkedin()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    Usuarios updateList(@RequestBody Usuarios roles) {
        return usuariosRepository.save(roles);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/cambiarPass")
    void updatePass(@RequestBody Usuarios c) {
        usuariosRepository.save(new Usuarios(
                c.getIdUsuario(), c.getUsuarioSistema(), c.getContrasena(), c.getUsuarioLdap(),
                c.getFechaInactivacion(), c.getIdTercero(), c.getIndicadorHabilitado(),
                c.getAuditoriaUsuario(), c.getCorreoElectronico(),c.getFacebook(),c.getGoogle(),c.getLinkedin()
        ));
    }
}
