package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposEstructuras;
import com.ciberdix.th.repositories.refactor.ListasTiposEstructurasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/listasTiposEstructuras")
public class ListasTiposEstructurasRefactorController {
    @Autowired
    private ListasTiposEstructurasRefactorRepository listasTiposEstructurasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposEstructuras> findAll() {
        return (List<ListasTiposEstructuras>) listasTiposEstructurasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposEstructuras> findEnabled() {
        return (List<ListasTiposEstructuras>) listasTiposEstructurasRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposEstructuras findOne(@PathVariable Integer id) {
        return listasTiposEstructurasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposEstructuras create(@RequestBody ListasTiposEstructuras obj) {
        return listasTiposEstructurasRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposEstructuras obj) {
        listasTiposEstructurasRefactorRepository.save(obj);
    }
}
