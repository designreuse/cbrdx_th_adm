package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProyeccionesDotacionesTercerosDotaciones;
import com.ciberdix.th.models.VProyeccionesDotacionesTercerosDotaciones;
import com.ciberdix.th.repositories.ProyeccionesDotacionesTercerosDotacionesRefactorRepository;
import com.ciberdix.th.repositories.VProyeccionesDotacionesTercerosDotacionesRefactorRepository;
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

    @Autowired
    private VProyeccionesDotacionesTercerosDotacionesRefactorRepository vProyeccionesDotacionesTercerosDotacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VProyeccionesDotacionesTercerosDotaciones> findAll() {
        return (List<VProyeccionesDotacionesTercerosDotaciones>) vProyeccionesDotacionesTercerosDotacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProyeccionesDotacionesTercerosDotaciones findOne(@PathVariable Integer id) {
        return vProyeccionesDotacionesTercerosDotacionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProyeccionesDotacionesTercerosDotaciones> findEnabled() {
        return  vProyeccionesDotacionesTercerosDotacionesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/dotacion/{id}")
    List<VProyeccionesDotacionesTercerosDotaciones> findByIdDotacion(@PathVariable Integer id) {
        return  vProyeccionesDotacionesTercerosDotacionesRefactorRepository.findAllByIdDotacion(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proyeccionDotacionTercero/{id}")
    List<VProyeccionesDotacionesTercerosDotaciones> findByIdProyeccionDotacionTercero(@PathVariable Integer id) {
        return  vProyeccionesDotacionesTercerosDotacionesRefactorRepository.findAllByIdProyeccionDotacionTercero(id);
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
