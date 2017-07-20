package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosNovedadesAdjuntos;
import com.ciberdix.th.models.VTercerosNovedadesAdjuntos;
import com.ciberdix.th.repositories.TercerosNovedadesAdjuntosRefactorRepository;
import com.ciberdix.th.repositories.VTercerosNovedadesAdjuntosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosNovedadesAdjuntos")
public class TercerosNovedadesAdjuntosRefactorController {

    @Autowired
    private TercerosNovedadesAdjuntosRefactorRepository tercerosNovedadesAdjuntosRefactorRepository;

    @Autowired
    private VTercerosNovedadesAdjuntosRefactorRepository vTercerosNovedadesAdjuntosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosNovedadesAdjuntos> findAll() {
        return (List<VTercerosNovedadesAdjuntos>) vTercerosNovedadesAdjuntosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosNovedadesAdjuntos> findEnabled() {
        return vTercerosNovedadesAdjuntosRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroNovedad/{id}")
    List<VTercerosNovedadesAdjuntos> findByIdTerceroNovedad(@PathVariable Integer id) {
        return vTercerosNovedadesAdjuntosRefactorRepository.findAllByIdTerceroNovedad(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosNovedadesAdjuntos findOne(@PathVariable Integer id) {
        return vTercerosNovedadesAdjuntosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosNovedadesAdjuntos create(@RequestBody TercerosNovedadesAdjuntos o) {
        return tercerosNovedadesAdjuntosRefactorRepository.save(
                new TercerosNovedadesAdjuntos(
                        o.getIdTerceroNovedad(),o.getIdAdjunto(),o.getAuditoriaUsuario(),
                        o.getIndicadorHabilitado()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosNovedadesAdjuntos o) {
        tercerosNovedadesAdjuntosRefactorRepository.save(
                new TercerosNovedadesAdjuntos(
                        o.getIdTerceroNovedadAdjunto(),o.getIdTerceroNovedad(),o.getIdAdjunto(),o.getAuditoriaUsuario(),
                        o.getIndicadorHabilitado()
                )
        );
    }
    
}
