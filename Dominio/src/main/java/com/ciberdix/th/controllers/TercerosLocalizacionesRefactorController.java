package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosLocalizaciones;
import com.ciberdix.th.models.VLocalizaciones;
import com.ciberdix.th.repositories.TercerosLocalizacionesRefactorRepository;
import com.ciberdix.th.repositories.VLocalizacionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/tercerosLocalizaciones")
@CrossOrigin
public class TercerosLocalizacionesRefactorController {

    @Autowired
    private TercerosLocalizacionesRefactorRepository tercerosLocalizacionesRefactorRepository;
    
    @Autowired
    private VLocalizacionesRefactorRepository vlocalizacionesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosLocalizaciones> findAll() {
        return (List<TercerosLocalizaciones>) tercerosLocalizacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLocalizacion}")
    TercerosLocalizaciones findOne(@PathVariable Integer idLocalizacion) {        
        return tercerosLocalizacionesRefactorRepository.findByIdlocalizacion(idLocalizacion);
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<VLocalizaciones> findViewOne(@PathVariable Long idTercero) {        
        return vlocalizacionesRepository.queryAllLocalizaciones(idTercero);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosLocalizaciones create(@RequestBody TercerosLocalizaciones tercerosLocalizaciones) {
        return tercerosLocalizacionesRefactorRepository.save(new TercerosLocalizaciones(tercerosLocalizaciones.getIdTercero(), tercerosLocalizaciones.getIdlocalizacion(), tercerosLocalizaciones.getIndicadorHabilitado(), tercerosLocalizaciones.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosLocalizaciones update(@RequestBody TercerosLocalizaciones tercerosLocalizaciones) {
        return tercerosLocalizacionesRefactorRepository.save(tercerosLocalizaciones);
    }
}
