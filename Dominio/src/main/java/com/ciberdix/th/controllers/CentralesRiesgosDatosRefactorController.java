package com.ciberdix.th.controllers;

import com.ciberdix.th.models.CentralesRiesgosDatos;
import com.ciberdix.th.models.VCentralesRiesgosDatos;
import com.ciberdix.th.repositories.CentralesRiesgosDatosRefactorRepository;
import com.ciberdix.th.repositories.VCentralesRiesgosDatosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/centralesRiesgosDatos")
public class CentralesRiesgosDatosRefactorController {

    @Autowired
    private CentralesRiesgosDatosRefactorRepository centralesRiesgosDatosRefactorRepository;

    @Autowired
    private VCentralesRiesgosDatosRefactorRepository vCentralesRiesgosDatosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VCentralesRiesgosDatos> findAll() {
        return (List<VCentralesRiesgosDatos>) vCentralesRiesgosDatosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCentralesRiesgosDatos> findEnabled() {
        return vCentralesRiesgosDatosRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCentralesRiesgosDatos findOne(@PathVariable Integer id) {
        return vCentralesRiesgosDatosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/centralRiesgo/{id}")
    List<VCentralesRiesgosDatos> findByIdTerceroTipo(@PathVariable Integer id) {
        return vCentralesRiesgosDatosRefactorRepository.findAllByIdCentralRiesgoAndIndicadorHabilitadoIsTrue(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CentralesRiesgosDatos create(@RequestBody CentralesRiesgosDatos o) {
        return centralesRiesgosDatosRefactorRepository.save(
                new CentralesRiesgosDatos(
                        o.getIdCentralRiesgo(),o.getIdDato(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CentralesRiesgosDatos o) {
        centralesRiesgosDatosRefactorRepository.save(
                new CentralesRiesgosDatos(
                        o.getIdCentralRiesgoDato(),o.getIdCentralRiesgo(),o.getIdDato(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }
    
}
