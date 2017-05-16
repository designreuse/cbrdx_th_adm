package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasTiposNomenclaturasComplementarias;
import com.ciberdix.th.repositories.ListasTiposNomenclaturasComplementariasRefactorRepository;
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
@RequestMapping("/api/ListasTiposNomenclaturasComplementarias")
public class ListasTiposNomenclaturasComplementariasRefactorController {

    @Autowired
    private ListasTiposNomenclaturasComplementariasRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposNomenclaturasComplementarias> findAll() {
        return (List<ListasTiposNomenclaturasComplementarias>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposNomenclaturasComplementarias> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposNomenclaturasComplementarias findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposNomenclaturasComplementarias> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposNomenclaturasComplementarias> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposNomenclaturasComplementarias findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposNomenclaturasComplementarias create(@RequestBody ListasTiposNomenclaturasComplementarias obj) {
        return repository.save(new ListasTiposNomenclaturasComplementarias(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposNomenclaturasComplementarias update(@RequestBody ListasTiposNomenclaturasComplementarias obj) {
        return repository.save(obj);
    }
}
