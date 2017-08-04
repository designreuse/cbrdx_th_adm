package com.ciberdix.th.controllers;

import com.ciberdix.th.models.VValoracionesRiesgos;
import com.ciberdix.th.models.ValoracionesRiesgos;
import com.ciberdix.th.repositories.VValoracionesRiesgosRefactorRepository;
import com.ciberdix.th.repositories.ValoracionesRiesgosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 04/08/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/valoracionesRiesgos")
public class ValoracionesRiesgosRefactorController {
    @Autowired
    ValoracionesRiesgosRefactorRepository repository;

    @Autowired
    VValoracionesRiesgosRefactorRepository vValoracionesRiesgosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VValoracionesRiesgos> findAll() {
        return (List<VValoracionesRiesgos>) vValoracionesRiesgosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VValoracionesRiesgos findOne(@PathVariable Integer id) {
        return vValoracionesRiesgosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ValoracionesRiesgos create(@RequestBody ValoracionesRiesgos obj) {
        List<VValoracionesRiesgos> matrices = findAll();
        Integer version = 0;
        String nombreVersion = "Versión ";

        if (matrices.size() > 0){
            for (VValoracionesRiesgos v : matrices) {
                version = v.getNumeroVersion() + 1;
            }
        } else {
            version = 1;
        }

        nombreVersion += version + ".0";

        return repository.save(new ValoracionesRiesgos(nombreVersion, version, obj.getIdUsuario(),
                obj.getIdAdjunto(),obj.getIndicadorHabilitado(),obj.getAuditoriaUsuario()));
    }
}
