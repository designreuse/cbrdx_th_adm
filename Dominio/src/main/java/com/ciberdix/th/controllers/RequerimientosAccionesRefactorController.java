package com.ciberdix.th.controllers;

import com.ciberdix.th.models.RequerimientosAcciones;
import com.ciberdix.th.models.VRequerimientosAcciones;
import com.ciberdix.th.repositories.RequerimientosAccionesRefactorRepository;
import com.ciberdix.th.repositories.VRequerimientosAccionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 16/05/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/requerimientosAcciones")
public class RequerimientosAccionesRefactorController {

    @Autowired
    private RequerimientosAccionesRefactorRepository requerimientosAccionesRefactorRepository;

    @Autowired
    private VRequerimientosAccionesRefactorRepository vRequerimientosAccionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientosAcciones> findAll() {
        return (List<VRequerimientosAcciones>) vRequerimientosAccionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRequerimientosAcciones findOne(@PathVariable Integer id) {
        return vRequerimientosAccionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/requerimiento/{idRequerimiento}")
    List<VRequerimientosAcciones> findByIdRequerimiento(@PathVariable Integer idRequerimiento) {
        return vRequerimientosAccionesRefactorRepository.findByIdRequerimiento(idRequerimiento);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosAcciones create(@RequestBody RequerimientosAcciones o) {
        return requerimientosAccionesRefactorRepository.save(

                new RequerimientosAcciones(o.getIdRequerimiento(),o.getIdAccion(),o.getIdRequerimientoHistorico(),
                        o.getObservacion(),o.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosAcciones o) {
        requerimientosAccionesRefactorRepository.save(
                new RequerimientosAcciones(o.getIdRequerimientoAccion(),o.getIdRequerimiento(),
                        o.getIdAccion(),o.getIdRequerimientoHistorico(),o.getObservacion(),o.getAuditoriaUsuario())
        );
    }

}
