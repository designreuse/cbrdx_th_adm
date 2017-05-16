package com.ciberdix.th.controllers;

import com.ciberdix.th.models.DivisionPoliticaLocalidades;
import com.ciberdix.th.repositories.DivisionPoliticaLocalidadesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/divisionPoliticaLocalidades")
public class DivisionPoliticaLocalidadesRefactorController {

    @Autowired
    private DivisionPoliticaLocalidadesRefactorRepository divisionPoliticaLocalidadesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPoliticaLocalidades> getLists() {
        return (List<DivisionPoliticaLocalidades>) divisionPoliticaLocalidadesRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    DivisionPoliticaLocalidades findList(@PathVariable Integer idLista) {
        return divisionPoliticaLocalidadesRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    DivisionPoliticaLocalidades createList(@RequestBody DivisionPoliticaLocalidades c) {
        return divisionPoliticaLocalidadesRepository.save(new DivisionPoliticaLocalidades(c.getDescripcion(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    DivisionPoliticaLocalidades updateList(@RequestBody DivisionPoliticaLocalidades centrosCostos) {
        return divisionPoliticaLocalidadesRepository.save(centrosCostos);
    }
}
