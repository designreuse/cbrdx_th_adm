package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposElementos;
import com.ciberdix.th.repositories.refactor.ListasTiposElementosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/listasTiposElementos")
public class ListasTiposElementosRefactorController {
    @Autowired
    private ListasTiposElementosRefactorRepository listasTiposElementosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposElementos> findAll() {
        return (List<ListasTiposElementos>) listasTiposElementosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposElementos> findEnabled() {
        return (List<ListasTiposElementos>) listasTiposElementosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposElementos findOne(@PathVariable Integer id) {
        return listasTiposElementosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposElementos create(@RequestBody ListasTiposElementos obj) {
        return listasTiposElementosRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposElementos obj) {
        listasTiposElementosRefactorRepository.save(obj);
    }
}
