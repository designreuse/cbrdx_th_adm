package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosDocumentosTercero;
import com.ciberdix.th.models.VTercerosDocumentosTercero;
import com.ciberdix.th.repositories.TercerosDocumentosTerceroRefactorRepository;
import com.ciberdix.th.repositories.VTercerosDocumentosTerceroRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosDocumentosTercero")
public class TercerosDocumentosTerceroRefactorController {

    @Autowired
    private TercerosDocumentosTerceroRefactorRepository tercerosDocumentosTerceroRefactorRepository;

    @Autowired
    private VTercerosDocumentosTerceroRefactorRepository vTercerosDocumentosTerceroRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosDocumentosTercero> findAll() {
        return (List<VTercerosDocumentosTercero>) vTercerosDocumentosTerceroRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosDocumentosTercero> findEnabled() {
        return vTercerosDocumentosTerceroRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosDocumentosTercero findOne(@PathVariable Integer id) {
        return vTercerosDocumentosTerceroRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{id}")
    List<VTercerosDocumentosTercero> findByIdTercero(@PathVariable Long id) {
        return vTercerosDocumentosTerceroRefactorRepository.findAllByIdTercero(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/documentoTercero/{id}")
    List<VTercerosDocumentosTercero> findByIdDocumentoTercero(@PathVariable Integer id) {
        return vTercerosDocumentosTerceroRefactorRepository.findAllByIdDocumentoTercero(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosDocumentosTercero create(@RequestBody TercerosDocumentosTercero o) {
        return tercerosDocumentosTerceroRefactorRepository.save(
                new TercerosDocumentosTercero(
                        o.getIdTercero(),o.getIdDocumentoTercero(),
                        o.getIdAdjunto(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosDocumentosTercero o) {
        tercerosDocumentosTerceroRefactorRepository.save(
                new TercerosDocumentosTercero(
                        o.getIdTerceroDocumentoTercero(),o.getIdTercero(),o.getIdDocumentoTercero(),
                        o.getIdAdjunto(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
