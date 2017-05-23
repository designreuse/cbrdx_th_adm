package com.ciberdix.th.controllers;

import com.ciberdix.th.models.RequerimientosTics;
import com.ciberdix.th.models.VRequerimientosTics;
import com.ciberdix.th.repositories.RequerimientosTicsRefactorRepository;
import com.ciberdix.th.repositories.VRequerimientosTicsRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 18/05/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/requerimientosTics")
public class RequerimientosTicsRefactorController {

    @Autowired
    private RequerimientosTicsRefactorRepository requerimientosTicsRefactorRepository;

    @Autowired
    private VRequerimientosTicsRefactorRepository vRequerimientosTicsRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientosTics> findAll() {
        return (List<VRequerimientosTics>) vRequerimientosTicsRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRequerimientosTics findOne(@PathVariable Integer id) {
        return vRequerimientosTicsRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/requerimiento/{idRequerimiento}")
    List<VRequerimientosTics> findByIdRequerimiento(@PathVariable Integer idRequerimiento) {
        return vRequerimientosTicsRefactorRepository.findByIdRequerimientoAndIndicadorHabilitadoIsTrue(idRequerimiento);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosTics create(@RequestBody RequerimientosTics o) {
        return requerimientosTicsRefactorRepository.save(

                new RequerimientosTics(o.getIdRequerimiento(),o.getIdTic(),o.getAuditoriaUsuario(),o.getIndicadorHabilitado())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosTics o) {
        requerimientosTicsRefactorRepository.save(
                new RequerimientosTics(o.getIdRequerimientoTic(),o.getIdRequerimiento(),o.getIdTic(),o.getAuditoriaUsuario(),
                        o.getIndicadorHabilitado())
        );
    }

}
