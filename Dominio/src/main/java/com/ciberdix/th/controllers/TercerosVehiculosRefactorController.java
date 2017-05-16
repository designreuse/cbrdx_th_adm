package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosVehiculos;
import com.ciberdix.th.models.VTercerosVehiculos;
import com.ciberdix.th.repositories.TercerosVehiculosRefactorRepository;
import com.ciberdix.th.repositories.VTercerosVehiculosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 4/04/17.
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/tercerosVehiculos")
public class TercerosVehiculosRefactorController {
    @Autowired
    private TercerosVehiculosRefactorRepository tercerosVehiculosRefactorRepository;

    @Autowired
    private VTercerosVehiculosRefactorRepository vTercerosVehiculosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosVehiculos> findAll(){
        return (List<VTercerosVehiculos>) vTercerosVehiculosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path ="/buscarTerceros/{id}")
    List<VTercerosVehiculos> findbyTercero(@PathVariable Long id){
        return (List<VTercerosVehiculos>) vTercerosVehiculosRefactorRepository.findByIndicadorHabilitadoIsTrueAndIdTercero(id);
    }

    @RequestMapping(method = RequestMethod.GET, path="/{id}")
    VTercerosVehiculos findOne(@PathVariable Integer id){
        return vTercerosVehiculosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosVehiculos create(@RequestBody TercerosVehiculos obj){
        return tercerosVehiculosRefactorRepository.save(
                new TercerosVehiculos(obj.getIdTercero(),obj.getIdTipoVehiculo(),obj.getIdTipoServicio(),
                        obj.getIdMarca(),obj.getModelo(),obj.getPlaca(),obj.getIdCiudad(),obj.getIndicadorHabilitado(),
                        obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosVehiculos obj){
        tercerosVehiculosRefactorRepository.save(obj);
    }
}
