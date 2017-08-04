package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosTiposFuncionalidades;
import com.ciberdix.th.models.VTercerosTiposFuncionalidades;
import com.ciberdix.th.repositories.TercerosTiposFuncionalidadesRefactorRepository;
import com.ciberdix.th.repositories.VTercerosTiposFuncionalidadesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosTiposFuncionalidades")
public class TercerosTiposFuncionalidadesRefactorController {

    @Autowired
    private TercerosTiposFuncionalidadesRefactorRepository tercerosTiposFuncionalidadesRefactorRepository;

    @Autowired
    private VTercerosTiposFuncionalidadesRefactorRepository vTercerosTiposFuncionalidadesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosTiposFuncionalidades> findAll() {
        return (List<VTercerosTiposFuncionalidades>) vTercerosTiposFuncionalidadesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosTiposFuncionalidades> findEnabled() {
        return vTercerosTiposFuncionalidadesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosTiposFuncionalidades findOne(@PathVariable Integer id) {
        return vTercerosTiposFuncionalidadesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroTipo/{id}")
    List<VTercerosTiposFuncionalidades> findByIdTerceroTipo(@PathVariable Integer id) {
        return vTercerosTiposFuncionalidadesRefactorRepository.findAllByIdTipoTercero(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosTiposFuncionalidades create(@RequestBody TercerosTiposFuncionalidades o) {
        return tercerosTiposFuncionalidadesRefactorRepository.save(
                new TercerosTiposFuncionalidades(
                        o.getIdTipoTercero(),o.getFuncionalidad(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosTiposFuncionalidades o) {
        tercerosTiposFuncionalidadesRefactorRepository.save(
                new TercerosTiposFuncionalidades(
                        o.getIdTerceroTipoFuncionalidad(),o.getIdTipoTercero(),o.getFuncionalidad(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
