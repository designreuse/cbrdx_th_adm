package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.CargosRiesgos;
import com.ciberdix.th.models.refactor.VCargosRiesgos;
import com.ciberdix.th.repositories.refactor.CargosRiesgosRefactorRepository;
import com.ciberdix.th.repositories.refactor.VCargosRiesgosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosRiesgos")
public class CargosRiesgosRefactorController {
    @Autowired
    private CargosRiesgosRefactorRepository cargosRiesgosRefactorRepository;

    @Autowired
    private VCargosRiesgosRefactorRepository vCargosRiesgosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosRiesgos> findAll() {
        return (List<VCargosRiesgos>) vCargosRiesgosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosRiesgos findOne(@PathVariable Integer id) {
        return vCargosRiesgosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosRiesgos create(@RequestBody CargosRiesgos obj) {
        return cargosRiesgosRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosRiesgos obj) {
        cargosRiesgosRefactorRepository.save(obj);
    }
}
