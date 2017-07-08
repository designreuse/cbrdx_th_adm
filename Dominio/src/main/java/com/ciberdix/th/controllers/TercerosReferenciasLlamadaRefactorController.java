package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosReferenciasLlamada;
import com.ciberdix.th.repositories.TercerosReferenciasLlamadaRefactorRepository;
import com.ciberdix.th.repositories.VTercerosReferenciasLlamadaRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/tercerosReferenciasLlamada")
public class TercerosReferenciasLlamadaRefactorController {

    @Autowired
    private TercerosReferenciasLlamadaRefactorRepository tercerosReferenciasLlamadaRefactorRepository;

    @Autowired
    private VTercerosReferenciasLlamadaRefactorRepository vTercerosReferenciasLlamadaRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosReferenciasLlamada> findAll() {
        return (List<VTercerosReferenciasLlamada>) vTercerosReferenciasLlamadaRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    VTercerosReferenciasLlamada findOne(@PathVariable int id) {
        return vTercerosReferenciasLlamadaRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosReferenciasLlamada> findEnabled() {
        return vTercerosReferenciasLlamadaRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroReferencia/{id}")
    List<VTercerosReferenciasLlamada> findByIdTerceroReferencia(@PathVariable Integer id) {
        return vTercerosReferenciasLlamadaRefactorRepository.findAllByIdTerceroReferencia(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/resultadoLlamada/{id}")
    List<VTercerosReferenciasLlamada> findByIdResultadoLlamada(@PathVariable Integer id) {
        return vTercerosReferenciasLlamadaRefactorRepository.findAllByIdResultadoLlamada(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosReferenciasLlamada create(@RequestBody TercerosReferenciasLlamada o) {
        return tercerosReferenciasLlamadaRefactorRepository.save(new TercerosReferenciasLlamada(
                o.getIdTerceroReferencia(),o.getIdResultadoLlamada(),
                o.getIdAdjunto(),o.getIdCuestionario(),o.getIdRespuestaCuestionario(),
                o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
        ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosReferenciasLlamada o) {
        tercerosReferenciasLlamadaRefactorRepository.save(new TercerosReferenciasLlamada(
                o.getIdTerceroReferenciaLlamada(),o.getIdTerceroReferencia(),o.getIdResultadoLlamada(),
                o.getIdAdjunto(),o.getIdCuestionario(),o.getIdRespuestaCuestionario(),
                o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
        ));
    }
    
}
