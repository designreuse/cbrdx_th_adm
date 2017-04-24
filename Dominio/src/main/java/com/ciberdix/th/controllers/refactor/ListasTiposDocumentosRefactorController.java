package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposDocumentos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import com.ciberdix.th.repositories.refactor.ListasTiposDocumentosRefactorRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ListasTiposDocumentos")
public class ListasTiposDocumentosRefactorController {

    @Autowired
    private ListasTiposDocumentosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposDocumentos> findAll() {
        return (List<ListasTiposDocumentos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposDocumentos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposDocumentos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposDocumentos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposDocumentos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposDocumentos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposDocumentos create(@RequestBody ListasTiposDocumentos obj) {
        return repository.save(new ListasTiposDocumentos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposDocumentos update(@RequestBody ListasTiposDocumentos obj) {
        return repository.save(obj);
    }
}
