package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Menus;
import com.ciberdix.th.repositories.refactor.MenusRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by felip on 19/04/2017.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/menus")
public class MenusRefactorController {

    @Autowired
    private MenusRefactorRepository menusRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Menus> findAll() {
        return menusRefactorRepository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPadre/{IdPadre}")
    List<Menus> findByFather(@PathVariable Integer IdPadre) {
        return menusRefactorRepository.findByIdPadre(IdPadre);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/idPadreDifCero")
    List<Menus> queryAllByIdFatherNot0() {
        return menusRefactorRepository.queryAllByIdFatherNot0();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{IdMenu}")
    Menus findOne(@PathVariable Integer IdMenu) {
        return menusRefactorRepository.findOne(IdMenu);
    }

    @RequestMapping(method = RequestMethod.POST)
    Menus create(@RequestBody Menus menus) {
        return menusRefactorRepository.save(new Menus(menus.getMenu(), menus.getIndicadorHabilitado(), menus.getAuditoriaUsuario(), menus.getIdPadre(), menus.getCodigoMenu(), menus.getRuta(), menus.getSecuencia(), menus.getClase()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    Menus update(@RequestBody Menus menus) {
        return menusRefactorRepository.save(menus);
    }
}