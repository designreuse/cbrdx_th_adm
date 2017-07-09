package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasResultadosLllamadas;
import com.ciberdix.th.repositories.ListasResultadosLllamadasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
@RestController
@Transactional
@RequestMapping("/api/ListasResultadosLllamadas")
@CrossOrigin
public class ListasResultadosLllamadasRefactorController {
    private final ListasResultadosLllamadasRefactorRepository repository;

    @Autowired
    public ListasResultadosLllamadasRefactorController(ListasResultadosLllamadasRefactorRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<ListasResultadosLllamadas> findAll() {
        return (List<ListasResultadosLllamadas>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasResultadosLllamadas> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasResultadosLllamadas findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasResultadosLllamadas> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasResultadosLllamadas> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasResultadosLllamadas findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasResultadosLllamadas create(@RequestBody ListasResultadosLllamadas obj) {
        return repository.save(new ListasResultadosLllamadas(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasResultadosLllamadas update(@RequestBody ListasResultadosLllamadas obj) {
        return repository.save(
                new ListasResultadosLllamadas(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
