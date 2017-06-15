package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasDecisionesProcesoSeleccion;
import com.ciberdix.th.repositories.ListasDecisionesProcesoSeleccionRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 15/06/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/ListasDecisionesProcesoSeleccion")
@CrossOrigin
public class ListasDecisionesProcesoSeleccionRefactorController {
    @Autowired
    private ListasDecisionesProcesoSeleccionRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasDecisionesProcesoSeleccion> findAll() {
        return (List<ListasDecisionesProcesoSeleccion>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasDecisionesProcesoSeleccion> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasDecisionesProcesoSeleccion findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasDecisionesProcesoSeleccion> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasDecisionesProcesoSeleccion> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasDecisionesProcesoSeleccion findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasDecisionesProcesoSeleccion create(@RequestBody ListasDecisionesProcesoSeleccion obj) {
        return repository.save(new ListasDecisionesProcesoSeleccion(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasDecisionesProcesoSeleccion update(@RequestBody ListasDecisionesProcesoSeleccion obj) {
        return repository.save(
                new ListasDecisionesProcesoSeleccion(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
