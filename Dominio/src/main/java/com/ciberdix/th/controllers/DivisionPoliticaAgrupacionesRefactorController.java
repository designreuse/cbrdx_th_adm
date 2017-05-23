package com.ciberdix.th.controllers;

import com.ciberdix.th.models.DivisionPoliticaAgrupaciones;
import com.ciberdix.th.repositories.DivisionPoliticaAgrupacionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/divisionPoliticaAgrupaciones")
public class DivisionPoliticaAgrupacionesRefactorController {

    @Autowired
    private DivisionPoliticaAgrupacionesRefactorRepository divisionPoliticaAgrupacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPoliticaAgrupaciones> getLists() {
        return (List<DivisionPoliticaAgrupaciones>) divisionPoliticaAgrupacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    DivisionPoliticaAgrupaciones findList(@PathVariable Integer idLista) {
        return divisionPoliticaAgrupacionesRefactorRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    DivisionPoliticaAgrupaciones createList(@RequestBody DivisionPoliticaAgrupaciones c) {
        return divisionPoliticaAgrupacionesRefactorRepository.save(new DivisionPoliticaAgrupaciones(c.getIdDivisionPolitica(), c.getIdDivisionPoliticaArea(), c.getAgrupacion(), c.getIdTipoAgrupacion(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    DivisionPoliticaAgrupaciones updateList(@RequestBody DivisionPoliticaAgrupaciones c) {
        return divisionPoliticaAgrupacionesRefactorRepository.save(new DivisionPoliticaAgrupaciones(c.getIdDivisionPoliticaAgrupacion(), c.getIdDivisionPolitica(), c.getIdDivisionPoliticaArea(), c.getAgrupacion(), c.getIdTipoAgrupacion(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario()));
    }
}
