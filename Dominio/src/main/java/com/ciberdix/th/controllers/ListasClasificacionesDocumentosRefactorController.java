package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasClasificacionesDocumentos;
import com.ciberdix.th.repositories.ListasClasificacionesDocumentosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
@RestController
@Transactional
@RequestMapping("/api/ListasClasificacionesDocumentos")
@CrossOrigin
public class ListasClasificacionesDocumentosRefactorController {
    @Autowired
    private ListasClasificacionesDocumentosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasClasificacionesDocumentos> findAll() {
        return (List<ListasClasificacionesDocumentos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasClasificacionesDocumentos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasClasificacionesDocumentos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasClasificacionesDocumentos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasClasificacionesDocumentos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasClasificacionesDocumentos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasClasificacionesDocumentos create(@RequestBody ListasClasificacionesDocumentos obj) {
        return repository.save(new ListasClasificacionesDocumentos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasClasificacionesDocumentos update(@RequestBody ListasClasificacionesDocumentos obj) {
        return repository.save(
                new ListasClasificacionesDocumentos(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
