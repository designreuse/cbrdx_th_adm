package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasNivelesEstudios;
import com.ciberdix.th.repositories.refactor.ListasNivelesEstudiosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/ListasNivelesEstudios")
public class ListasNivelesEstudiosRefactorController {

    @Autowired
    private ListasNivelesEstudiosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasNivelesEstudios> findAll() {
        return (List<ListasNivelesEstudios>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasNivelesEstudios> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasNivelesEstudios findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasNivelesEstudios> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasNivelesEstudios> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasNivelesEstudios findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasNivelesEstudios create(@RequestBody ListasNivelesEstudios obj) {
        return repository.save(new ListasNivelesEstudios(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasNivelesEstudios update(@RequestBody ListasNivelesEstudios obj) {
        return repository.save(obj);
    }
}
