package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.ListasClasificaciones;
import com.ciberdix.th.repositories.ListasClasificacionesRefactorRepository;
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
@RequestMapping("/api/ListasClasificaciones")
public class ListasClasificacionesRefactorController {
    @Autowired
    private ListasClasificacionesRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasClasificaciones> findAll() {
        return (List<ListasClasificaciones>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasClasificaciones> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasClasificaciones findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasClasificaciones> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasClasificaciones> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasClasificaciones findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasClasificaciones create(@RequestBody ListasClasificaciones obj) {
        return repository.save(new ListasClasificaciones(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasClasificaciones update(@RequestBody ListasClasificaciones obj) {
        return repository.save(obj);
    }
}
