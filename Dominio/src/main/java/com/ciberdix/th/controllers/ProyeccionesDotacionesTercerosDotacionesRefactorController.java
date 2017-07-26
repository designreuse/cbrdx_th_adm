package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProyeccionesDotacionesTercerosDotaciones;
import com.ciberdix.th.repositories.ProyeccionesDotacionesTercerosDotacionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/proyeccionesDotacionesTercerosDotaciones")
public class ProyeccionesDotacionesTercerosDotacionesRefactorController {

    @Autowired
    private ProyeccionesDotacionesTercerosDotacionesRefactorRepository ProyeccionesDotacionesTercerosDotacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ProyeccionesDotacionesTercerosDotaciones> findAll() {
        return (List<ProyeccionesDotacionesTercerosDotaciones>) ProyeccionesDotacionesTercerosDotacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ProyeccionesDotacionesTercerosDotaciones findOne(@PathVariable Integer id) {
        return ProyeccionesDotacionesTercerosDotacionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionesDotacionesTercerosDotaciones create(@RequestBody ProyeccionesDotacionesTercerosDotaciones o) {
        return ProyeccionesDotacionesTercerosDotacionesRefactorRepository.save(
                new ProyeccionesDotacionesTercerosDotaciones(
                        o.getIdProyeccionDotacionTercero(),
                        o.getIdDotacion(),o.getCantidadAsignada(),o.getCantidadEntregada(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProyeccionesDotacionesTercerosDotaciones o) {
        ProyeccionesDotacionesTercerosDotacionesRefactorRepository.save(
                new ProyeccionesDotacionesTercerosDotaciones(
                        o.getIdProyeccionDotacionTerceroDotacion(),o.getIdProyeccionDotacionTercero(),
                        o.getIdDotacion(),o.getCantidadAsignada(),o.getCantidadEntregada(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
