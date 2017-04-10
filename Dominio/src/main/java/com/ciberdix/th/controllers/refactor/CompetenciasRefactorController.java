package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Competencias;
import com.ciberdix.th.repositories.refactor.CompetenciasRefactorRepository;
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

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/{id}")
    List<Competencias> findEnabled(@PathVariable Integer id) {
        return (List<Competencias>) CompetenciasRefactorRepository.findByIdGrupoCompetenciaAndIndicadorHabilitadoTrue(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Competencias create(@RequestBody Competencias obj) {
        return CompetenciasRefactorRepository.save(new Competencias(obj.getIdGrupoCompetencia(), obj.getCompetencia(), obj.getDescripcion(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Competencias obj) {
        CompetenciasRefactorRepository.save(obj);
    }
}