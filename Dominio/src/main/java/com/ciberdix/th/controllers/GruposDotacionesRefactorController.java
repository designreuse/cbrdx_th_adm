package com.ciberdix.th.controllers;

import com.ciberdix.th.models.GruposDotaciones;
import com.ciberdix.th.repositories.GruposDotacionesRefactorRepository;
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
@RequestMapping("/api/gruposDotaciones")
public class GruposDotacionesRefactorController {

    @Autowired
    private GruposDotacionesRefactorRepository gruposDotacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<GruposDotaciones> findAll() {
        return (List<GruposDotaciones>) gruposDotacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<GruposDotaciones> findEnabled() {
        return gruposDotacionesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    GruposDotaciones findOne(@PathVariable Integer id) {
        return gruposDotacionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    GruposDotaciones create(@RequestBody GruposDotaciones o) {
        return gruposDotacionesRefactorRepository.save(
                new GruposDotaciones(
                        o.getGrupoDotacion(),o.getDescripcion(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario(),o.getCodigo()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody GruposDotaciones o) {
        gruposDotacionesRefactorRepository.save(
                new GruposDotaciones(
                        o.getIdGrupoDotacion(),o.getGrupoDotacion(),o.getDescripcion(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario(),o.getCodigo()
                )
        );
    }
    
}
