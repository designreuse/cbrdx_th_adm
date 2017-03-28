package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasEstadosEstudios;
import com.ciberdix.th.repositories.refactor.ListasEstadosEstudiosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listasEstadosEstudios")
@CrossOrigin
public class ListasEstadosEstudiosRefactorController {

    @Autowired
    private ListasEstadosEstudiosRefactorRepository listasEstadosEstudiosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasEstadosEstudios> findAll() {
        return (List<ListasEstadosEstudios>) listasEstadosEstudiosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasEstadosEstudios> findEnabled() {
        return (List<ListasEstadosEstudios>) listasEstadosEstudiosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idListaInstitucion}")
    ListasEstadosEstudios findOne(@PathVariable Integer idListaInstitucion) {
        return listasEstadosEstudiosRefactorRepository.findOne(idListaInstitucion);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasEstadosEstudios create(@RequestBody ListasEstadosEstudios listasTiposReferencias) {
        return listasEstadosEstudiosRefactorRepository.save(new ListasEstadosEstudios(listasTiposReferencias.getIdListaEstadoEstudio(), listasTiposReferencias.getCodigoListaEstadoEstudio(), listasTiposReferencias.getNombreListaEstadoEstudio(), listasTiposReferencias.getOrdenListaEstadoEstudio(), listasTiposReferencias.getIndicadorHabilitado(), listasTiposReferencias.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasEstadosEstudios update(@RequestBody ListasEstadosEstudios divisionPolitica) {
        return listasEstadosEstudiosRefactorRepository.save(divisionPolitica);
    }
}
