package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasTiposReferencias;
import com.ciberdix.th.repositories.refactor.ListasTiposReferenciasRepository;
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
public class ListasTiposReferenciasController {

    @Autowired
    private ListasTiposReferenciasRepository listasTiposReferenciasRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasTiposReferencias> findAll() {
        return (List<ListasTiposReferencias>) listasTiposReferenciasRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idDivisionPolitica}")
    ListasTiposReferencias findOne(@PathVariable Integer idDivisionPolitica) {
        return listasTiposReferenciasRepository.findOne(idDivisionPolitica);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasTiposReferencias create(@RequestBody ListasTiposReferencias listasTiposReferencias) {
        return listasTiposReferenciasRepository.save(new ListasTiposReferencias(listasTiposReferencias.getCodigoListaTipoReferencia(), listasTiposReferencias.getNombreListaTipoReferencia(), listasTiposReferencias.getOrdenListaTipoReferencia(), listasTiposReferencias.getIndicadorHabilitado(), listasTiposReferencias.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasTiposReferencias update(@RequestBody ListasTiposReferencias divisionPolitica) {
        return listasTiposReferenciasRepository.save(divisionPolitica);
    }
}
