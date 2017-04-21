package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasClasificacionesSedes;
import com.ciberdix.th.repositories.refactor.ListasClasificacionesSedesRefactorRepository;
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
@RequestMapping("/api/ListasClasificacionesSedes")
public class ListasClasificacionesSedesRefactorController {
    @Autowired
    private ListasClasificacionesSedesRefactorRepository listasClasificacionesSedesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasClasificacionesSedes> findAll() {
        return listasClasificacionesSedesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasClasificacionesSedes findOne(@PathVariable Integer id) {
        return listasClasificacionesSedesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasClasificacionesSedes create(@RequestBody ListasClasificacionesSedes obj) {
        return listasClasificacionesSedesRefactorRepository.save(new ListasClasificacionesSedes(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasClasificacionesSedes obj) {
        listasClasificacionesSedesRefactorRepository.save(obj);
    }
}
