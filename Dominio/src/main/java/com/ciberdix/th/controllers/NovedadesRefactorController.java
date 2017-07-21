package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Novedades;
import com.ciberdix.th.models.VNovedades;
import com.ciberdix.th.repositories.NovedadesRefactorRepository;
import com.ciberdix.th.repositories.VNovedadesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/novedades")
public class NovedadesRefactorController {

    @Autowired
    private NovedadesRefactorRepository novedadesRefactorRepository;

    @Autowired
    private VNovedadesRefactorRepository vNovedadesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VNovedades> findAll() {
        return (List<VNovedades>) vNovedadesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VNovedades> findEnabled() {
        return vNovedadesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VNovedades findOne(@PathVariable Integer id) {
        return vNovedadesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tipoNovedad/{id}")
    List<VNovedades> findByIdTipoNovedad(@PathVariable Integer id) {
        return vNovedadesRefactorRepository.findAllByIdTipoNovedad(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Novedades create(@RequestBody Novedades o) {
        return novedadesRefactorRepository.save(
                new Novedades(
                        o.getCodigoNovedad(),o.getNovedad(),o.getIdTipoNovedad(),
                        o.getIdRolResponsable(),o.getIdEstadoInicialNovedad(),o.getIndicadorHabilitado(),
                        o.getIndicadorAusentismo(),o.getIndicadorSeguimiento(),o.getIndicadorConfirmacion(),
                        o.getIndicadorAdjuntos(),o.getIndicadorAutorizaJefe(),o.getIndicadorNotificaJefe(),
                        o.getIndicadorBandeja(),o.getIndicadorPlanta(),o.getIndicadorAreasApoyo(),
                        o.getCodigoSafix(),o.getIndicadorNomina(),o.getIndicadorAfecta(),o.getIdTipoAfectacion(),
                        o.getIndicadorCancelacion(),o.getAuditoriaUsuario(),o.getIdEstadoTercero()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Novedades o) {
        novedadesRefactorRepository.save(
                new Novedades(
                        o.getIdNovedad(),o.getCodigoNovedad(),o.getNovedad(),o.getIdTipoNovedad(),
                        o.getIdRolResponsable(),o.getIdEstadoInicialNovedad(),o.getIndicadorHabilitado(),
                        o.getIndicadorAusentismo(),o.getIndicadorSeguimiento(),o.getIndicadorConfirmacion(),
                        o.getIndicadorAdjuntos(),o.getIndicadorAutorizaJefe(),o.getIndicadorNotificaJefe(),
                        o.getIndicadorBandeja(),o.getIndicadorPlanta(),o.getIndicadorAreasApoyo(),
                        o.getCodigoSafix(),o.getIndicadorNomina(),o.getIndicadorAfecta(),o.getIdTipoAfectacion(),
                        o.getIndicadorCancelacion(),o.getAuditoriaUsuario(),o.getFechaCreacion(),o.getIdEstadoTercero()
                )
        );
    }
    
}
