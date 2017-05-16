package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.ListasTiposCargosRelaciones;
import com.ciberdix.th.repositories.ListasTiposCargosRelacionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/ListasTiposCargosRelaciones")
@CrossOrigin
public class ListasTiposCargosRelacionesRefactorController {

    @Autowired
    private ListasTiposCargosRelacionesRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposCargosRelaciones> findAll() {
        return (List<ListasTiposCargosRelaciones>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposCargosRelaciones> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposCargosRelaciones findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposCargosRelaciones> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposCargosRelaciones> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposCargosRelaciones findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposCargosRelaciones create(@RequestBody ListasTiposCargosRelaciones obj) {
        return repository.save(new ListasTiposCargosRelaciones(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposCargosRelaciones update(@RequestBody ListasTiposCargosRelaciones obj) {
        return repository.save(obj);
    }
}
