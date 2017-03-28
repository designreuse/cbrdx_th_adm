package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.TercerosEstudiosFormales;
import com.ciberdix.th.repositories.refactor.TercerosEstudiosFormalesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/tercerosEstudiosFormales")
@CrossOrigin
public class TercerosEstudiosFormalesRefactorController {

    @Autowired
    private TercerosEstudiosFormalesRefactorRepository tercerosEstudiosFormalesRefactorRepository;


    @RequestMapping(method = RequestMethod.GET)
    List<TercerosEstudiosFormales> findAll() {
        return (List<TercerosEstudiosFormales>) tercerosEstudiosFormalesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTerceroEstudioFormal}")
    TercerosEstudiosFormales findOne(@PathVariable Integer idTerceroEstudioFormal) {
        return tercerosEstudiosFormalesRefactorRepository.findOne(idTerceroEstudioFormal);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<TercerosEstudiosFormales> findOne(@PathVariable Long idTercero) {
        return tercerosEstudiosFormalesRefactorRepository.findByIdTerceroAndIndicadorHabilitadoIsTrue(idTercero);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosEstudiosFormales create(@RequestBody TercerosEstudiosFormales tercerosReferencias) {
        return tercerosEstudiosFormalesRefactorRepository.save(new TercerosEstudiosFormales(tercerosReferencias.getIdTercero(), tercerosReferencias.getIdNivelEstudio(), tercerosReferencias.getIdAreaEstudio(), tercerosReferencias.getTituloEstudio(), tercerosReferencias.getIdInstitucion(), tercerosReferencias.getOtraInstitucion(), tercerosReferencias.getIdCiudad(), tercerosReferencias.getIdEstado(), tercerosReferencias.getFechaIngresa(), tercerosReferencias.getFechaTermina(), tercerosReferencias.getIdAdjunto(), tercerosReferencias.getIndicadorHabilitado(), tercerosReferencias.getAuditoriaUsuario(), tercerosReferencias.getIndicadorVerificado(), tercerosReferencias.getFechaVerificado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosEstudiosFormales update(@RequestBody TercerosEstudiosFormales tercerosReferencias) {
        return tercerosEstudiosFormalesRefactorRepository.save(tercerosReferencias);
    }
}
