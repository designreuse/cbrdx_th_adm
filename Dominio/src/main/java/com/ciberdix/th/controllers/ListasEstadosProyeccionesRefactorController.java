package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEstadosProyecciones;
import com.ciberdix.th.repositories.ListasEstadosProyeccionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@RestController
@Transactional
@RequestMapping("/api/ListasEstadosProyecciones")
@CrossOrigin
public class ListasEstadosProyeccionesRefactorController {
    @Autowired
    private ListasEstadosProyeccionesRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosProyecciones> findAll() {
        return (List<ListasEstadosProyecciones>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosProyecciones> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEstadosProyecciones findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEstadosProyecciones> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEstadosProyecciones> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosProyecciones findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosProyecciones create(@RequestBody ListasEstadosProyecciones obj) {
        return repository.save(new ListasEstadosProyecciones(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstadosProyecciones update(@RequestBody ListasEstadosProyecciones obj) {
        return repository.save(
                new ListasEstadosProyecciones(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
