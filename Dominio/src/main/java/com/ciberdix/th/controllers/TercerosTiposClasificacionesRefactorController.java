package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosTipos;
import com.ciberdix.th.models.TercerosTiposClasificaciones;
import com.ciberdix.th.repositories.TercerosTiposClasificacionesRefactorRepository;
import com.ciberdix.th.repositories.TercerosTiposRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosTiposClasificaciones")
public class TercerosTiposClasificacionesRefactorController {

    @Autowired
    private TercerosTiposClasificacionesRefactorRepository tercerosTiposClasificacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosTiposClasificaciones> findAll() {
        return (List<TercerosTiposClasificaciones>) tercerosTiposClasificacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<TercerosTiposClasificaciones> findEnabled() {
        return tercerosTiposClasificacionesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosTiposClasificaciones findOne(@PathVariable Integer id) {
        return tercerosTiposClasificacionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroTipo/{id}")
    List<TercerosTiposClasificaciones> findByIdTerceroTipo(@PathVariable Integer id) {
        return tercerosTiposClasificacionesRefactorRepository.findAllByIdTerceroTipo(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosTiposClasificaciones create(@RequestBody TercerosTiposClasificaciones o) {
        return tercerosTiposClasificacionesRefactorRepository.save(
                new TercerosTiposClasificaciones(
                        o.getCodigo(),o.getTerceroTipoClasificacion(),o.getIdTerceroTipo(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosTiposClasificaciones o) {
        tercerosTiposClasificacionesRefactorRepository.save(
                new TercerosTiposClasificaciones(
                        o.getIdTerceroTipoClasificacion(),o.getCodigo(),o.getTerceroTipoClasificacion(),o.getIdTerceroTipo(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

}
