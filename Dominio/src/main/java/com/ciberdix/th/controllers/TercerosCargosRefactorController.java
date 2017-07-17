package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosCargos;
import com.ciberdix.th.models.VTercerosCargos;
import com.ciberdix.th.repositories.TercerosCargosRefactorRepository;
import com.ciberdix.th.repositories.VTercerosCargosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosCargos")
public class TercerosCargosRefactorController {
    @Autowired
    private TercerosCargosRefactorRepository tercerosCargosRefactorRepository;

    @Autowired
    private VTercerosCargosRefactorRepository vTercerosCargosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosCargos> findAll() {
        return (List<VTercerosCargos>) vTercerosCargosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VTercerosCargos> findEnabled() {
        return (List<VTercerosCargos>) vTercerosCargosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarEstructuraCargo/{id}")
    List<VTercerosCargos> findByIdEstructuraOrganizacionalCargo(@PathVariable Integer id) {
        return vTercerosCargosRefactorRepository.findByIdEstructuraOrganizacionalCargo(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarEstructura/{id}")
    List<VTercerosCargos> findByIdEstructuraOrganizacional(@PathVariable Integer id) {
        return vTercerosCargosRefactorRepository.findByIndicadorHabilitadoTrueAndIdEstructuraOrganizacional(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<VTercerosCargos> findByIdCargo(@PathVariable Integer id) {
        return vTercerosCargosRefactorRepository.findAllByIdCargoAndIndicadorHabilitadoIsTrue(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosCargos findOne(@PathVariable Integer id) {
        return vTercerosCargosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{id}")
    VTercerosCargos findByIdTercero(@PathVariable Long id) {
        return vTercerosCargosRefactorRepository.findAllByIdTerceroAndIndicadorHabilitadoIsTrue(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosCargos create(@RequestBody TercerosCargos o) {
        return tercerosCargosRefactorRepository.save(
                new TercerosCargos(o.getIdTercero(),o.getIdEstructuraOrganizacionalCargo(),o.getAsignadoDesde(),
                        o.getIdTipoContrato(),o.getIdZona(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosCargos o) {
        tercerosCargosRefactorRepository.save(
                new TercerosCargos(o.getIdTerceroCargo(),o.getIdTercero(),o.getIdEstructuraOrganizacionalCargo(),o.getAsignadoDesde(),
                        o.getIdTipoContrato(),o.getIdZona(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario())
        );
    }
}
