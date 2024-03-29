package com.ciberdix.th.controllers;

import com.ciberdix.th.models.EstructuraOrganizacionalCargos;
import com.ciberdix.th.models.VEstructuraOrganizacionalCargos;
import com.ciberdix.th.repositories.EstructuraOrganizacionalCargosRefactorRepository;
import com.ciberdix.th.repositories.VEstructuraOrganizacionalCargosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
@CrossOrigin
@RestController
@Transactional
@RequestMapping("/api/estructuraOrganizacionalCargos")
public class EstructuraOrganizacionalCargosRefactorController {
    @Autowired
    private EstructuraOrganizacionalCargosRefactorRepository estructuraOrganizacionalCargosRefactorRepository;

    @Autowired
    private VEstructuraOrganizacionalCargosRefactorRepository vEstructuraOrganizacionalCargosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VEstructuraOrganizacionalCargos> findAll() {
        return (List<VEstructuraOrganizacionalCargos>) vEstructuraOrganizacionalCargosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VEstructuraOrganizacionalCargos> findEnabled() {
        return (List<VEstructuraOrganizacionalCargos>) vEstructuraOrganizacionalCargosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<VEstructuraOrganizacionalCargos> findByIdCargo(@PathVariable Integer id) {
        return vEstructuraOrganizacionalCargosRefactorRepository.findByIndicadorHabilitadoIsTrueAndIdEstructuraOrganizacional(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cargo/{id}")
    List<VEstructuraOrganizacionalCargos> findByCargo(@PathVariable Integer id) {
        return vEstructuraOrganizacionalCargosRefactorRepository.findAllByIndicadorHabilitadoIsTrueAndIdCargo(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercerosHabInEstrucOrgCarg/{id}")
    List<VEstructuraOrganizacionalCargos> queryAllByIdCargo(@PathVariable Integer id) {
        return vEstructuraOrganizacionalCargosRefactorRepository.queryAllByIdCargo(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargoEstructura/{idCargo}/{idEstructura}")
    VEstructuraOrganizacionalCargos findAllByIdCAndIdE(@PathVariable Integer idCargo, @PathVariable Integer idEstructura) {
        return vEstructuraOrganizacionalCargosRefactorRepository.findAllByIndicadorHabilitadoIsTrueAndIdCargoAndIdEstructuraOrganizacional(idCargo,idEstructura);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VEstructuraOrganizacionalCargos findOne(@PathVariable Integer id) {
        return vEstructuraOrganizacionalCargosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstructuraOrganizacionalCargos create(@RequestBody EstructuraOrganizacionalCargos obj) {
        return estructuraOrganizacionalCargosRefactorRepository.save(
                new EstructuraOrganizacionalCargos(obj.getIdEstructuraOrganizacional(),
                        obj.getIdCargo(),obj.getPlazas(),obj.getIndicadorHabilitado(),
                        obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody EstructuraOrganizacionalCargos obj) {
        estructuraOrganizacionalCargosRefactorRepository.save(
                new EstructuraOrganizacionalCargos(obj.getIdEstructuraOrganizacionalCargo(),obj.getIdEstructuraOrganizacional(),
                        obj.getIdCargo(),obj.getPlazas(),obj.getIndicadorHabilitado(),
                        obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/disabled/{idCargo}")
    void disabledEOC(@PathVariable Integer idCargo) {
        estructuraOrganizacionalCargosRefactorRepository.disabled(idCargo);
    }
}
