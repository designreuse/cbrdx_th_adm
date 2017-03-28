package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasAreasEstudios;
import com.ciberdix.th.repositories.refactor.ListasAreasEstudiosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listasAreasEstudios")
@CrossOrigin
public class ListasAreasEstudiosRefactorController {

    @Autowired
    private ListasAreasEstudiosRefactorRepository listasAreasEstudiosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasAreasEstudios> findAll() {
        return (List<ListasAreasEstudios>) listasAreasEstudiosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasAreasEstudios> findEnabled() {
        return (List<ListasAreasEstudios>) listasAreasEstudiosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idListaInstitucion}")
    ListasAreasEstudios findOne(@PathVariable Integer idListaInstitucion) {
        return listasAreasEstudiosRefactorRepository.findOne(idListaInstitucion);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasAreasEstudios create(@RequestBody ListasAreasEstudios listasTiposReferencias) {
        return listasAreasEstudiosRefactorRepository.save(new ListasAreasEstudios(listasTiposReferencias.getIdListaAreaEstudio(), listasTiposReferencias.getCodigoListaAreaEstudio(), listasTiposReferencias.getNombreListaAreaEstudio(), listasTiposReferencias.getOrdenListaAreaEstudio(), listasTiposReferencias.getIndicadorHabilitado(), listasTiposReferencias.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasAreasEstudios update(@RequestBody ListasAreasEstudios divisionPolitica) {
        return listasAreasEstudiosRefactorRepository.save(divisionPolitica);
    }
}
