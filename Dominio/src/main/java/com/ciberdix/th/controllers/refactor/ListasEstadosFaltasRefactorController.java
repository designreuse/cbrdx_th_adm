package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasEstadosFaltas;
import com.ciberdix.th.repositories.refactor.ListasEstadosFaltasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 6/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/listasEstadosFaltas")
public class ListasEstadosFaltasRefactorController {
    @Autowired
    private ListasEstadosFaltasRefactorRepository listasEstadosFaltasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosFaltas> findAll() {
        return (List<ListasEstadosFaltas>) listasEstadosFaltasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosFaltas> findAllEnabled() {
        return (List<ListasEstadosFaltas>) listasEstadosFaltasRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosFaltas findOne(@PathVariable Integer id) {
        return listasEstadosFaltasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosFaltas create(@RequestBody ListasEstadosFaltas obj) {
        return listasEstadosFaltasRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasEstadosFaltas obj) {
        listasEstadosFaltasRefactorRepository.save(obj);
    }
}
