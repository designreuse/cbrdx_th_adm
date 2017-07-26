package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Adjuntos;
import com.ciberdix.th.repositories.AdjuntosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 14/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/adjuntos")
public class AdjuntosRefactorController {

    @Autowired
    private AdjuntosRefactorRepository adjuntosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Adjuntos> findAll() {
        return (List<Adjuntos>) adjuntosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Adjuntos findOne(@PathVariable Integer id) {
        return adjuntosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Adjuntos create(@RequestBody Adjuntos o) {
        return adjuntosRefactorRepository.save(
                new Adjuntos(o.getAdjunto(), o.getAuditoriaUsuario(), o.getNombreArchivo(), o.getIdAlfresco())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Adjuntos o) {
        adjuntosRefactorRepository.save(
                new Adjuntos(o.getIdAdjunto(), o.getAdjunto(), o.getAuditoriaUsuario(), o.getNombreArchivo(), o.getIdAlfresco())
        );
    }

}
