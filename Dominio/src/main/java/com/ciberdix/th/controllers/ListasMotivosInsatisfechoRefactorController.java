package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasMotivosInsatisfecho;
import com.ciberdix.th.repositories.ListasMotivosInsatisfechoRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@Transactional
@RequestMapping("/api/ListasMotivosInsatisfecho")
public class ListasMotivosInsatisfechoRefactorController {
    @Autowired
    private ListasMotivosInsatisfechoRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasMotivosInsatisfecho> findAll() {
        return (List<ListasMotivosInsatisfecho>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasMotivosInsatisfecho> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasMotivosInsatisfecho findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasMotivosInsatisfecho> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasMotivosInsatisfecho> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasMotivosInsatisfecho findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasMotivosInsatisfecho create(@RequestBody ListasMotivosInsatisfecho obj) {
        return repository.save(new ListasMotivosInsatisfecho(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasMotivosInsatisfecho update(@RequestBody ListasMotivosInsatisfecho obj) {
        return repository.save(
                new ListasMotivosInsatisfecho(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
}
