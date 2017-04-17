package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.CentrosCostos;
import com.ciberdix.th.repositories.refactor.CentrosCostosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/centrosCostos")
public class CentrosCostosRefactorController {
    @Autowired
    private CentrosCostosRefactorRepository centrosCostosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<CentrosCostos> findAll() {
        return (List<CentrosCostos>) centrosCostosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<CentrosCostos> findEnabled() {
        return (List<CentrosCostos>) centrosCostosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    CentrosCostos findOne(@PathVariable Integer id) {
        return centrosCostosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CentrosCostos create(@RequestBody CentrosCostos obj) {
        return centrosCostosRefactorRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CentrosCostos obj) {
        centrosCostosRefactorRepository.save(obj);
    }
}
