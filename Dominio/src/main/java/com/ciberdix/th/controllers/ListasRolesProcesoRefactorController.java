package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasRolesProceso;
import com.ciberdix.th.repositories.ListasRolesProcesoRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/ListasRolesProceso")
public class ListasRolesProcesoRefactorController {
    @Autowired
    private ListasRolesProcesoRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasRolesProceso> findAll() {
        return (List<ListasRolesProceso>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasRolesProceso> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasRolesProceso findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasRolesProceso> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasRolesProceso> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasRolesProceso findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasRolesProceso create(@RequestBody ListasRolesProceso obj) {
        return repository.save(new ListasRolesProceso(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasRolesProceso update(@RequestBody ListasRolesProceso obj) {
        return repository.save(
                new ListasRolesProceso(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
