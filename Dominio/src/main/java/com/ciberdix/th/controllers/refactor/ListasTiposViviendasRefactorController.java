package com.ciberdix.th.controllers.refactor;

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
@RequestMapping("/api/ListasTiposViviendas")
@CrossOrigin
public class ListasTiposViviendasRefactorController {
    @Autowired
    private ListasTiposViviendasRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposViviendas> findAll() {
        return (List<ListasTiposViviendas>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposViviendas> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposViviendas findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposViviendas> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposViviendas> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposViviendas findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposViviendas create(@RequestBody ListasTiposViviendas obj) {
        return repository.save(new ListasTiposViviendas(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposViviendas update(@RequestBody ListasTiposViviendas obj) {
        return repository.save(obj);
    }
}
