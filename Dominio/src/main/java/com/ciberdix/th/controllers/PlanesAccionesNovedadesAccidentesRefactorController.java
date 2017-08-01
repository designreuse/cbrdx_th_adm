package com.ciberdix.th.controllers;

import com.ciberdix.th.repositories.PlanesAccionesNovedadesAccidentesRefactorRepository;
import com.ciberdix.th.repositories.VPlanesAccionesNovedadesAccidentesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/planesAccionesNovedadesAccidentes")
public class PlanesAccionesNovedadesAccidentesRefactorController {

    @Autowired
    private PlanesAccionesNovedadesAccidentesRefactorRepository planesAccionesNovedadesAccidentesRefactorRepository;

    @Autowired
    private VPlanesAccionesNovedadesAccidentesRefactorRepository vPlanesAccionesNovedadesAccidentesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VPlanesAccionesNovedadesAccidentes> findAll() {
        return (List<VPlanesAccionesNovedadesAccidentes>) vPlanesAccionesNovedadesAccidentesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VPlanesAccionesNovedadesAccidentes> findEnabled() {
        return vPlanesAccionesNovedadesAccidentesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/novedadAccidente/{id}")
    List<VPlanesAccionesNovedadesAccidentes> findByIdGrupoDotacion(@PathVariable Integer id) {
        return vPlanesAccionesNovedadesAccidentesRefactorRepository.findAllByIdNovedadAccidente(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VPlanesAccionesNovedadesAccidentes findOne(@PathVariable Integer id) {
        return vPlanesAccionesNovedadesAccidentesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    PlanesAccionesNovedadesAccidentes create(@RequestBody PlanesAccionesNovedadesAccidentes o) {
        return planesAccionesNovedadesAccidentesRefactorRepository.save(
                new PlanesAccionesNovedadesAccidentes(
                        o.getIdNovedadAccidente(),o.getIdEstadoPlanAccion(),
                        o.getActividad(),o.getIdResponsable(),o.getFechaLimite(),o.getIdEncargado(),o.getFechaVerificacion(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody PlanesAccionesNovedadesAccidentes o) {
        planesAccionesNovedadesAccidentesRefactorRepository.save(
                new PlanesAccionesNovedadesAccidentes(
                        o.getIdPlanAccionNovedadAccidente(),o.getIdNovedadAccidente(),o.getIdEstadoPlanAccion(),
                        o.getActividad(),o.getIdResponsable(),o.getFechaLimite(),o.getIdEncargado(),o.getFechaVerificacion(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
