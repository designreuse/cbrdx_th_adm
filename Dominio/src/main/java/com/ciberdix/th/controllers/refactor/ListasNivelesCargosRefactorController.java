package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasNivelesCargos;
import com.ciberdix.th.repositories.refactor.ListasNivelesCargosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listasNivelesCargos")
@CrossOrigin
public class ListasNivelesCargosRefactorController {

    @Autowired
    private ListasNivelesCargosRefactorRepository listasNivelesCargosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasNivelesCargos> findAll() {
        return (List<ListasNivelesCargos>) listasNivelesCargosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasNivelesCargos> findEnabled() {
        return (List<ListasNivelesCargos>) listasNivelesCargosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idListaInstitucion}")
    ListasNivelesCargos findOne(@PathVariable Integer idListaInstitucion) {
        return listasNivelesCargosRefactorRepository.findOne(idListaInstitucion);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasNivelesCargos create(@RequestBody ListasNivelesCargos listasTiposReferencias) {
        return listasNivelesCargosRefactorRepository.save(new ListasNivelesCargos(listasTiposReferencias.getCodigo(), listasTiposReferencias.getNombre(), listasTiposReferencias.getOrden(), listasTiposReferencias.getIndicadorHabilitado(), listasTiposReferencias.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasNivelesCargos update(@RequestBody ListasNivelesCargos divisionPolitica) {
        return listasNivelesCargosRefactorRepository.save(divisionPolitica);
    }
}
