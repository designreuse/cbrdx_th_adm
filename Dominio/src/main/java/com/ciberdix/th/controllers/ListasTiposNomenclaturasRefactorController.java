package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasTiposNomenclaturas;
import com.ciberdix.th.repositories.ListasTiposNomenclaturasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ListasTiposNomenclaturas")
public class ListasTiposNomenclaturasRefactorController {

    @Autowired
    private ListasTiposNomenclaturasRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposNomenclaturas> findAll() {
        return (List<ListasTiposNomenclaturas>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposNomenclaturas> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposNomenclaturas findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposNomenclaturas> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposNomenclaturas> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposNomenclaturas findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposNomenclaturas create(@RequestBody ListasTiposNomenclaturas obj) {
        return repository.save(new ListasTiposNomenclaturas(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposNomenclaturas update(@RequestBody ListasTiposNomenclaturas obj) {
        return repository.save(obj);
    }
}
