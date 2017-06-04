package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Publicaciones;
import com.ciberdix.th.models.VCantidadPublicacion;
import com.ciberdix.th.models.VPublicaciones;
import com.ciberdix.th.repositories.PublicacionesRefactorRepository;
import com.ciberdix.th.repositories.VCantidadPublicacionRefactorRepository;
import com.ciberdix.th.repositories.VPublicacionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 31/05/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/publicaciones")
@CrossOrigin
public class PublicacionesRefactorController {

    @Autowired
    private PublicacionesRefactorRepository publicacionesRefactorRepository;

    @Autowired
    private VPublicacionesRefactorRepository vPublicacionesRefactorRepository;

    @Autowired
    private VCantidadPublicacionRefactorRepository vCantidadPublicacionRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VPublicaciones> listarProductividades() {
        return (List<VPublicaciones>) vPublicacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VPublicaciones parent(@PathVariable Integer id) {
        return vPublicacionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Publicaciones crearActividadEconomica(@RequestBody Publicaciones o) {
        return publicacionesRefactorRepository.save(
                new Publicaciones(o.getIdRequerimiento(),o.getFechaInicio(),o.getFechaFin(),o.getIndicadorSalario(),
                        o.getIndicadorBonificacion(),o.getIdNivelEducacion(),o.getIdTipoTrabajo(),o.getDescripcionGeneral(),
                        o.getLugarTrabajo(),o.getCompetenciasLaborales(),o.getIndicadorObservacion(),o.getObservacion(),
                        o.getAuditoriaUsuario(),o.getIndicadorHabilitado(),o.getIndicadorPublicacion(),o.getIdFormaReclutamiento())
        );
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cantidadPublicacion")
    List<VCantidadPublicacion> findCant(@PathVariable Integer id) {
        return (List<VCantidadPublicacion>) vCantidadPublicacionRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarActividadEconomica(@RequestBody Publicaciones o) {
        publicacionesRefactorRepository.save(
                new Publicaciones(o.getIdPublicacion(),o.getIdRequerimiento(),o.getFechaInicio(),o.getFechaFin(),o.getIndicadorSalario(),
                        o.getIndicadorBonificacion(),o.getIdNivelEducacion(),o.getIdTipoTrabajo(),o.getDescripcionGeneral(),
                        o.getLugarTrabajo(),o.getCompetenciasLaborales(),o.getIndicadorObservacion(),o.getObservacion(),
                        o.getAuditoriaUsuario(),o.getIndicadorHabilitado(),o.getIndicadorPublicacion(),o.getIdFormaReclutamiento())
        );
    }

}
