package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEstadosProyeccionesTerceros;
import com.ciberdix.th.repositories.ListasEstadosProyeccionesTercerosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/ListasEstadosProyeccionesTerceros")
@CrossOrigin
public class ListasEstadosProyeccionesTercerosRefactorController {

    @Autowired
    private ListasEstadosProyeccionesTercerosRefactorRepository repository;
    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosProyeccionesTerceros> findAll() {
        return (List<ListasEstadosProyeccionesTerceros>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosProyeccionesTerceros> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEstadosProyeccionesTerceros findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEstadosProyeccionesTerceros> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEstadosProyeccionesTerceros> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosProyeccionesTerceros findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosProyeccionesTerceros create(@RequestBody ListasEstadosProyeccionesTerceros obj) {
        return repository.save(new ListasEstadosProyeccionesTerceros(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstadosProyeccionesTerceros update(@RequestBody ListasEstadosProyeccionesTerceros obj) {
        return repository.save(
                new ListasEstadosProyeccionesTerceros(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
    
}
