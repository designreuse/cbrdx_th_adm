package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProyeccionDotacion;
import com.ciberdix.th.models.VProyeccionDotacion;
import com.ciberdix.th.repositories.ProyeccionDotacionRefactorRepository;
import com.ciberdix.th.repositories.VProyeccionDotacionRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/proyeccionDotacion")
public class ProyeccionDotacionRefactorController {

    @Autowired
    private ProyeccionDotacionRefactorRepository proyeccionDotacionRefactorRepository;

    @Autowired
    private VProyeccionDotacionRefactorRepository vProyeccionDotacionRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VProyeccionDotacion> findAll() {
        return (List<VProyeccionDotacion>) vProyeccionDotacionRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProyeccionDotacion findOne(@PathVariable Integer id) {
        return vProyeccionDotacionRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProyeccionDotacion> findEnabled() {
        return vProyeccionDotacionRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/entreFechas/{fechaInicio}/{fechaFin}")
    List<VProyeccionDotacion> findByFechaSolicitudBetween(@PathVariable String fechaInicio, @PathVariable String fechaFin) throws ParseException {
        SimpleDateFormat fInicio = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat fFin = new SimpleDateFormat("yyyy-MM-dd");
        return vProyeccionDotacionRefactorRepository.findAllByFechaSolicitudBetween(fInicio.parse(fechaInicio), fFin.parse(fechaFin));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/entreFechas/{fechaInicio}/{fechaFin}/{idUsuario}")
    List<VProyeccionDotacion> findByFechaSolicitudBetweenAndIdUsuario(@PathVariable String fechaInicio, @PathVariable String fechaFin, @PathVariable Integer idUsuario) throws ParseException {
        SimpleDateFormat fInicio = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat fFin = new SimpleDateFormat("yyyy-MM-dd");
        return vProyeccionDotacionRefactorRepository.findAllByFechaSolicitudBetweenAndAuditoriaUsuario(fInicio.parse(fechaInicio), fFin.parse(fechaFin), idUsuario);
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
                        o.getAuditoriaUsuario(),o.getFechaSolicitud()
                )
        );
    }
    
}
