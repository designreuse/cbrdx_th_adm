package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposContratos;
import com.ciberdix.th.repositories.refactor.ListasTiposContratosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/listasTiposContratos")
public class ListasTiposContratosRefactorController {
    @Autowired
    private ListasTiposContratosRefactorRepository listasTiposContratosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposContratos> findAll() {
        return (List<ListasTiposContratos>) listasTiposContratosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposContratos> findEnabled() {
        return (List<ListasTiposContratos>) listasTiposContratosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposContratos findOne(@PathVariable Integer id) {
        return listasTiposContratosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposContratos create(@RequestBody ListasTiposContratos obj) {
        return listasTiposContratosRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposContratos obj) {
        listasTiposContratosRefactorRepository.save(obj);
    }
}
