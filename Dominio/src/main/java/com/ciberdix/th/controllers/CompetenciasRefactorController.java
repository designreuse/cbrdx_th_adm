package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Competencias;
import com.ciberdix.th.repositories.CompetenciasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/competencias")
public class CompetenciasRefactorController {
    @Autowired
    private CompetenciasRefactorRepository CompetenciasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Competencias> findAll() {
        return (List<Competencias>) CompetenciasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Competencias findOne(@PathVariable Integer id) {
        return CompetenciasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/{id}")
    List<Competencias> findEnabled(@PathVariable Integer id) {
        return CompetenciasRefactorRepository.findByIdGrupoCompetenciaAndIndicadorHabilitadoTrue(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarGrupo/{id}")
    List<Competencias> findGrupos(@PathVariable Integer id) {
        return CompetenciasRefactorRepository.findByIdGrupoCompetencia(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Competencias create(@RequestBody Competencias obj) {
        return CompetenciasRefactorRepository.save(new Competencias(obj.getIdGrupoCompetencia(), obj.getCompetencia(),
                obj.getDescripcion(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Competencias obj) {
        CompetenciasRefactorRepository.save(
                new Competencias(obj.getIdCompetencia(),obj.getIdGrupoCompetencia(), obj.getCompetencia(),
                        obj.getDescripcion(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
