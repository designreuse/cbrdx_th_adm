package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosPublicaciones;
import com.ciberdix.th.repositories.TercerosPublicacionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 8/06/2017.
 */

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/tercerosPublicaciones")
public class TercerosPublicacionesRefactorController {

    @Autowired
    private TercerosPublicacionesRefactorRepository tercerosPublicacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosPublicaciones> listarTerceros() {
        return (List<TercerosPublicaciones>) tercerosPublicacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    TercerosPublicaciones findOne(@PathVariable Integer id) {
        return tercerosPublicacionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/terceroPublicacion/{idTercero}/{idPublicacion}")
    TercerosPublicaciones findByIdTerceroAndIdPublicacion(@PathVariable Long idTercero, @PathVariable Integer idPublicacion) {
        return tercerosPublicacionesRefactorRepository.findAllByIdTerceroAndIdPublicacion(idTercero, idPublicacion);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosPublicaciones crearTercero(@RequestBody TercerosPublicaciones o) {
        return tercerosPublicacionesRefactorRepository.save(
                new TercerosPublicaciones(
                        o.getIdTercero(),o.getIdPublicacion(),o.getIndicadorTerminos(),o.getIndicadorCentrales(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario(),o.getIndicadorFinalizado(),o.getCodigo(),
                        o.getPaso()
                ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarTercero(@RequestBody TercerosPublicaciones o) {
        tercerosPublicacionesRefactorRepository.save(
                new TercerosPublicaciones(
                        o.getIdTercerosPublicaciones(),o.getIdTercero(),o.getIdPublicacion(),o.getIndicadorTerminos(),
                        o.getIndicadorCentrales(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario(),
                        o.getIndicadorFinalizado(),o.getCodigo(),o.getPaso()
                ));
    }

}
