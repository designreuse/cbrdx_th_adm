package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Listas;
import com.ciberdix.th.repositories.ListasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listas")
@CrossOrigin
public class ListasRefactorController {

    @Autowired
    private ListasRefactorRepository listasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Listas> findAll() {
        return (List<Listas>) listasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{id}")
    Listas findOne(@PathVariable Integer id) {
        return listasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    Listas update(@RequestBody Listas o) {
        return listasRefactorRepository.save(
                new Listas(o.getIdLista(),o.getNombreTabla(),o.getLista(),o.getIndicadorEditable(),o.getAuditoriaUsuario(),o.getDescripcion())
        );
    }
}
