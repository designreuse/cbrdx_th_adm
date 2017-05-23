package com.ciberdix.th.controllers;

import com.ciberdix.th.models.CargosElementos;
import com.ciberdix.th.models.VCargosElementos;
import com.ciberdix.th.repositories.CargosElementosRefactorRepository;
import com.ciberdix.th.repositories.VCargosElementosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosElementos")
public class CargosElementosRefactorController {
    @Autowired
    private CargosElementosRefactorRepository cargosElementosRefactorRepository;

    @Autowired
    private VCargosElementosRefactorRepository vCargosElementosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosElementos> findAll() {
        return (List<VCargosElementos>) vCargosElementosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosElementos findOne(@PathVariable Integer id) {
        return vCargosElementosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<VCargosElementos> findByIdCargo(@PathVariable Integer id) {
        return vCargosElementosRefactorRepository.findByIdCargo(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosElementos create(@RequestBody CargosElementos obj) {
        return cargosElementosRefactorRepository.save(
                new CargosElementos(obj.getIdCargo(), obj.getIdTipoElemento(),
                        obj.getDescripcion(), obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosElementos obj) {
        cargosElementosRefactorRepository.save(
                new CargosElementos(obj.getIdCargoElemento(),obj.getIdCargo(), obj.getIdTipoElemento(),
                        obj.getDescripcion(), obj.getAuditoriaUsuario())
        );
    }
}
