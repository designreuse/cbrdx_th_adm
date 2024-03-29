package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosCentralesRiesgos;
import com.ciberdix.th.repositories.TercerosCentralesRiesgosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 13/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosCentralesRiesgos")
public class TercerosCentralesRiesgosRefactorController {

    @Autowired
    private TercerosCentralesRiesgosRefactorRepository tercerosCentralesRiesgosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosCentralesRiesgos> findAll() {
        return (List<TercerosCentralesRiesgos>) tercerosCentralesRiesgosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<TercerosCentralesRiesgos> findEnabled() {
        return tercerosCentralesRiesgosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosCentralesRiesgos findOne(@PathVariable Integer id) {
        return tercerosCentralesRiesgosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{idTercero}")
    List<TercerosCentralesRiesgos> findByIdTercero(@PathVariable Long idTercero) {
        return tercerosCentralesRiesgosRefactorRepository.findAllByIdTercero(idTercero);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosCentralesRiesgos create(@RequestBody TercerosCentralesRiesgos o) {
        if (o.getIdTerceroCentralRiesgo() == null) {
            return tercerosCentralesRiesgosRefactorRepository.save(
                    new TercerosCentralesRiesgos(
                            o.getIdTercero(), o.getIdCentralRiesgo(), o.getIdAdjunto(), o.getIndicadorHabilitado(), o.getAuditoriaUsuario(), o.getIndicadorReportado(), o.getIndicadorAprobado()
                    )
            );
        } else {
            return tercerosCentralesRiesgosRefactorRepository.save(
                    new TercerosCentralesRiesgos(
                            o.getIdTerceroCentralRiesgo(), o.getIdTercero(), o.getIdCentralRiesgo(), o.getIdAdjunto(), o.getIndicadorHabilitado(), o.getAuditoriaUsuario(), o.getIndicadorReportado(), o.getIndicadorAprobado()
                    )
            );
        }
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosCentralesRiesgos o) {
        tercerosCentralesRiesgosRefactorRepository.save(
                new TercerosCentralesRiesgos(
                        o.getIdTerceroCentralRiesgo(), o.getIdTercero(), o.getIdCentralRiesgo(), o.getIdAdjunto(), o.getIndicadorHabilitado(), o.getAuditoriaUsuario(), o.getIndicadorReportado(), o.getIndicadorAprobado()
                )
        );
    }

}
