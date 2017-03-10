package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosLocalizacionesEntity;
import com.ciberdix.th.repositories.TercerosLocalizacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/employeesLocations")
public class TercerosLocalizacionesController {

    @Autowired
    private TercerosLocalizacionesRepository tercerosLocalizacionesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosLocalizacionesEntity> getLists() {
        return (List<TercerosLocalizacionesEntity>) tercerosLocalizacionesRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    TercerosLocalizacionesEntity verConstante(@PathVariable Integer IdParametro) {
        return tercerosLocalizacionesRepository.findOne(IdParametro);
    }

    @RequestMapping(method = RequestMethod.GET, value = "employees/{IdParametro}")
    List<TercerosLocalizacionesEntity> verConstante1(@PathVariable Integer IdParametro) {
        return  tercerosLocalizacionesRepository.findByIdTercero(IdParametro);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosLocalizacionesEntity createList(@RequestBody TercerosLocalizacionesEntity c) {
        return tercerosLocalizacionesRepository.save(new TercerosLocalizacionesEntity());
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosLocalizacionesEntity updateList(@RequestBody TercerosLocalizacionesEntity centrosCostosEntity) {
        return tercerosLocalizacionesRepository.save(centrosCostosEntity);
    }
}
