package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Usuarios;
import com.ciberdix.th.models.refactor.VHistoricoUsuarios;
import com.ciberdix.th.models.refactor.VUsuarios;
import com.ciberdix.th.repositories.refactor.UsuariosRefactorRepository;
import com.ciberdix.th.repositories.refactor.VHistoricoUsuariosRefactorRepository;
import com.ciberdix.th.repositories.refactor.VUsuariosRefactorRepository;
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

    @RequestMapping(method = RequestMethod.GET, path = "/queryUsername/{idLista}/")
    Usuarios findUsername(@PathVariable String idLista) {
        return usuariosRepository.findByUsuarioSistema(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    Usuarios createList(@RequestBody Usuarios c) {
        return usuariosRepository.save(new Usuarios(c.getUsuarioSistema(), c.getContrasena(), c.getUsuarioLdap(), c.getFechaInactivacion(), c.getIdTercero(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    Usuarios updateList(@RequestBody Usuarios roles) {
        return usuariosRepository.save(roles);
    }
}
