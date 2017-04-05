package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasEstratos;
import com.ciberdix.th.repositories.refactor.ListasEstratosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@RestController
@Transactional
@RequestMapping("/api/listasEstratos")
@CrossOrigin
public class ListasEstratosRefactorController {
    @Autowired
    private ListasEstratosRefactorRepository listasEstratosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstratos> findAll() {
        return (List<ListasEstratos>) listasEstratosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstratos findOne(@PathVariable Integer id) {
        return listasEstratosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstratos create(@RequestBody ListasEstratos obj) {
        return listasEstratosRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasEstratos obj) {
        listasEstratosRefactorRepository.save(obj);
    }
}
