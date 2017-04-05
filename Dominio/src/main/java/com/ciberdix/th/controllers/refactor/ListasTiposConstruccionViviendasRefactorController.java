package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposConstruccionViviendas;
import com.ciberdix.th.repositories.refactor.ListasTiposConstruccionViviendasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@RestController
@Transactional
@RequestMapping("/api/listasTiposConstruccionViviendas")
@CrossOrigin
public class ListasTiposConstruccionViviendasRefactorController {
    @Autowired
    private ListasTiposConstruccionViviendasRefactorRepository listasTiposConstruccionViviendasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposConstruccionViviendas> findAll() {
        return (List<ListasTiposConstruccionViviendas>) listasTiposConstruccionViviendasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposConstruccionViviendas findOne(@PathVariable Integer id) {
        return listasTiposConstruccionViviendasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposConstruccionViviendas create(@RequestBody ListasTiposConstruccionViviendas obj) {
        return listasTiposConstruccionViviendasRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasTiposConstruccionViviendas obj) {
        listasTiposConstruccionViviendasRefactorRepository.save(obj);
    }
}
