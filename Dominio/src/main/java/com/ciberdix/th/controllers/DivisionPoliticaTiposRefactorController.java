package com.ciberdix.th.controllers;

import com.ciberdix.th.models.DivisionPoliticaTipos;
import com.ciberdix.th.repositories.DivisionPoliticaTiposRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/divisionPoliticaTipos")
public class DivisionPoliticaTiposRefactorController {

    @Autowired
    private DivisionPoliticaTiposRefactorRepository divisionPoliticaRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPoliticaTipos> getLists() {
        return (List<DivisionPoliticaTipos>) divisionPoliticaRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    DivisionPoliticaTipos findList(@PathVariable Integer idLista) {
        return divisionPoliticaRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    DivisionPoliticaTipos createList(@RequestBody DivisionPoliticaTipos c) {
        return divisionPoliticaRepository.save(new DivisionPoliticaTipos(c.getDescripcionTipo(), c.getCodigoDivisionPoliticaTipo(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    DivisionPoliticaTipos updateList(@RequestBody DivisionPoliticaTipos centrosCostosEntity) {
        return divisionPoliticaRepository.save(centrosCostosEntity);
    }
}
