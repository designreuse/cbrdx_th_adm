package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.ListasTiposConstruccionViviendas;
import com.ciberdix.th.repositories.ListasTiposConstruccionViviendasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@RestController
@Transactional
@RequestMapping("/api/ListasTiposConstruccionViviendas")
@CrossOrigin
public class ListasTiposConstruccionViviendasRefactorController {
    @Autowired
    private ListasTiposConstruccionViviendasRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposConstruccionViviendas> findAll() {
        return (List<ListasTiposConstruccionViviendas>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposConstruccionViviendas> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposConstruccionViviendas findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposConstruccionViviendas> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposConstruccionViviendas> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposConstruccionViviendas findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposConstruccionViviendas create(@RequestBody ListasTiposConstruccionViviendas obj) {
        return repository.save(new ListasTiposConstruccionViviendas(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposConstruccionViviendas update(@RequestBody ListasTiposConstruccionViviendas obj) {
        return repository.save(obj);
    }
}
