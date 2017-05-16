package com.ciberdix.th.controllers;

import com.ciberdix.th.models.DivisionPoliticaResguardos;
import com.ciberdix.th.repositories.DivisionPoliticaResguardosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/divisionPoliticaResguardos")
public class DivisionPoliticaResguardosRefactorController {

    @Autowired
    private DivisionPoliticaResguardosRefactorRepository divisionPoliticaResguardosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPoliticaResguardos> getLists() {
        return (List<DivisionPoliticaResguardos>) divisionPoliticaResguardosRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    DivisionPoliticaResguardos findList(@PathVariable Integer idLista) {
        return divisionPoliticaResguardosRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    DivisionPoliticaResguardos createList(@RequestBody DivisionPoliticaResguardos c) {
        return divisionPoliticaResguardosRepository.save(new DivisionPoliticaResguardos(c.getDescripcionDivisionPoliticaResguardo(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    DivisionPoliticaResguardos updateList(@RequestBody DivisionPoliticaResguardos centrosCostosEntity) {
        return divisionPoliticaResguardosRepository.save(centrosCostosEntity);
    }
}
