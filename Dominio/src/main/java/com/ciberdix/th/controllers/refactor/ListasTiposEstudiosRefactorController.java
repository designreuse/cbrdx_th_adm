package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposEstudios;
import com.ciberdix.th.repositories.refactor.ListasTiposEstudiosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listasTiposEstudios")
@CrossOrigin
public class ListasTiposEstudiosRefactorController {

    @Autowired
    private ListasTiposEstudiosRefactorRepository listasTiposEstudiosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposEstudios> findAll() {
        return (List<ListasTiposEstudios>) listasTiposEstudiosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasTiposEstudios> findEnabled() {
        return (List<ListasTiposEstudios>) listasTiposEstudiosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idListaInstitucion}")
    ListasTiposEstudios findOne(@PathVariable Integer idListaInstitucion) {
        return listasTiposEstudiosRefactorRepository.findOne(idListaInstitucion);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposEstudios create(@RequestBody ListasTiposEstudios listasTiposReferencias) {
        return listasTiposEstudiosRefactorRepository.save(new ListasTiposEstudios(listasTiposReferencias.getCodigoListaTipoEstudio(), listasTiposReferencias.getNombreListaTipoEstudio(), listasTiposReferencias.getOrdenListaTipoEstudio(), listasTiposReferencias.getIndicadorHabilitado(), listasTiposReferencias.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposEstudios update(@RequestBody ListasTiposEstudios divisionPolitica) {
        return listasTiposEstudiosRefactorRepository.save(divisionPolitica);
    }
}
