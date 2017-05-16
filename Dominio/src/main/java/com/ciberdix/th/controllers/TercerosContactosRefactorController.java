package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosContactos;
import com.ciberdix.th.models.VTercerosContactos;
import com.ciberdix.th.repositories.TercerosContactosRefactorRepository;
import com.ciberdix.th.repositories.VTercerosContactosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/tercerosContactos")
public class TercerosContactosRefactorController {
    @Autowired
    private TercerosContactosRefactorRepository tercerosContactosRefactorRepository;

    @Autowired
    private VTercerosContactosRefactorRepository vTercerosContactosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosContactos> findAll() {
        return (List<VTercerosContactos>) vTercerosContactosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TercerosContactos findOne(@PathVariable Integer id) {
        return tercerosContactosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path="/buscarTercero/{id}")
    List<VTercerosContactos> findPorTercero(@PathVariable Long id) {
        return (List<VTercerosContactos>) vTercerosContactosRefactorRepository.findByIndicadorHabilitadoIsTrueAndIdTercero(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosContactos create(@RequestBody TercerosContactos obj) {
        return tercerosContactosRefactorRepository.save(
                new TercerosContactos(obj.getIdTercero(), obj.getContacto(), obj.getTelefono(),
                        obj.getCelular(), obj.getIdListaParentesco(), obj.getIndicadorHabilitado(),
                        obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosContactos obj) {
        tercerosContactosRefactorRepository.save(obj);
    }
}
