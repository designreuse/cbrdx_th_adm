package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProyeccionDotacion;
import com.ciberdix.th.repositories.ProyeccionDotacionRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/proyeccionDotacion")
public class ProyeccionDotacionRefactorController {

    @Autowired
    private ProyeccionDotacionRefactorRepository proyeccionDotacionRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ProyeccionDotacion> findAll() {
        return (List<ProyeccionDotacion>) proyeccionDotacionRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ProyeccionDotacion findOne(@PathVariable Integer id) {
        return proyeccionDotacionRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionDotacion create(@RequestBody ProyeccionDotacion o) {
        return proyeccionDotacionRefactorRepository.save(
                new ProyeccionDotacion(
                        o.getNombreProyeccion(),o.getIdGrupoDotacion(),
                        o.getIndicadorAdicional(),o.getIndicadorNoAreas(),o.getCantidadProyeccion(),
                        o.getCantidadMeses(),o.getFechaInicio(),o.getFechaFin(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProyeccionDotacion o) {
        proyeccionDotacionRefactorRepository.save(
                new ProyeccionDotacion(
                        o.getIdProyeccionDotacion(),o.getNombreProyeccion(),o.getIdGrupoDotacion(),
                        o.getIndicadorAdicional(),o.getIndicadorNoAreas(),o.getCantidadProyeccion(),
                        o.getCantidadMeses(),o.getFechaInicio(),o.getFechaFin(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }
    
}
