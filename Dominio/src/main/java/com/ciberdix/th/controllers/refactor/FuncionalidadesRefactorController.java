package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Funcionalidades;
import com.ciberdix.th.repositories.refactor.FuncionalidadesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 22/04/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/funcionalidades")
public class FuncionalidadesRefactorController {

    @Autowired
    private FuncionalidadesRefactorRepository funcionalidadesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Funcionalidades> getLists() {
        return (List<Funcionalidades>) funcionalidadesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idFuncionalidad}")
    List<Funcionalidades> findByOne(@PathVariable Integer idFuncionalidad) {
        return (List<Funcionalidades>) funcionalidadesRefactorRepository.findOne(idFuncionalidad);
    }

    @RequestMapping(method = RequestMethod.POST)
    Funcionalidades createList(@RequestBody Funcionalidades f) {
        return funcionalidadesRefactorRepository.save(
                new Funcionalidades(f.getIdMenu(), f.getIndicadorHabilitado(),
                        f.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    Funcionalidades updateList(@RequestBody Funcionalidades funcionalidades) {
        return funcionalidadesRefactorRepository.save(funcionalidades);
    }

}
