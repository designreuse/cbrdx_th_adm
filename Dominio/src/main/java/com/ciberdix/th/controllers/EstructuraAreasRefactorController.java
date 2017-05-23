package com.ciberdix.th.controllers;

import com.ciberdix.th.models.EstructuraAreas;
import com.ciberdix.th.repositories.EstructuraAreasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/estructuraAreas")
public class EstructuraAreasRefactorController {
    @Autowired
    private EstructuraAreasRefactorRepository estructuraAreasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<EstructuraAreas> findAll() {
        return (List<EstructuraAreas>) estructuraAreasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<EstructuraAreas> findEnabled() {
        return (List<EstructuraAreas>) estructuraAreasRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    EstructuraAreas findOne(@PathVariable Integer id) {
        return estructuraAreasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstructuraAreas create(@RequestBody EstructuraAreas obj) {
        return estructuraAreasRefactorRepository.save(
                new EstructuraAreas(obj.getEstructuraArea(), obj.getCodigoArea(),
                        obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody EstructuraAreas obj) {
        estructuraAreasRefactorRepository.save(
                new EstructuraAreas(obj.getIdEstructuraArea(),obj.getEstructuraArea(), obj.getCodigoArea(),
                        obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
