package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.ListasAtributosCargos;
import com.ciberdix.th.repositories.ListasAtributosCargosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ListasAtributosCargos")
public class ListasAtributosCargosRefactorController {

    @Autowired
    private ListasAtributosCargosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasAtributosCargos> findAll() {
        return (List<ListasAtributosCargos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasAtributosCargos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasAtributosCargos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasAtributosCargos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasAtributosCargos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasAtributosCargos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasAtributosCargos create(@RequestBody ListasAtributosCargos obj) {
        return repository.save(new ListasAtributosCargos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasAtributosCargos update(@RequestBody ListasAtributosCargos obj) {
        return repository.save(obj);
    }
}
