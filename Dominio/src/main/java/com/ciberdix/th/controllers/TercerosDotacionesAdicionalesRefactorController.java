package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosDotacionesAdicionales;
import com.ciberdix.th.models.VTercerosDotacionesAdicionales;
import com.ciberdix.th.repositories.TercerosDotacionesAdicionalesRefactorRepository;
import com.ciberdix.th.repositories.VTercerosDotacionesAdicionalesRefactorRepository;
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

    @Autowired
    private VTercerosDotacionesAdicionalesRefactorRepository vTercerosDotacionesAdicionalesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosDotacionesAdicionales> findAll() {
        return (List<VTercerosDotacionesAdicionales>) vTercerosDotacionesAdicionalesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosDotacionesAdicionales findOne(@PathVariable Integer id) {
        return vTercerosDotacionesAdicionalesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosDotacionesAdicionales> findEnabled() {
        return vTercerosDotacionesAdicionalesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{idTercero}")
    List<VTercerosDotacionesAdicionales> findEnabled(@PathVariable Long idTercero) {
        return vTercerosDotacionesAdicionalesRefactorRepository.findAllByIndicadorHabilitadoIsTrueAndIdTercero(idTercero);
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
