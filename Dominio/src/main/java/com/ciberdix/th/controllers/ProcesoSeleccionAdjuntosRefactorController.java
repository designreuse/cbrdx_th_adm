package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProcesoSeleccionAdjuntos;
import com.ciberdix.th.models.VProcesoSeleccionAdjuntos;
import com.ciberdix.th.repositories.ProcesoSeleccionAdjuntosRefactorRepository;
import com.ciberdix.th.repositories.ProcesoSeleccionRefactorRepository;
import com.ciberdix.th.repositories.VProcesoSeleccionAdjuntosRefactorRepository;
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

    @Autowired
    private VProcesoSeleccionAdjuntosRefactorRepository vProcesoSeleccionAdjuntosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VProcesoSeleccionAdjuntos> findAll() {
        return (List<VProcesoSeleccionAdjuntos>) vProcesoSeleccionAdjuntosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProcesoSeleccionAdjuntos findOne(@PathVariable Integer id) {
        return vProcesoSeleccionAdjuntosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terPublicPaso/{idTerceroPublicacion}/{idProcesoPaso}")
    List<VProcesoSeleccionAdjuntos> findByTerPublicPaso(@PathVariable Integer idTerceroPublicacion, @PathVariable Integer idProcesoPaso) {
        return vProcesoSeleccionAdjuntosRefactorRepository.findAllByIdTerceroPublicacionAndIdProcesoPaso(idTerceroPublicacion,idProcesoPaso);
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
