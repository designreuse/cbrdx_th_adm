package com.ciberdix.th.controllers;

import com.ciberdix.th.models.RequerimientosReferidos;
import com.ciberdix.th.repositories.RequerimientosReferidosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danny on 16/05/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/requerimientosReferidos")
public class RequerimientosReferidosRefactorController {

    @Autowired
    private RequerimientosReferidosRefactorRepository requerimientosReferidosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<RequerimientosReferidos> findAll() {
        return (List<RequerimientosReferidos>) requerimientosReferidosRefactorRepository.findAll();
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RequerimientosReferidos findOne(@PathVariable Integer id) {
        return requerimientosReferidosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/requerimiento/{idRequerimiento}")
    List<RequerimientosReferidos> findByIdRequerimiento(@PathVariable Integer idRequerimiento) {
        return requerimientosReferidosRefactorRepository.findByIdRequerimiento(idRequerimiento);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosReferidos create(@RequestBody RequerimientosReferidos o) {
        return requerimientosReferidosRefactorRepository.save(

                new RequerimientosReferidos(o.getIdRequerimiento(), o.getNombre(), o.getTelefono(), o.getCorreoElectronico(),
                        o.getFechaReferencia(), o.getIdEstado(), o.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosReferidos o) {
        requerimientosReferidosRefactorRepository.save(
                new RequerimientosReferidos(o.getIdRequerimientoReferido(),o.getIdRequerimiento(), o.getNombre(), o.getTelefono(),
                        o.getCorreoElectronico(),o.getFechaReferencia(), o.getIdEstado(), o.getAuditoriaUsuario())
        );
    }

}
