package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposFaltas;
import com.ciberdix.th.repositories.refactor.ListasTiposFaltasRefactorRepository;
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
@RequestMapping("/api/listasTiposFaltas")
public class ListasTiposFaltasRefactorController {
    @Autowired
    private ListasTiposFaltasRefactorRepository listasTiposFaltasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposFaltas> findAll() {
        return (List<ListasTiposFaltas>) listasTiposFaltasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposFaltas> findAllEnabled() {
        return (List<ListasTiposFaltas>) listasTiposFaltasRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposFaltas findOne(@PathVariable Integer id) {
        return listasTiposFaltasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposFaltas create(@RequestBody ListasTiposFaltas obj) {
        return listasTiposFaltasRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposFaltas obj) {
        listasTiposFaltasRefactorRepository.save(obj);
    }
}
