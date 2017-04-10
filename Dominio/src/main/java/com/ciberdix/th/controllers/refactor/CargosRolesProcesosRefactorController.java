package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.CargosRolesProcesos;
import com.ciberdix.th.models.refactor.VCargosRolesProcesos;
import com.ciberdix.th.repositories.refactor.CargosRolesProcesosRefactorRepository;
import com.ciberdix.th.repositories.refactor.VCargosRolesProcesosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosRolesProcesos")
public class CargosRolesProcesosRefactorController {
    @Autowired
    private CargosRolesProcesosRefactorRepository cargosRolesProcesosRefactorRepository;

    @Autowired
    private VCargosRolesProcesosRefactorRepository vCargosRolesProcesosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosRolesProcesos> findAll() {
        return (List<VCargosRolesProcesos>) vCargosRolesProcesosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VCargosRolesProcesos> findEnabled() {
        return (List<VCargosRolesProcesos>) vCargosRolesProcesosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<VCargosRolesProcesos> findByIdCargo(@PathVariable Integer id) {
        return (List<VCargosRolesProcesos>) vCargosRolesProcesosRefactorRepository.findByIndicadorHabilitadoIsTrueAndIdCargo(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosRolesProcesos findOne(@PathVariable Integer id) {
        return vCargosRolesProcesosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosRolesProcesos create(@RequestBody CargosRolesProcesos obj) {
        return cargosRolesProcesosRefactorRepository.save(
                new CargosRolesProcesos(obj.getIdRolProceso(),obj.getIdCargo(),
                        obj.getIndicadorHabilitado(),obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosRolesProcesos obj) {
        cargosRolesProcesosRefactorRepository.save(obj);
    }
}