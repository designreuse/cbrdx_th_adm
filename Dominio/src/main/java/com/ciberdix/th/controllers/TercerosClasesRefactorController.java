package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosClases;
import com.ciberdix.th.repositories.TercerosClasesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by Danny on 26/04/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosClases")
public class TercerosClasesRefactorController {

    @Autowired
    private TercerosClasesRefactorRepository tercerosClasesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosClases> findAll() {
        return (List<TercerosClases>) tercerosClasesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{IdTercerosClases}")
    TercerosClases findOneById(@PathVariable Integer IdTercerosClases) {
        return tercerosClasesRefactorRepository.findOne(IdTercerosClases);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/idTercero/{IdTercero}")
    List<TercerosClases> findByIdTerceros(@PathVariable Long IdTercero) {
        return (List<TercerosClases>) tercerosClasesRefactorRepository.findByIdTercero(IdTercero);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosClases create(@RequestBody TercerosClases tercerosClases) {
        return tercerosClasesRefactorRepository.save(new TercerosClases(tercerosClases.getIdTercero(),
                tercerosClases.getIdClaseTercero(), tercerosClases.getIndicadorHabilitado(),
                tercerosClases.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<TercerosClases> findEnabled() {
        return (List<TercerosClases>) tercerosClasesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosClases update(@RequestBody TercerosClases tercerosClases) {
        return tercerosClasesRefactorRepository.save(tercerosClases);
    }

}
