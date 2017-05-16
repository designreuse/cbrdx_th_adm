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
    TercerosEstudiosNoFormales create(@RequestBody TercerosEstudiosNoFormales c) {
        return TercerosEstudiosNoFormalesRefactorRepository.save(new TercerosEstudiosNoFormales(c.getIdTercero(), c.getIdTipoEstudio(), c.getOtroEstudio(), c.getIdAreaEstudio(), c.getTituloEstudio(), c.getInstitucion(), c.getIdIntensidadHoraria(), c.getDescripcion(), c.getIdCiudad(), c.getIndicadorTerminacion(), c.getFechaIngresa(), c.getFechaTermina(), c.getIdAdjunto(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario(), c.getIndicadorVerificado(), c.getFechaVerificado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosEstudiosNoFormales update(@RequestBody TercerosEstudiosNoFormales c) {
        return TercerosEstudiosNoFormalesRefactorRepository.save(new TercerosEstudiosNoFormales(c.getIdTerceroEstudioNoFormal(),c.getIdTercero(), c.getIdTipoEstudio(), c.getOtroEstudio(), c.getIdAreaEstudio(), c.getTituloEstudio(), c.getInstitucion(), c.getIdIntensidadHoraria(), c.getDescripcion(), c.getIdCiudad(), c.getIndicadorTerminacion(), c.getFechaIngresa(), c.getFechaTermina(), c.getIdAdjunto(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario(), c.getIndicadorVerificado(), c.getFechaVerificado()));
    }
}
