package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposReferencias;
import com.ciberdix.th.repositories.refactor.ListasTiposReferenciasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listasTiposReferencias")
@CrossOrigin
public class ListasTiposReferenciasRefactorController {

    @Autowired
    private ListasTiposReferenciasRefactorRepository listasTiposReferenciasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposReferencias> findAll() {
        return (List<ListasTiposReferencias>) listasTiposReferenciasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET,path = "/enabled/")
    List<ListasTiposReferencias> findEnabled() {
        return (List<ListasTiposReferencias>) listasTiposReferenciasRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idDivisionPolitica}")
    ListasTiposReferencias findOne(@PathVariable Integer idDivisionPolitica) {
        return listasTiposReferenciasRefactorRepository.findOne(idDivisionPolitica);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposReferencias create(@RequestBody ListasTiposReferencias listasTiposReferencias) {
        return listasTiposReferenciasRefactorRepository.save(new ListasTiposReferencias(listasTiposReferencias.getCodigoListaTipoReferencia(), listasTiposReferencias.getNombreListaTipoReferencia(), listasTiposReferencias.getOrdenListaTipoReferencia(), listasTiposReferencias.getIndicadorHabilitado(), listasTiposReferencias.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposReferencias update(@RequestBody ListasTiposReferencias divisionPolitica) {
        return listasTiposReferenciasRefactorRepository.save(divisionPolitica);
    }
}
