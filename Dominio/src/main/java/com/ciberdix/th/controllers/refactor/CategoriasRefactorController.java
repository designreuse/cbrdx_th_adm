package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Categorias;
import com.ciberdix.th.repositories.refactor.CategoriasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/categorias")
public class CategoriasRefactorController {
    @Autowired
    private CategoriasRefactorRepository categoriasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Categorias> findAll() {
        return (List<Categorias>) categoriasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<Categorias> findEnabled() {
        return (List<Categorias>) categoriasRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Categorias findOne(@PathVariable Integer id) {
        return categoriasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Categorias create(@RequestBody Categorias obj) {
        return categoriasRefactorRepository.save(
                new Categorias(obj.getCategoria(), obj.getPuntosMinimos(), obj.getPuntosMaximos(),
                        obj.getIdNivel(), obj.getNivel(), obj.getIndicadorHabilitado(),
                        obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Categorias obj) {
        categoriasRefactorRepository.save(obj);
    }
}
