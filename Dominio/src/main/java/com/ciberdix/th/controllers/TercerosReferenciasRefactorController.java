package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosReferencias;
import com.ciberdix.th.models.VTercerosReferencias;
import com.ciberdix.th.repositories.TercerosReferenciasRefactorRepository;
import com.ciberdix.th.repositories.VTercerosReferenciasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/tercerosReferencias")
@CrossOrigin
public class TercerosReferenciasRefactorController {

    @Autowired
    private TercerosReferenciasRefactorRepository tercerosReferenciasRefactorRepository;

    @Autowired
    private VTercerosReferenciasRefactorRepository vTercerosReferenciasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosReferencias> findAll() {
        return (List<TercerosReferencias>) tercerosReferenciasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTerceroReferencia}")
    TercerosReferencias findOne(@PathVariable Integer idTerceroReferencia) {
        return tercerosReferenciasRefactorRepository.findOne(idTerceroReferencia);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<VTercerosReferencias> findForTerceros(@PathVariable Long idTercero) {
        return vTercerosReferenciasRefactorRepository.findByIdTercero(idTercero);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosReferencias create(@RequestBody TercerosReferencias tercerosReferencias) {
        return tercerosReferenciasRefactorRepository.save(new TercerosReferencias(tercerosReferencias.getIdTercero(), tercerosReferencias.getIdTipoReferencia(), tercerosReferencias.getEmpresa(), tercerosReferencias.getPrimerNombre(), tercerosReferencias.getSegundoNombre(), tercerosReferencias.getPrimerApellido(), tercerosReferencias.getSegundoApellido(), tercerosReferencias.getTelefonoFijo(), tercerosReferencias.getTelefonoMovil(), tercerosReferencias.getIdLocalizacion(), tercerosReferencias.getIdAdjunto(), tercerosReferencias.getIndicadorHabilitado(), tercerosReferencias.getAuditoriaUsuario(), tercerosReferencias.getIndicadorVerificado(), tercerosReferencias.getFechaVerificado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosReferencias update(@RequestBody TercerosReferencias tercerosReferencias) {
        return tercerosReferenciasRefactorRepository.save(tercerosReferencias);
    }
}
