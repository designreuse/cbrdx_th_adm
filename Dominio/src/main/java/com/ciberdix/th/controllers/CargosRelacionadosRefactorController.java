package com.ciberdix.th.controllers;

import com.ciberdix.th.models.CargosRelacionados;
import com.ciberdix.th.models.VCargosRelacionados;
import com.ciberdix.th.repositories.CargosRelacionadosRefactorRepository;
import com.ciberdix.th.repositories.VCargosRelacionadosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosRelacionados")
public class CargosRelacionadosRefactorController {
    @Autowired
    private CargosRelacionadosRefactorRepository CargosRelacionadosRefactorRepository;

    @Autowired
    private VCargosRelacionadosRefactorRepository vCargosRelacionadosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosRelacionados> findAll() {
        return (List<VCargosRelacionados>) vCargosRelacionadosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarRelacion/{codigoRelacion}/{idCargo}")
    List<VCargosRelacionados> findEnabled(@PathVariable String codigoRelacion, @PathVariable Integer idCargo) {
        return (List<VCargosRelacionados>) vCargosRelacionadosRefactorRepository.findCargos(codigoRelacion, idCargo);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosRelacionados create(@RequestBody CargosRelacionados obj) {
        return CargosRelacionadosRefactorRepository.save(new CargosRelacionados(obj.getIdTipoRelacion(),
                obj.getIdCargo(), obj.getAuditoriaUsuario(), obj.getIdCargoRelacion(), obj.getIndicadorHabilitado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosRelacionados obj) {
        CargosRelacionadosRefactorRepository.save(
                new CargosRelacionados(obj.getIdCargoRelacion(),obj.getIdTipoRelacion(),
                        obj.getIdCargo(), obj.getAuditoriaUsuario(), obj.getIdCargoRelacion(), obj.getIndicadorHabilitado())
        );
    }
}
