package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEstadosNovedades;
import com.ciberdix.th.repositories.ListasEstadosNovedadesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
@RestController
@Transactional
@RequestMapping("/api/ListasEstadosNovedades")
@CrossOrigin
public class ListasEstadosNovedadesRefactorController {
    @Autowired
    private ListasEstadosNovedadesRefactorRepository repository;
    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosNovedades> findAll() {
        return (List<ListasEstadosNovedades>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosNovedades> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEstadosNovedades findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEstadosNovedades> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEstadosNovedades> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosNovedades findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosNovedades create(@RequestBody ListasEstadosNovedades obj) {
        return repository.save(new ListasEstadosNovedades(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstadosNovedades update(@RequestBody ListasEstadosNovedades obj) {
        return repository.save(
                new ListasEstadosNovedades(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
