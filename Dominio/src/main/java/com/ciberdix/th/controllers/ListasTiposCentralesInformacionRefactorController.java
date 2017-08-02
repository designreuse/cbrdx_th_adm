package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasTiposCentralesInformacion;
import com.ciberdix.th.repositories.ListasTiposCentralesInformacionRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/ListasTiposCentralesInformacion")
@CrossOrigin
public class ListasTiposCentralesInformacionRefactorController {

    @Autowired
    private ListasTiposCentralesInformacionRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposCentralesInformacion> findAll() {
        return (List<ListasTiposCentralesInformacion>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposCentralesInformacion> findEnabled() {
        return repository.findByIndicadorHabilitadoTrueOrderByOrden();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasTiposCentralesInformacion findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasTiposCentralesInformacion> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasTiposCentralesInformacion> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasTiposCentralesInformacion findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposCentralesInformacion create(@RequestBody ListasTiposCentralesInformacion obj) {
        return repository.save(new ListasTiposCentralesInformacion(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposCentralesInformacion update(@RequestBody ListasTiposCentralesInformacion obj) {
        return repository.save(
                new ListasTiposCentralesInformacion(obj.getIdLista(),obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario())
        );
    }
    
}
