package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasIntensidades;
import com.ciberdix.th.repositories.refactor.ListasIntensidadesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listasIntensidades")
@CrossOrigin
public class ListasIntensidadesRefactorController {

    @Autowired
    private ListasIntensidadesRefactorRepository listasIntensidadesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasIntensidades> findAll() {
        return (List<ListasIntensidades>) listasIntensidadesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasIntensidades> findEnabled() {
        return (List<ListasIntensidades>) listasIntensidadesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idListaInstitucion}")
    ListasIntensidades findOne(@PathVariable Integer idListaInstitucion) {
        return listasIntensidadesRefactorRepository.findOne(idListaInstitucion);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasIntensidades create(@RequestBody ListasIntensidades listasTiposReferencias) {
        return listasIntensidadesRefactorRepository.save(new ListasIntensidades(listasTiposReferencias.getCodigoListaIntensidad(), listasTiposReferencias.getNombreListaIntensidad(), listasTiposReferencias.getOrdenListaIntensidad(), listasTiposReferencias.getIndicadorHabilitado(), listasTiposReferencias.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasIntensidades update(@RequestBody ListasIntensidades divisionPolitica) {
        return listasIntensidadesRefactorRepository.save(divisionPolitica);
    }
}
