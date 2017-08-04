package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosTiposCentralesRiesgos;
import com.ciberdix.th.models.VTercerosTiposCentralesRiesgos;
import com.ciberdix.th.repositories.TercerosTiposCentralesRiesgosRefactorRepository;
import com.ciberdix.th.repositories.VTercerosTiposCentralesRiesgosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosTiposCentralesRiesgos")
public class TercerosTiposCentralesRiesgosRefactorController {

    @Autowired
    private TercerosTiposCentralesRiesgosRefactorRepository tercerosTiposCentralesRiesgosRefactorRepository;

    @Autowired
    private VTercerosTiposCentralesRiesgosRefactorRepository vTercerosTiposCentralesRiesgosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosTiposCentralesRiesgos> findAll() {
        return (List<VTercerosTiposCentralesRiesgos>) vTercerosTiposCentralesRiesgosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosTiposCentralesRiesgos> findEnabled() {
        return vTercerosTiposCentralesRiesgosRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosTiposCentralesRiesgos findOne(@PathVariable Integer id) {
        return vTercerosTiposCentralesRiesgosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroTipo/{id}")
    List<VTercerosTiposCentralesRiesgos> findByIdTerceroTipo(@PathVariable Integer id) {
        return vTercerosTiposCentralesRiesgosRefactorRepository.findAllByIdTerceroTipo(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosTiposCentralesRiesgos create(@RequestBody TercerosTiposCentralesRiesgos o) {
        return tercerosTiposCentralesRiesgosRefactorRepository.save(
                new TercerosTiposCentralesRiesgos(
                        o.getIdTerceroTipo(),o.getIdCentralRiesgo(),
                        o.getIndicadorRequiere(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosTiposCentralesRiesgos o) {
        tercerosTiposCentralesRiesgosRefactorRepository.save(
                new TercerosTiposCentralesRiesgos(
                        o.getIdTerceroTipoCentralRiesgos(),o.getIdTerceroTipo(),o.getIdCentralRiesgo(),
                        o.getIndicadorRequiere(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
