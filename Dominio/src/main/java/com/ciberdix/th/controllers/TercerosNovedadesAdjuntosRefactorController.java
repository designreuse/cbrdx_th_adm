package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosNovedadesAdjuntos;
import com.ciberdix.th.repositories.TercerosNovedadesAdjuntosRefactorRepository;
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

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosNovedadesAdjuntos> findAll() {
        return (List<TercerosNovedadesAdjuntos>) tercerosNovedadesAdjuntosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<TercerosNovedadesAdjuntos> findEnabled() {
        return tercerosNovedadesAdjuntosRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroNovedad/{id}")
    List<TercerosNovedadesAdjuntos> findByIdTerceroNovedad(@PathVariable Integer id) {
        return tercerosNovedadesAdjuntosRefactorRepository.findAllByIdTerceroNovedad(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosNovedadesAdjuntos findOne(@PathVariable Integer id) {
        return tercerosNovedadesAdjuntosRefactorRepository.findOne(id);
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
