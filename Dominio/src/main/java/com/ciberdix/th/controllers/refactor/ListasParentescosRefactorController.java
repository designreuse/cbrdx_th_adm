package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasParentescos;
import com.ciberdix.th.repositories.refactor.ListasParentescosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listasParentescos")
@CrossOrigin
public class ListasParentescosRefactorController {

    @Autowired
    private ListasParentescosRefactorRepository listasParentescosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasParentescos> findAll() {
        return (List<ListasParentescos>) listasParentescosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasParentescos> findEnabled() {
        return (List<ListasParentescos>) listasParentescosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idListaInstitucion}")
    ListasParentescos findOne(@PathVariable Integer idListaInstitucion) {
        return listasParentescosRefactorRepository.findOne(idListaInstitucion);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasParentescos create(@RequestBody ListasParentescos listasTiposReferencias) {
        return listasParentescosRefactorRepository.save(new ListasParentescos(listasTiposReferencias.getCodigoListaParentesco(), listasTiposReferencias.getNombreListaParentesco(), listasTiposReferencias.getOrdenListaParentesco(), listasTiposReferencias.getIndicadorHabilitado(), listasTiposReferencias.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasParentescos update(@RequestBody ListasParentescos divisionPolitica) {
        return listasParentescosRefactorRepository.save(divisionPolitica);
    }
}
