package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosTiposDocumentosTerceros;
import com.ciberdix.th.models.VTercerosTiposDocumentosTerceros;
import com.ciberdix.th.repositories.TercerosTiposDocumentosTercerosRefactorRepository;
import com.ciberdix.th.repositories.VTercerosTiposDocumentosTercerosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosTiposDocumentosTerceros")
public class TercerosTiposDocumentosTercerosRefactorController {

    @Autowired
    private TercerosTiposDocumentosTercerosRefactorRepository TercerosTiposDocumentosTercerosRefactorRepository;

    @Autowired
    private VTercerosTiposDocumentosTercerosRefactorRepository vTercerosTiposDocumentosTercerosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosTiposDocumentosTerceros> findAll() {
        return (List<VTercerosTiposDocumentosTerceros>) vTercerosTiposDocumentosTercerosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosTiposDocumentosTerceros> findEnabled() {
        return vTercerosTiposDocumentosTercerosRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosTiposDocumentosTerceros findOne(@PathVariable Integer id) {
        return vTercerosTiposDocumentosTercerosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroTipo/{id}")
    List<VTercerosTiposDocumentosTerceros> findByIdTerceroTipo(@PathVariable Integer id) {
        return vTercerosTiposDocumentosTercerosRefactorRepository.findAllByIdTerceroTipo(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosTiposDocumentosTerceros create(@RequestBody TercerosTiposDocumentosTerceros o) {
        return TercerosTiposDocumentosTercerosRefactorRepository.save(
                new TercerosTiposDocumentosTerceros(
                        o.getIdTerceroTipo(),o.getIdDocumentoTercero(),
                        o.getIndicadorRequiere(),o.getIndicadorObligatorio(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosTiposDocumentosTerceros o) {
        TercerosTiposDocumentosTercerosRefactorRepository.save(
                new TercerosTiposDocumentosTerceros(
                        o.getIdTerceroTipoDocumentoTercero(),o.getIdTerceroTipo(),o.getIdDocumentoTercero(),
                        o.getIndicadorRequiere(),o.getIndicadorObligatorio(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }
    
}
