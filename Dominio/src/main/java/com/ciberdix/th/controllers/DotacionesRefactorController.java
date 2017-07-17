package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Dotaciones;
import com.ciberdix.th.models.VDotaciones;
import com.ciberdix.th.repositories.DotacionesRefactorRepository;
import com.ciberdix.th.repositories.VDotacionesRefactorRepository;
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
@RequestMapping("/api/dotaciones")
public class DotacionesRefactorController {

    @Autowired
    private DotacionesRefactorRepository dotacionesRefactorRepository;

    @Autowired
    private VDotacionesRefactorRepository vDotacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VDotaciones> findAll() {
        return (List<VDotaciones>) vDotacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VDotaciones> findEnabled() {
        return vDotacionesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VDotaciones findOne(@PathVariable Integer id) {
        return vDotacionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Dotaciones create(@RequestBody Dotaciones o) {
        return dotacionesRefactorRepository.save(
                new Dotaciones(
                        o.getIdGrupoDotacion(),o.getDotacion(),o.getDescripcion(),o.getCosto(),
                        o.getDetalleProveedor(),o.getIdCicloEntrega(),o.getIdTipoTalla(),o.getCantidad(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario(),o.getIdAdjunto(),o.getIndicadorAdicional(),o.getCodigo(),o.getIndicadorRequiereTalla()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Dotaciones o) {
        dotacionesRefactorRepository.save(
                new Dotaciones(
                        o.getIdDotacion(),o.getIdGrupoDotacion(),o.getDotacion(),o.getDescripcion(),o.getCosto(),
                        o.getDetalleProveedor(),o.getIdCicloEntrega(),o.getIdTipoTalla(),o.getCantidad(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario(),o.getIdAdjunto(),o.getIndicadorAdicional(),o.getCodigo(),o.getIndicadorRequiereTalla()
                )
        );
    }
    
}
