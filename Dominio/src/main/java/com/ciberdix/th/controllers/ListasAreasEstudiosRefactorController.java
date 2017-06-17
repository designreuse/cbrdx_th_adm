package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasAreasEstudios;
import com.ciberdix.th.repositories.ListasAreasEstudiosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/ListasAreasEstudios")
@CrossOrigin
public class ListasAreasEstudiosRefactorController {

    @Autowired
    private ListasAreasEstudiosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasAreasEstudios> findAll() {
        return (List<ListasAreasEstudios>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasAreasEstudios> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasAreasEstudios findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasAreasEstudios> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasAreasEstudios> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasAreasEstudios findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasAreasEstudios create(@RequestBody ListasAreasEstudios obj) {
        return repository.save(new ListasAreasEstudios(obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasAreasEstudios update(@RequestBody ListasAreasEstudios obj) {
        return repository.save(
                new ListasAreasEstudios(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                        obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
