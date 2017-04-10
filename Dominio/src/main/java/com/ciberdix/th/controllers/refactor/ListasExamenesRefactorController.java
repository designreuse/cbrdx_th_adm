package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasExamenes;
import com.ciberdix.th.repositories.refactor.ListasExamenesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/listasExamenes")
public class ListasExamenesRefactorController {
    @Autowired
    private ListasExamenesRefactorRepository listasExamenesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasExamenes> findAll() {
        return (List<ListasExamenes>) listasExamenesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasExamenes> findEnabled() {
        return (List<ListasExamenes>) listasExamenesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasExamenes findOne(@PathVariable Integer id) {
        return listasExamenesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasExamenes create(@RequestBody ListasExamenes obj) {
        return listasExamenesRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasExamenes obj) {
        listasExamenesRefactorRepository.save(obj);
    }
}
