package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProyeccionesDotacionesTerceros;
import com.ciberdix.th.repositories.ProyeccionesDotacionesTercerosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/proyeccionesDotacionesTerceros")
public class ProyeccionesDotacionesTercerosRefactorController {

    @Autowired
    private ProyeccionesDotacionesTercerosRefactorRepository ProyeccionesDotacionesTercerosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ProyeccionesDotacionesTerceros> findAll() {
        return (List<ProyeccionesDotacionesTerceros>) ProyeccionesDotacionesTercerosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ProyeccionesDotacionesTerceros findOne(@PathVariable Integer id) {
        return ProyeccionesDotacionesTercerosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionesDotacionesTerceros create(@RequestBody ProyeccionesDotacionesTerceros o) {
        return ProyeccionesDotacionesTercerosRefactorRepository.save(
                new ProyeccionesDotacionesTerceros(
                        o.getIdProyeccionDotacion(),o.getIdTercero(),
                        o.getIdEstado(),o.getFechaEntrega(),o.getComentario(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProyeccionesDotacionesTerceros o) {
        ProyeccionesDotacionesTercerosRefactorRepository.save(
                new ProyeccionesDotacionesTerceros(
                        o.getIdProyeccionDotacionTerceros(),o.getIdProyeccionDotacion(),o.getIdTercero(),
                        o.getIdEstado(),o.getFechaEntrega(),o.getComentario(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }
    
}
