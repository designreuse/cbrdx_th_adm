package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.TercerosCargos;
import com.ciberdix.th.models.refactor.VTercerosCargos;
import com.ciberdix.th.repositories.refactor.TercerosCargosRefactorRepository;
import com.ciberdix.th.repositories.refactor.VTercerosCargosRefactorRepository;
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
    List<VTercerosCargos> findByIdCargo(@PathVariable Integer id) {
        return vTercerosCargosRefactorRepository.findByIdEstructuraOrganizacionalCargo(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarEstructura/{id}")
    List<VTercerosCargos> findByIdEstructuraOrganizacional(@PathVariable Integer id) {
        return vTercerosCargosRefactorRepository.findByIndicadorHabilitadoTrueAndIdEstructuraOrganizacional(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosCargos findOne(@PathVariable Integer id) {
        return vTercerosCargosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosCargos create(@RequestBody TercerosCargos obj) {
        return tercerosCargosRefactorRepository.save(
                new TercerosCargos(obj.getIdTipoContrato(),
                        obj.getAuditoriaUsuario(), obj.getIdTercero(), obj.getIdEstructuraOrganizacionalCargo(),
                        obj.getAsignadoDesde(), obj.getIdZona(), obj.getIndicadorHabilitado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosCargos obj) {
        tercerosCargosRefactorRepository.save(obj);
    }
}
