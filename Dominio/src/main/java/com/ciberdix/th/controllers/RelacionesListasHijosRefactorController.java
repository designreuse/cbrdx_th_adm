package com.ciberdix.th.controllers;

import com.ciberdix.th.models.RelacionesListasHijos;
import com.ciberdix.th.repositories.RelacionesListasHijosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 20/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/relacionesListasHijos")
public class RelacionesListasHijosRefactorController {

    @Autowired
    private RelacionesListasHijosRefactorRepository relacionesListasHijosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<RelacionesListasHijos> findAll() {
        return (List<RelacionesListasHijos>) relacionesListasHijosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<RelacionesListasHijos> findEnabled() {
        return relacionesListasHijosRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RelacionesListasHijos findOne(@PathVariable Integer id) {
        return relacionesListasHijosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/relacionesListas/{id}")
    List<RelacionesListasHijos> findByRelacionLista(@PathVariable Integer id) {
        return relacionesListasHijosRefactorRepository.findAllByIdRelacionLista(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/relacionesListas/{id}/enabled")
    List<RelacionesListasHijos> findByRelacionListaHabilitada(@PathVariable Integer id) {
        return relacionesListasHijosRefactorRepository.findAllByIdRelacionListaAndIndicadorHabilitadoIsTrue(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    RelacionesListasHijos create(@RequestBody RelacionesListasHijos o) {
        return relacionesListasHijosRefactorRepository.save(
                new RelacionesListasHijos(
                        o.getIdRelacionLista(), o.getIdItemHijo(), o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RelacionesListasHijos o) {
        relacionesListasHijosRefactorRepository.save(new RelacionesListasHijos(
                o.getIdRelacionListaHijo(), o.getIdRelacionLista(), o.getIdItemHijo(), o.getIndicadorHabilitado(),
                o.getAuditoriaUsuario()
        ));
    }

}
