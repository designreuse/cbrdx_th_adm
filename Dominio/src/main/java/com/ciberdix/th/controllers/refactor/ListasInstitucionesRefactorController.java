package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasInstituciones;
import com.ciberdix.th.repositories.refactor.ListasInstitucionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listasInstituciones")
@CrossOrigin
public class ListasInstitucionesRefactorController {

    @Autowired
    private ListasInstitucionesRefactorRepository listasInstitucionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasInstituciones> findAll() {
        return (List<ListasInstituciones>) listasInstitucionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasInstituciones> findEnabled() {
        return (List<ListasInstituciones>) listasInstitucionesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarInstitucion/{nombreInstitucion}/")
    List<ListasInstituciones> findInstitution(@PathVariable String nombreInstitucion) {
        return (List<ListasInstituciones>) listasInstitucionesRefactorRepository.findByIndicadorHabilitadoIsTrueAndNombreListaInstitucionContains(nombreInstitucion);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idListaInstitucion}")
    ListasInstituciones findOne(@PathVariable Integer idListaInstitucion) {
        return listasInstitucionesRefactorRepository.findOne(idListaInstitucion);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasInstituciones create(@RequestBody ListasInstituciones listasTiposReferencias) {
        return listasInstitucionesRefactorRepository.save(new ListasInstituciones(listasTiposReferencias.getIdListaInstitucion(), listasTiposReferencias.getCodigoListaInstitucion(), listasTiposReferencias.getNombreListaInstitucion(), listasTiposReferencias.getOrdenListaInstitucion(), listasTiposReferencias.getIndicadorHabilitado(), listasTiposReferencias.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasInstituciones update(@RequestBody ListasInstituciones divisionPolitica) {
        return listasInstitucionesRefactorRepository.save(divisionPolitica);
    }


}
