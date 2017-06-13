package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProcesoSeleccion;
import com.ciberdix.th.models.VProcesoSeleccion;
import com.ciberdix.th.repositories.ProcesoSeleccionRefactorRepository;
import com.ciberdix.th.repositories.VProcesoSeleccionRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 8/06/2017.
 */

@CrossOrigin
@Transactional
@RestController
    @RequestMapping("/api/procesoSeleccion")
public class ProcesoSeleccionRefactorController {

    @Autowired
    private ProcesoSeleccionRefactorRepository procesoSeleccionRefactorRepository;

    @Autowired
    private VProcesoSeleccionRefactorRepository vProcesoSeleccionRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VProcesoSeleccion> findAll() {
        return (List<VProcesoSeleccion>) vProcesoSeleccionRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idProcesoSeleccion}")
    VProcesoSeleccion findOne(@PathVariable Integer idProcesoSeleccion) {
        return vProcesoSeleccionRefactorRepository.findOne(idProcesoSeleccion);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/malla/{idPublicacion}/{idTercero}")
    List<VProcesoSeleccion> findByIdPublicacionAndIdTercero(@PathVariable Integer idPublicacion, @PathVariable Long idTercero) {
        return vProcesoSeleccionRefactorRepository.findAllByIdPublicacionAndIdTercero(idPublicacion, idTercero);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccion create(@RequestBody ProcesoSeleccion o) {
        return procesoSeleccionRefactorRepository.save(new ProcesoSeleccion(
                o.getIdProcesoPaso(),o.getIdEstadoDiligenciado(),o.getIdResponsable(),
                o.getIdTercero(),o.getIdPublicacion(),o.getIndicadorContProceso(),
                o.getObservacion(),o.getFechaCita(),o.getAuditoriaUsuario(),o.getIndicadorNoAplica()
        ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccion o) {
        procesoSeleccionRefactorRepository.save(
                new ProcesoSeleccion(
                        o.getIdProcesoSeleccion(),o.getIdProcesoPaso(),o.getIdEstadoDiligenciado(),o.getIdResponsable(),
                        o.getIdTercero(),o.getIdPublicacion(),o.getIndicadorContProceso(),
                        o.getObservacion(),o.getFechaCita(),o.getAuditoriaUsuario(),o.getIndicadorNoAplica()
                ));
    }

}
