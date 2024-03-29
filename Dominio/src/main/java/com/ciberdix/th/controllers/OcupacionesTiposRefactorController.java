package com.ciberdix.th.controllers;

import com.ciberdix.th.models.OcupacionesTipos;
import com.ciberdix.th.repositories.OcupacionesTiposRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 21/04/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/ocupacionesTipos")
public class OcupacionesTiposRefactorController {

    @Autowired
    private OcupacionesTiposRefactorRepository ocupacionesTiposRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<OcupacionesTipos> getOcupacionesTipos() {
        return (List<OcupacionesTipos>) ocupacionesTiposRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    OcupacionesTipos findAll(@PathVariable Integer idLista) {
        return ocupacionesTiposRefactorRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<OcupacionesTipos> findEnabled() {
        return (List<OcupacionesTipos>) ocupacionesTiposRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    OcupacionesTipos createOcupacionTipo(@RequestBody OcupacionesTipos c) {
        return ocupacionesTiposRefactorRepository.save(new OcupacionesTipos(c.getCodigoOcupacionTipo(), c.getDescripcionOcupacionTipo(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    OcupacionesTipos updateOcupacionTipo(@RequestBody OcupacionesTipos c) {
        return ocupacionesTiposRefactorRepository.save(
                new OcupacionesTipos(c.getIdOcupacionTipo(),c.getCodigoOcupacionTipo(), c.getDescripcionOcupacionTipo(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario())
        );
    }

}
