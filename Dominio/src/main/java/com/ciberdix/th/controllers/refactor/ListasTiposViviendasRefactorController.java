package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposTerceros;
import com.ciberdix.th.models.refactor.ListasTiposViviendas;
import com.ciberdix.th.repositories.refactor.ListasTiposViviendasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@RestController
@Transactional
@RequestMapping("/api/listasTiposViviendas")
@CrossOrigin
public class ListasTiposViviendasRefactorController {
    @Autowired
    private ListasTiposViviendasRefactorRepository listasTiposViviendasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposViviendas> findAll() {
        return (List<ListasTiposViviendas>) listasTiposViviendasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposViviendas findOne(@PathVariable Integer id) {
        return listasTiposViviendasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposViviendas create(@RequestBody ListasTiposViviendas obj) {
        return listasTiposViviendasRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposViviendas obj) {
        listasTiposViviendasRefactorRepository.save(obj);
    }
}
