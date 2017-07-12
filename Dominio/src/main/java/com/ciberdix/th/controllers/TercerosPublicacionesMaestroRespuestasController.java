package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosPublicacionesMaestroRespuestas;
import com.ciberdix.th.repositories.TercerosPublicacionesMaestroRespuestasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 14/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosPublicacionesMaestroRespuestas")
public class TercerosPublicacionesMaestroRespuestasController {

    @Autowired
    private TercerosPublicacionesMaestroRespuestasRepository TercerosPublicacionesMaestrosDetallesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosPublicacionesMaestroRespuestas> findAll() {
        return (List<TercerosPublicacionesMaestroRespuestas>) TercerosPublicacionesMaestrosDetallesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosPublicacionesMaestroRespuestas findOne(@PathVariable Integer id) {
        return TercerosPublicacionesMaestrosDetallesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroPublicacion/{id}")
    List<TercerosPublicacionesMaestroRespuestas> findPublication(@PathVariable Integer id) {
        return TercerosPublicacionesMaestrosDetallesRefactorRepository.findByIdTercerosPublicaciones(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosPublicacionesMaestroRespuestas create(@RequestBody TercerosPublicacionesMaestroRespuestas o) {
        return TercerosPublicacionesMaestrosDetallesRefactorRepository.save(
                new TercerosPublicacionesMaestroRespuestas(o.getIdTercerosPublicaciones(), o.getIdMaestroRespuesta())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosPublicacionesMaestroRespuestas o) {
        TercerosPublicacionesMaestrosDetallesRefactorRepository.save(
                new TercerosPublicacionesMaestroRespuestas(o.getIdTerceroPublicacionMaestroRespuestas(), o.getIdTercerosPublicaciones(), o.getIdMaestroRespuesta())
        );
    }

}
