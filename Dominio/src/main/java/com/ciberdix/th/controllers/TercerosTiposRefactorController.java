package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosTipos;
import com.ciberdix.th.repositories.TercerosTiposRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosTipos")
public class TercerosTiposRefactorController {

    @Autowired
    private TercerosTiposRefactorRepository tercerosTiposRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosTipos> findAll() {
        return (List<TercerosTipos>) tercerosTiposRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<TercerosTipos> findEnabled() {
        return tercerosTiposRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosTipos findOne(@PathVariable Integer id) {
        return tercerosTiposRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosTipos create(@RequestBody TercerosTipos o) {
        return tercerosTiposRefactorRepository.save(
                new TercerosTipos(
                        o.getCodigo(),o.getTerceroTipo(),o.getIndicadorRequiereClasificacion(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosTipos o) {
        tercerosTiposRefactorRepository.save(
                new TercerosTipos(
                        o.getIdTerceroTipo(),o.getCodigo(),o.getTerceroTipo(),o.getIndicadorRequiereClasificacion(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
