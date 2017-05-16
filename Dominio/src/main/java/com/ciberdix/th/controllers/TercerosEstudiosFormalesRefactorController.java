package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosEstudiosFormales;
import com.ciberdix.th.models.VTercerosEstudiosFormales;
import com.ciberdix.th.repositories.TercerosEstudiosFormalesRefactorRepository;
import com.ciberdix.th.repositories.VTercerosEstudiosFormalesRefactorRepository;
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

    @Autowired
    private VTercerosEstudiosFormalesRefactorRepository vTercerosEstudiosFormalesRefactorRepository;


    @RequestMapping(method = RequestMethod.GET)
    List<TercerosEstudiosFormales> findAll() {
        return (List<TercerosEstudiosFormales>) tercerosEstudiosFormalesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTerceroEstudioFormal}")
    VTercerosEstudiosFormales findViewOne(@PathVariable Integer idTerceroEstudioFormal) {
        return vTercerosEstudiosFormalesRefactorRepository.findOne(idTerceroEstudioFormal);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<VTercerosEstudiosFormales> findViewOne(@PathVariable Long idTercero) {
        return vTercerosEstudiosFormalesRefactorRepository.findByIndicadorHabilitadoIsTrueAndIdTercero(idTercero);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosEstudiosFormales create(@RequestBody TercerosEstudiosFormales tercerosReferencias) {
        return tercerosEstudiosFormalesRefactorRepository.save(new TercerosEstudiosFormales(tercerosReferencias.getIdTercero(), tercerosReferencias.getIdNivelEstudio(), tercerosReferencias.getIdAreaEstudio(), tercerosReferencias.getTituloEstudio(), tercerosReferencias.getIdInstitucion(), tercerosReferencias.getOtraInstitucion(), tercerosReferencias.getIdCiudad(), tercerosReferencias.getIdEstado(), tercerosReferencias.getFechaIngresa(), tercerosReferencias.getFechaTermina(), tercerosReferencias.getIdAdjunto(), tercerosReferencias.getIndicadorHabilitado(), tercerosReferencias.getAuditoriaUsuario(), tercerosReferencias.getIndicadorVerificado(), tercerosReferencias.getFechaVerificado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosEstudiosFormales update(@RequestBody TercerosEstudiosFormales tercerosReferencias) {
        return tercerosEstudiosFormalesRefactorRepository.save(new TercerosEstudiosFormales(tercerosReferencias.getIdTercero(), tercerosReferencias.getIdNivelEstudio(), tercerosReferencias.getIdAreaEstudio(), tercerosReferencias.getTituloEstudio(), tercerosReferencias.getIdInstitucion(), tercerosReferencias.getOtraInstitucion(), tercerosReferencias.getIdCiudad(), tercerosReferencias.getIdEstado(), tercerosReferencias.getFechaIngresa(), tercerosReferencias.getFechaTermina(), tercerosReferencias.getIdAdjunto(), tercerosReferencias.getIndicadorHabilitado(), tercerosReferencias.getAuditoriaUsuario(), tercerosReferencias.getIndicadorVerificado(), tercerosReferencias.getFechaVerificado()));
    }
}
