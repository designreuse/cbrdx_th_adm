package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosEstudiosNoFormales;
import com.ciberdix.th.models.VTercerosEstudiosNoFormales;
import com.ciberdix.th.repositories.TercerosEstudiosNoFormalesRefactorRepository;
import com.ciberdix.th.repositories.VTercerosEstudiosNoFormalesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/tercerosEstudiosNoFormales")
@CrossOrigin
public class TercerosEstudiosNoFormalesRefactorController {

    @Autowired
    private TercerosEstudiosNoFormalesRefactorRepository TercerosEstudiosNoFormalesRefactorRepository;

    @Autowired
    private VTercerosEstudiosNoFormalesRefactorRepository vTercerosEstudiosNoFormalesRefactorRepository;


    @RequestMapping(method = RequestMethod.GET)
    List<TercerosEstudiosNoFormales> findAll() {
        return (List<TercerosEstudiosNoFormales>) TercerosEstudiosNoFormalesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTerceroEstudioFormal}")
    VTercerosEstudiosNoFormales findViewOne(@PathVariable Integer idTerceroEstudioFormal) {
        return vTercerosEstudiosNoFormalesRefactorRepository.findOne(idTerceroEstudioFormal);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<VTercerosEstudiosNoFormales> findViewOne(@PathVariable Long idTercero) {
        return vTercerosEstudiosNoFormalesRefactorRepository.findByIndicadorHabilitadoIsTrueAndIdTercero(idTercero);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosEstudiosNoFormales create(@RequestBody TercerosEstudiosNoFormales tercerosReferencias) {
        return TercerosEstudiosNoFormalesRefactorRepository.save(new TercerosEstudiosNoFormales(tercerosReferencias.getIdTercero(), tercerosReferencias.getIdTipoEstudio(), tercerosReferencias.getOtroEstudio(), tercerosReferencias.getIdAreaEstudio(), tercerosReferencias.getTituloEstudio(), tercerosReferencias.getInstitucion(), tercerosReferencias.getIdIntensidadHoraria(), tercerosReferencias.getDescripcion(), tercerosReferencias.getIdCiudad(), tercerosReferencias.getIndicadorTerminacion(), tercerosReferencias.getFechaIngresa(), tercerosReferencias.getFechaTermina(), tercerosReferencias.getIdAdjunto(), tercerosReferencias.getIndicadorHabilitado(), tercerosReferencias.getAuditoriaUsuario(), tercerosReferencias.getIndicadorVerificado(), tercerosReferencias.getFechaVerificado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosEstudiosNoFormales update(@RequestBody TercerosEstudiosNoFormales tercerosReferencias) {
        return TercerosEstudiosNoFormalesRefactorRepository.save(tercerosReferencias);
    }
}
