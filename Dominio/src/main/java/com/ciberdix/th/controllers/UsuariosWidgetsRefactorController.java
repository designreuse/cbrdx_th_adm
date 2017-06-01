package com.ciberdix.th.controllers;

import com.ciberdix.th.models.UsuariosWidgets;
import com.ciberdix.th.models.VUsuariosWidgets;
import com.ciberdix.th.repositories.UsuariosWidgetsRefactorRepository;
import com.ciberdix.th.repositories.VUsuariosWidgetsRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 31/05/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/usuariosWidgets")
public class UsuariosWidgetsRefactorController {

    @Autowired
    private UsuariosWidgetsRefactorRepository usuariosWidgetsRefactorRepository;
    @Autowired
    private VUsuariosWidgetsRefactorRepository vUsuariosWidgetsRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VUsuariosWidgets> getLists() {
        return (List<VUsuariosWidgets>) vUsuariosWidgetsRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VUsuariosWidgets findOne(@PathVariable Integer id) {
        return vUsuariosWidgetsRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    UsuariosWidgets createList(@RequestBody UsuariosWidgets c) {
        return usuariosWidgetsRefactorRepository.save(new UsuariosWidgets(
                c.getIdUsuario(),c.getIdWidget(),c.getIndicadorHabilitado()
        ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    UsuariosWidgets updateList(@RequestBody UsuariosWidgets c) {
        return usuariosWidgetsRefactorRepository.save(new UsuariosWidgets(
                c.getIdUsuarioWidget(),c.getIdUsuario(),c.getIdWidget(),c.getIndicadorHabilitado()
        ));
    }

}
