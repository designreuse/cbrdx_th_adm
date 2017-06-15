package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProcesoSeleccionAdjuntos;
import com.ciberdix.th.repositories.ProcesoSeleccionAdjuntosRefactorRepository;
import com.ciberdix.th.repositories.ProcesoSeleccionRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 14/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/procesoSeleccionAdjuntos")
public class ProcesoSeleccionAdjuntosRefactorController {

    @Autowired
    private ProcesoSeleccionAdjuntosRefactorRepository procesoSeleccionAdjuntosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ProcesoSeleccionAdjuntos> findAll() {
        return (List<ProcesoSeleccionAdjuntos>) procesoSeleccionAdjuntosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ProcesoSeleccionAdjuntos findOne(@PathVariable Integer id) {
        return procesoSeleccionAdjuntosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccionAdjuntos create(@RequestBody ProcesoSeleccionAdjuntos o) {
        return procesoSeleccionAdjuntosRefactorRepository.save(
                new ProcesoSeleccionAdjuntos(
                        o.getIdProcesoPaso(),o.getIdTerceroPublicacion(),o.getIdAdjunto(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccionAdjuntos o) {
        procesoSeleccionAdjuntosRefactorRepository.save(
                new ProcesoSeleccionAdjuntos(
                        o.getIdProcesoSeleccionAdjunto(),o.getIdProcesoPaso(),o.getIdTerceroPublicacion(),o.getIdAdjunto(),o.getAuditoriaUsuario()
                )
        );
    }

}
