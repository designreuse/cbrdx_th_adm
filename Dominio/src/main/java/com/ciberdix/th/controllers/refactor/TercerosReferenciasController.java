package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.TercerosReferencias;
import com.ciberdix.th.models.refactor.VTercerosReferencias;
import com.ciberdix.th.repositories.refactor.TercerosReferenciasRepository;
import com.ciberdix.th.repositories.refactor.VTercerosReferenciasRepository;
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
public class TercerosReferenciasController {

    @Autowired
    private TercerosReferenciasRepository tercerosReferenciasRepository;

    @Autowired
    private VTercerosReferenciasRepository vTercerosReferenciasRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosReferencias> findAll() {
        return (List<TercerosReferencias>) tercerosReferenciasRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTerceroReferencia}")
    TercerosReferencias findOne(@PathVariable Integer idTerceroReferencia) {
        return tercerosReferenciasRepository.findOne(idTerceroReferencia);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<VTercerosReferencias> findForTerceros(@PathVariable Long idTercero) {
        return vTercerosReferenciasRepository.findByIdTercero(idTercero);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosReferencias create(@RequestBody TercerosReferencias tercerosReferencias) {
        return tercerosReferenciasRepository.save(new TercerosReferencias(tercerosReferencias.getIdTercero(), tercerosReferencias.getIdTipoReferencia(), tercerosReferencias.getEmpresa(), tercerosReferencias.getPrimerNombre(), tercerosReferencias.getSegundoNombre(), tercerosReferencias.getPrimerApellido(), tercerosReferencias.getSegundoApellido(), tercerosReferencias.getTelefonoFijo(), tercerosReferencias.getTelefonoMovil(), tercerosReferencias.getIdLocalizacion(), tercerosReferencias.getIdAdjunto(), tercerosReferencias.getIndicadorHabilitado(), tercerosReferencias.getAuditoriaUsuario(), tercerosReferencias.getIndicadorVerificado(), tercerosReferencias.getFechaVerificado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosReferencias update(@RequestBody TercerosReferencias tercerosReferencias) {
        return tercerosReferenciasRepository.save(tercerosReferencias);
    }
}
