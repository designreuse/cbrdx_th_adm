package com.ciberdix.th.controllers;

import com.ciberdix.th.models.PlanesAccionesNovedadesAccidentesAdjuntos;
import com.ciberdix.th.models.VPlanesAccionesNovedadesAccidentesAdjuntos;
import com.ciberdix.th.repositories.PlanesAccionesNovedadesAccidentesAdjuntosRefactorRepository;
import com.ciberdix.th.repositories.VPlanesAccionesNovedadesAccidentesAdjuntosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/planesAccionesNovedadesAccidentesAdjuntos")
public class PlanesAccionesNovedadesAccidentesAdjuntosRefactorController {

    @Autowired
    private PlanesAccionesNovedadesAccidentesAdjuntosRefactorRepository planesAccionesNovedadesAccidentesAdjuntosRefactorRepository;

    @Autowired
    private VPlanesAccionesNovedadesAccidentesAdjuntosRefactorRepository vPlanesAccionesNovedadesAccidentesAdjuntosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VPlanesAccionesNovedadesAccidentesAdjuntos> findAll() {
        return (List<VPlanesAccionesNovedadesAccidentesAdjuntos>) vPlanesAccionesNovedadesAccidentesAdjuntosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VPlanesAccionesNovedadesAccidentesAdjuntos> findEnabled() {
        return vPlanesAccionesNovedadesAccidentesAdjuntosRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VPlanesAccionesNovedadesAccidentesAdjuntos findOne(@PathVariable Integer id) {
        return vPlanesAccionesNovedadesAccidentesAdjuntosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/planAccionNovedadAccidente/{id}")
    List<VPlanesAccionesNovedadesAccidentesAdjuntos> findIdPlanAccionNovedadAccidente(@PathVariable Integer id) {
        return vPlanesAccionesNovedadesAccidentesAdjuntosRefactorRepository.findAllByIdPlanAccionNovedadAccidente(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    PlanesAccionesNovedadesAccidentesAdjuntos create(@RequestBody PlanesAccionesNovedadesAccidentesAdjuntos o) {
        return planesAccionesNovedadesAccidentesAdjuntosRefactorRepository.save(
                new PlanesAccionesNovedadesAccidentesAdjuntos(
                        o.getIdPlanAccionNovedadAccidente(),o.getIdAdjunto(),o.getCodigoAdjunto(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody PlanesAccionesNovedadesAccidentesAdjuntos o) {
        planesAccionesNovedadesAccidentesAdjuntosRefactorRepository.save(
                new PlanesAccionesNovedadesAccidentesAdjuntos(
                        o.getIdPlanAccionNovedadAccidenteAdjunto(),o.getIdPlanAccionNovedadAccidente(),o.getIdAdjunto(),
                        o.getCodigoAdjunto(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

}
