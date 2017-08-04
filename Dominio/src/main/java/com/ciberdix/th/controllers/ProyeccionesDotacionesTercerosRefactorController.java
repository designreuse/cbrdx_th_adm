package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProyeccionesDotacionesTerceros;
import com.ciberdix.th.models.VProyeccionesDotacionesTerceros;
import com.ciberdix.th.repositories.ProyeccionesDotacionesTercerosRefactorRepository;
import com.ciberdix.th.repositories.VProyeccionesDotacionesTercerosRefactorRepository;
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
    private ProyeccionesDotacionesTercerosRefactorRepository proyeccionesDotacionesTercerosRefactorRepository;

    @Autowired
    private VProyeccionesDotacionesTercerosRefactorRepository vProyeccionesDotacionesTercerosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VProyeccionesDotacionesTerceros> findAll() {
        return (List<VProyeccionesDotacionesTerceros>) vProyeccionesDotacionesTercerosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProyeccionesDotacionesTerceros findOne(@PathVariable Integer id) {
        return vProyeccionesDotacionesTercerosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProyeccionesDotacionesTerceros> findEnabled() {
        return vProyeccionesDotacionesTercerosRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proyeccionDotacion/{idProyeccionDotacion}")
    List<VProyeccionesDotacionesTerceros> findIdProyeccionDotacion(@PathVariable Integer idProyeccionDotacion) {
        return vProyeccionesDotacionesTercerosRefactorRepository.findAllByIdProyeccionDotacion(idProyeccionDotacion);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proyeccionDotacion/{idProyeccionDotacion}/enabled")
    List<VProyeccionesDotacionesTerceros> findIdProyeccionDotacionEnabled(@PathVariable Integer idProyeccionDotacion) {
        return vProyeccionesDotacionesTercerosRefactorRepository.findAllByIdProyeccionDotacionAndIndicadorHabilitadoIsTrue(idProyeccionDotacion);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proyeccionDotacionTercero/{idProyeccionDotacion}/{idTercero}")
    VProyeccionesDotacionesTerceros findIdProyeccionDotacionAndIdTercero(@PathVariable Integer idProyeccionDotacion, @PathVariable Long idTercero) {
        return vProyeccionesDotacionesTercerosRefactorRepository.findAllByIdProyeccionDotacionAndIdTercero(idProyeccionDotacion,idTercero);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionesDotacionesTerceros create(@RequestBody ProyeccionesDotacionesTerceros o) {
        return proyeccionesDotacionesTercerosRefactorRepository.save(
                new ProyeccionesDotacionesTerceros(
                        o.getIdProyeccionDotacion(),o.getIdTercero(),
                        o.getIdEstado(),o.getFechaEntrega(),o.getFechaPosibleEntrega(),o.getComentario(),
                        o.getComentarioAdicional(),o.getComentarioEntrega(),o.getObservacion(),o.getIdMotivoSatisfecho(),
                        o.getIndicadorSatisfecho(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario(),o.getCodigoVerificacion()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProyeccionesDotacionesTerceros o) {
        proyeccionesDotacionesTercerosRefactorRepository.save(
                new ProyeccionesDotacionesTerceros(
                        o.getIdProyeccionDotacionTerceros(),o.getIdProyeccionDotacion(),o.getIdTercero(),
                        o.getIdEstado(),o.getFechaEntrega(),o.getFechaPosibleEntrega(),o.getComentario(),
                        o.getComentarioAdicional(),o.getComentarioEntrega(),o.getObservacion(),o.getIdMotivoSatisfecho(),
                        o.getIndicadorSatisfecho(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario(),o.getCodigoVerificacion()
                )
        );
    }
    
}
