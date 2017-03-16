package com.ciberdix.th.controllers;

import com.ciberdix.th.models.VistaDivisionPoliticaEntity;
import com.ciberdix.th.repositories.VistaDivisionPoliticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/vista")
@CrossOrigin
public class VistaDivisionPoliticaController {

    @Autowired
    private VistaDivisionPoliticaRepository vistaDivisionPoliticaRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VistaDivisionPoliticaEntity> getLists() {
        return (List<VistaDivisionPoliticaEntity>) vistaDivisionPoliticaRepository.findAll();
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    VistaDivisionPoliticaEntity findList(@PathVariable Integer idLista) {
        return vistaDivisionPoliticaRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.PUT)
    VistaDivisionPoliticaEntity updateList(@RequestBody VistaDivisionPoliticaEntity centrosCostosEntity) {
        return vistaDivisionPoliticaRepository.save(centrosCostosEntity);
    }
}
