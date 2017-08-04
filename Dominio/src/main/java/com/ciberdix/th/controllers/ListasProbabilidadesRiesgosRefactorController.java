package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasProbabilidadesRiesgos;
import com.ciberdix.th.repositories.ListasProbabilidadesRiesgosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/ListasProbabilidadesRiesgos")
@CrossOrigin
public class ListasProbabilidadesRiesgosRefactorController {

    @Autowired
    private  ListasProbabilidadesRiesgosRefactorRepository ListasProbabilidadesRiesgosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasProbabilidadesRiesgos> findAll() {
        return (List<ListasProbabilidadesRiesgos>) ListasProbabilidadesRiesgosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasProbabilidadesRiesgos findAll(@PathVariable Integer id) {
        return ListasProbabilidadesRiesgosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<ListasProbabilidadesRiesgos> findByEnabled() {
        return (List<ListasProbabilidadesRiesgos>) ListasProbabilidadesRiesgosRefactorRepository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasProbabilidadesRiesgos create(@RequestBody ListasProbabilidadesRiesgos obj) {
        return ListasProbabilidadesRiesgosRefactorRepository.save(new ListasProbabilidadesRiesgos(obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario(), obj.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasProbabilidadesRiesgos update(@RequestBody ListasProbabilidadesRiesgos obj) {
        return ListasProbabilidadesRiesgosRefactorRepository.save(new ListasProbabilidadesRiesgos(obj.getIdLista(), obj.getCodigo(), obj.getNombre(), obj.getOrden(),
                obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario(), obj.getAuditoriaFecha()));
    }
    
}
