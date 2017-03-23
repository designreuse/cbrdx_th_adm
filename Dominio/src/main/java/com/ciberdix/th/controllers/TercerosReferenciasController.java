package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosReferenciasEntity;
import com.ciberdix.th.models.VTercerosReferenciasEntity;
import com.ciberdix.th.repositories.TercerosReferenciasRepository;
import com.ciberdix.th.repositories.VTercerosReferenciasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/employeesReferences")
public class TercerosReferenciasController {

    @Autowired
    private TercerosReferenciasRepository tercerosReferenciasRepository;

    @Autowired
    private VTercerosReferenciasRepository vTercerosReferenciasRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosReferenciasEntity> findAll() {
        return (List<TercerosReferenciasEntity>) tercerosReferenciasRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/view/{idTercero}")
    List<VTercerosReferenciasEntity> getLists(@PathVariable Long idTercero) {
        return vTercerosReferenciasRepository.findByIdTercero(idTercero);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    TercerosReferenciasEntity verConstante(@PathVariable Integer IdParametro) {
        return tercerosReferenciasRepository.findOne(IdParametro);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosReferenciasEntity createList(@RequestBody TercerosReferenciasEntity t) {
        return tercerosReferenciasRepository.save(new TercerosReferenciasEntity(t.getIdTercero(), t.getIdTipoReferencia(), t.getEmpresa(), t.getPrimerNombre(), t.getSegundoNombre(), t.getPrimerApellido(), t.getSegundoApellido(), t.getTelefonoFijo(), t.getTelefonoMovil(), t.getIdLocalizacion(), t.getIdAdjunto(), t.getIndicadorHabilitado(), t.getAuditoriaUsuario(), t.getIndicadorVerificado(), t.getFechaVerificado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosReferenciasEntity updateList(@RequestBody TercerosReferenciasEntity centrosCostosEntity) {
        return tercerosReferenciasRepository.save(centrosCostosEntity);
    }
}
