package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Funcionalidades;
import com.ciberdix.th.models.refactor.VFuncionalidades;
import com.ciberdix.th.repositories.refactor.FuncionalidadesRefactorRepository;
import com.ciberdix.th.repositories.refactor.VFuncionalidadesRefactorRepository;
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

    @Autowired
    private VFuncionalidadesRefactorRepository vFuncionalidadesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VFuncionalidades> getLists() {
        return (List<VFuncionalidades>) vFuncionalidadesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/id/{idFuncionalidad}")
    VFuncionalidades findOne(@PathVariable Integer idFuncionalidad) {
        return vFuncionalidadesRefactorRepository.findOne(idFuncionalidad);
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
