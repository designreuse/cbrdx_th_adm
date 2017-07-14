package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasEstadosExamenesMedicos;
import com.ciberdix.th.repositories.ListasEstadosExamenesMedicosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 11/07/2017.
 */
@RestController
@Transactional
@RequestMapping("/api/ListasEstadosExamenesMedicos")
@CrossOrigin
public class ListasEstadosExamenesMedicosRefactorController {
    @Autowired
    private ListasEstadosExamenesMedicosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosExamenesMedicos> findAll() {
        return (List<ListasEstadosExamenesMedicos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosExamenesMedicos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasEstadosExamenesMedicos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasEstadosExamenesMedicos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasEstadosExamenesMedicos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasEstadosExamenesMedicos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosExamenesMedicos create(@RequestBody ListasEstadosExamenesMedicos obj) {
        return repository.save(new ListasEstadosExamenesMedicos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstadosExamenesMedicos update(@RequestBody ListasEstadosExamenesMedicos obj) {
        return repository.save(
                new ListasEstadosExamenesMedicos(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
