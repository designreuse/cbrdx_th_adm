package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.TercerosInmuebles;
import com.ciberdix.th.models.refactor.VTercerosInmuebles;
import com.ciberdix.th.repositories.refactor.TercerosInmueblesRefactorRepository;
import com.ciberdix.th.repositories.refactor.VTercerosInmueblesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/tercerosInmuebles")
public class TercerosInmueblesRefactorController {

    @Autowired
    private TercerosInmueblesRefactorRepository tercerosInmueblesRefactorRepository;

    @Autowired
    private VTercerosInmueblesRefactorRepository vTercerosInmueblesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosInmuebles> findAll() {
        return (List<VTercerosInmuebles>) vTercerosInmueblesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosInmuebles findOne(@PathVariable Integer id) {
        return vTercerosInmueblesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{id}")
    List<VTercerosInmuebles> findPorTercero(@PathVariable Long id) {
        return (List<VTercerosInmuebles>) vTercerosInmueblesRefactorRepository.findByIdTercero(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosInmuebles create(@RequestBody TercerosInmuebles obj) {
        return tercerosInmueblesRefactorRepository.save(
                new TercerosInmuebles(obj.getIdTercero(), obj.getIdTipoVivienda(),
                        obj.getIdClaseVivienda(), obj.getIdTipoConstruccionVivienda(),
                        obj.getAnioConstruccion(), obj.getNumeroPisos(), obj.getNumeroSotanos(),
                        obj.getIdEstrato(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosInmuebles obj) {
        tercerosInmueblesRefactorRepository.save(obj);
    }
}
