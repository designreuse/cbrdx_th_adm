package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosExperienciasLaborales;
import com.ciberdix.th.models.VTercerosExperienciasLaborales;
import com.ciberdix.th.repositories.TercerosExperienciasLaboralesRefactorRepository;
import com.ciberdix.th.repositories.VTercerosExperienciasLaboralesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/tercerosExperienciasLaborales")
@CrossOrigin
public class TercerosExperienciasLaboralesRefactorController {

    @Autowired
    private TercerosExperienciasLaboralesRefactorRepository TercerosExperienciasLaboralesRefactorRepository;

    @Autowired
    private VTercerosExperienciasLaboralesRefactorRepository vTercerosExperienciasLaboralesRefactorRepository;


    @RequestMapping(method = RequestMethod.GET)
    List<TercerosExperienciasLaborales> findAll() {
        return (List<TercerosExperienciasLaborales>) TercerosExperienciasLaboralesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTerceroEstudioFormal}")
    VTercerosExperienciasLaborales findViewOne(@PathVariable Integer idTerceroEstudioFormal) {
        return vTercerosExperienciasLaboralesRefactorRepository.findOne(idTerceroEstudioFormal);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<VTercerosExperienciasLaborales> findViewOne(@PathVariable Long idTercero) {
        return vTercerosExperienciasLaboralesRefactorRepository.findByIdTerceroAndIndicadorHabilitadoIsTrue(idTercero);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosExperienciasLaborales create(@RequestBody TercerosExperienciasLaborales tercerosReferencias) {
        return TercerosExperienciasLaboralesRefactorRepository.save(new TercerosExperienciasLaborales(tercerosReferencias.getIdTercero(), tercerosReferencias.getEmpresa(), tercerosReferencias.getTelefonoEmpresa(), tercerosReferencias.getIdSectorEmpresa(), tercerosReferencias.getIdSubSectorEmpresa(), tercerosReferencias.getCargo(), tercerosReferencias.getIdNivelCargo(), tercerosReferencias.getAreaCargo(), tercerosReferencias.getJefeInmediato(), tercerosReferencias.getTiempoExperiencia(), tercerosReferencias.getIdCiudad(), tercerosReferencias.getIndicadorActualmente(), tercerosReferencias.getFechaIngresa(), tercerosReferencias.getFechaTermina(), tercerosReferencias.getIdAdjunto(), tercerosReferencias.getIndicadorHabilitado(), tercerosReferencias.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosExperienciasLaborales update(@RequestBody TercerosExperienciasLaborales tercerosReferencias) {
        return TercerosExperienciasLaboralesRefactorRepository.save(tercerosReferencias);
    }
}
