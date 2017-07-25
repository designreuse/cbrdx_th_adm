package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosDotacionesAdicionales;
import com.ciberdix.th.repositories.TercerosDotacionesAdicionalesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosDotacionesAdicionales")
public class TercerosDotacionesAdicionalesRefactorController {

    @Autowired
    private TercerosDotacionesAdicionalesRefactorRepository tercerosDotacionesAdicionalesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosDotacionesAdicionales> findAll() {
        return (List<TercerosDotacionesAdicionales>) tercerosDotacionesAdicionalesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosDotacionesAdicionales findOne(@PathVariable Integer id) {
        return tercerosDotacionesAdicionalesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosDotacionesAdicionales create(@RequestBody TercerosDotacionesAdicionales o) {
        return tercerosDotacionesAdicionalesRefactorRepository.save(
                new TercerosDotacionesAdicionales(
                        o.getIdTercero(),o.getIdDotacion(),o.getCantidadDotacion(),
                        o.getIdTalla(),o.getIdProyeccionDotacion(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosDotacionesAdicionales o) {
        tercerosDotacionesAdicionalesRefactorRepository.save(
                new TercerosDotacionesAdicionales(
                        o.getIdTerceroDotacionAdicional(),o.getIdTercero(),o.getIdDotacion(),o.getCantidadDotacion(),
                        o.getIdTalla(),o.getIdProyeccionDotacion(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
