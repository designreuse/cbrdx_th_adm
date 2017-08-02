package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasTiposExamenesMedicos;
import com.ciberdix.th.repositories.ListasTiposExamenesMedicosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/ListasTiposExamenesMedicos")
@CrossOrigin
public class ListasTiposExamenesMedicosRefactorController {
    @Autowired
    private ListasTiposExamenesMedicosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposExamenesMedicos> findAll() {
        return (List<ListasTiposExamenesMedicos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposExamenesMedicos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposExamenesMedicos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposExamenesMedicos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposExamenesMedicos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposExamenesMedicos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposExamenesMedicos create(@RequestBody ListasTiposExamenesMedicos obj) {
        return repository.save(new ListasTiposExamenesMedicos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposExamenesMedicos update(@RequestBody ListasTiposExamenesMedicos obj) {
        return repository.save(
                new ListasTiposExamenesMedicos(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
