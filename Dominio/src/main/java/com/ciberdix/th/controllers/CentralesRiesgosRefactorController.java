package com.ciberdix.th.controllers;

import com.ciberdix.th.models.CentralesRiesgos;
import com.ciberdix.th.models.VCentralesRiesgos;
import com.ciberdix.th.repositories.CentralesRiesgosRefactorRepository;
import com.ciberdix.th.repositories.VCentralesRiesgosRefactorRepository;
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
@RequestMapping("/api/centralesRiesgos")
public class CentralesRiesgosRefactorController {

    @Autowired
    private CentralesRiesgosRefactorRepository centralesRiesgosRefactorRepository;

    @Autowired
    private VCentralesRiesgosRefactorRepository vCentralesRiesgosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VCentralesRiesgos> findAll() {
        return (List<VCentralesRiesgos>) vCentralesRiesgosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VCentralesRiesgos> findEnabled() {
        return  vCentralesRiesgosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{code}")
    List<VCentralesRiesgos> findByCodigoIfExist(@PathVariable String code) {
        return  vCentralesRiesgosRefactorRepository.findAllByCodigo(code);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCentralesRiesgos findOne(@PathVariable Integer id) {
        return vCentralesRiesgosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CentralesRiesgos create(@RequestBody CentralesRiesgos o) {
        return centralesRiesgosRefactorRepository.save(
                new CentralesRiesgos(
                        o.getCodigo(),o.getNombre(),o.getUrl(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario(),
                        o.getIndicadorReporta(),o.getDescripcion(),o.getIdTipoCentralInformacion(),o.getIdVigencia(),
                        o.getIndicadorWebServices(),o.getCausal(),o.getUsuario(),o.getClave(),o.getNombreDescarga(),
                        o.getNumeroDocumento()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CentralesRiesgos o) {
        centralesRiesgosRefactorRepository.save(
                new CentralesRiesgos(
                        o.getIdCentralRiesgo(),o.getCodigo(),o.getNombre(),o.getUrl(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario(),o.getIndicadorReporta(),o.getDescripcion(),o.getIdTipoCentralInformacion(),
                        o.getIdVigencia(),o.getIndicadorWebServices(),o.getCausal(),o.getUsuario(),o.getClave(),
                        o.getNombreDescarga(),o.getNumeroDocumento()
                )
        );
    }

}
