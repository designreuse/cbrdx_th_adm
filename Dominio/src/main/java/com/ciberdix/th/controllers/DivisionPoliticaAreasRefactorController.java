package com.ciberdix.th.controllers;

import com.ciberdix.th.models.DivisionPoliticaAreas;
import com.ciberdix.th.repositories.DivisionPoliticaAreasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/divisionPoliticaAreas")
public class DivisionPoliticaAreasRefactorController {

    @Autowired
    private DivisionPoliticaAreasRefactorRepository divisionPoliticaAreasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPoliticaAreas> getLists() {
        return (List<DivisionPoliticaAreas>) divisionPoliticaAreasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLista}")
    DivisionPoliticaAreas findList(@PathVariable Integer idLista) {
        return divisionPoliticaAreasRefactorRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    DivisionPoliticaAreas createList(@RequestBody DivisionPoliticaAreas c) {
        return divisionPoliticaAreasRefactorRepository.save(new DivisionPoliticaAreas(c.getDescripcionDivisionPoliticaArea(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    DivisionPoliticaAreas updateList(@RequestBody DivisionPoliticaAreas centrosCostosEntity) {
        return divisionPoliticaAreasRefactorRepository.save(centrosCostosEntity);
    }
}
