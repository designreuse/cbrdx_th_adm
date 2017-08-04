package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasConsecuenciasRiesgos;
import com.ciberdix.th.repositories.ListasConsecuenciasRiesgosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/ListasConsecuenciasRiesgos")
@CrossOrigin
public class ListasConsecuenciasRiesgosRefactorController {

    @Autowired
    private  ListasConsecuenciasRiesgosRefactorRepository ListasConsecuenciasRiesgosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasConsecuenciasRiesgos> findAll() {
        return (List<ListasConsecuenciasRiesgos>) ListasConsecuenciasRiesgosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasConsecuenciasRiesgos findAll(@PathVariable Integer id) {
        return ListasConsecuenciasRiesgosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasConsecuenciasRiesgos> findByEnabled() {
        return (List<ListasConsecuenciasRiesgos>) ListasConsecuenciasRiesgosRefactorRepository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasConsecuenciasRiesgos create(@RequestBody ListasConsecuenciasRiesgos obj) {
        return ListasConsecuenciasRiesgosRefactorRepository.save(new ListasConsecuenciasRiesgos(obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario(), obj.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasConsecuenciasRiesgos update(@RequestBody ListasConsecuenciasRiesgos obj) {
        return ListasConsecuenciasRiesgosRefactorRepository.save(new ListasConsecuenciasRiesgos(obj.getIdLista(), obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario(), obj.getAuditoriaFecha()));
    }
    
}
