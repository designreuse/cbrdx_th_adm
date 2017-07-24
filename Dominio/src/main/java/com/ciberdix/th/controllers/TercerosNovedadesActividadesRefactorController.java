package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosNovedadesActividades;
import com.ciberdix.th.models.VTercerosNovedadesActividades;
import com.ciberdix.th.repositories.TercerosNovedadesActividadesRefactorRepository;
import com.ciberdix.th.repositories.VTercerosNovedadesActividadesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosNovedadesActividades")
public class TercerosNovedadesActividadesRefactorController {

    @Autowired
    private TercerosNovedadesActividadesRefactorRepository tercerosNovedadesActividadesRefactorRepository;

    @Autowired
    private VTercerosNovedadesActividadesRefactorRepository vTercerosNovedadesActividadesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosNovedadesActividades> findAll() {
        return (List<VTercerosNovedadesActividades>) vTercerosNovedadesActividadesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosNovedadesActividades> findEnabled() {
        return vTercerosNovedadesActividadesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroNovedad/{id}")
    List<VTercerosNovedadesActividades> findByIdTerceroNovedad(@PathVariable Integer id) {
        return vTercerosNovedadesActividadesRefactorRepository.findAllByIdTerceroNovedad(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosNovedadesActividades findOne(@PathVariable Integer id) {
        return vTercerosNovedadesActividadesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosNovedadesActividades create(@RequestBody TercerosNovedadesActividades o) {
        return tercerosNovedadesActividadesRefactorRepository.save(
                new TercerosNovedadesActividades(
                        o.getIdTerceroNovedad(),o.getIdEstadoNovedad(),
                        o.getActividadRealizada(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosNovedadesActividades o) {
        tercerosNovedadesActividadesRefactorRepository.save(
                new TercerosNovedadesActividades(
                        o.getIdTerceroNovedadActividad(),o.getIdTerceroNovedad(),o.getFechaCreacion(),o.getIdEstadoNovedad(),
                        o.getActividadRealizada(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
