package com.ciberdix.th.controllers;

import com.ciberdix.th.models.GruposCompetencias;
import com.ciberdix.th.repositories.GruposCompetenciasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/gruposCompetencias")
public class GruposCompetenciasRefactorController {
    @Autowired
    private GruposCompetenciasRefactorRepository GruposCompetenciasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<GruposCompetencias> findAll() {
        return (List<GruposCompetencias>) GruposCompetenciasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<GruposCompetencias> findEnabled() {
        return (List<GruposCompetencias>) GruposCompetenciasRefactorRepository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    GruposCompetencias create(@RequestBody GruposCompetencias obj) {
        return GruposCompetenciasRefactorRepository.save(
                new GruposCompetencias(obj.getGrupoCompetencia(), obj.getDescripcion(),
                        obj.getPonderacion(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody GruposCompetencias obj) {
        GruposCompetenciasRefactorRepository.save(
                new GruposCompetencias(obj.getIdGrupoCompetencia(),obj.getGrupoCompetencia(), obj.getDescripcion(),
                        obj.getPonderacion(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
