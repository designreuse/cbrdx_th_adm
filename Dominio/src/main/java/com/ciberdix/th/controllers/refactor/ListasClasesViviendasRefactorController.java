package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasClasesViviendas;
import com.ciberdix.th.repositories.refactor.ListasClasesViviendasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@RestController
@Transactional
@RequestMapping("/api/listasClasesViviendas")
@CrossOrigin
public class ListasClasesViviendasRefactorController {
    @Autowired
    private ListasClasesViviendasRefactorRepository listasClasesViviendasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasClasesViviendas> findAll() {
        return (List<ListasClasesViviendas>) listasClasesViviendasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasClasesViviendas findOne(@PathVariable Integer id) {
        return listasClasesViviendasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasClasesViviendas create(@RequestBody ListasClasesViviendas obj) {
        return listasClasesViviendasRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasClasesViviendas obj) {
        listasClasesViviendasRefactorRepository.save(obj);
    }
}
