package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosEntity;
import com.ciberdix.th.repositories.TercerosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/employees")

public class TercerosController {

    @Autowired
    private TercerosRepository tercerosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosEntity> getLists() {
        return (List<TercerosEntity>) tercerosRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    TercerosEntity verConstante(@PathVariable Integer IdParametro) {
        return tercerosRepository.findOne(IdParametro);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosEntity createList(@RequestBody TercerosEntity c) {
        return tercerosRepository.save(new TercerosEntity());
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosEntity updateList(@RequestBody TercerosEntity centrosCostosEntity) {
        return tercerosRepository.save(centrosCostosEntity);
    }
}
