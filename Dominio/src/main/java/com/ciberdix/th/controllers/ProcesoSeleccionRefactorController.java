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

    @RequestMapping(method = RequestMethod.GET, path = "/malla/{idTerceroPublicaicon}")
    List<VProcesoSeleccion> findByIdPublicacionAndIdTercero(@PathVariable Integer idTerceroPublicaicon) {
        return vProcesoSeleccionRefactorRepository.findAllByIdTerceroPublicacion(idTerceroPublicaicon);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacion/{id}")
    List<VProcesoSeleccion> findByIdPublicacion(@PathVariable Integer id) {
        return vProcesoSeleccionRefactorRepository.queryAllByIdPublicacion(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/exist/{idTerceroPublicacion}/{idProcesoPaso}")
    VProcesoSeleccion findOne(@PathVariable Integer idTerceroPublicacion, @PathVariable Integer IdProcesoPaso) {
        return vProcesoSeleccionRefactorRepository.findAllByIdTerceroPublicacionAndIdProcesoPaso(idTerceroPublicacion,IdProcesoPaso);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccion create(@RequestBody ProcesoSeleccion o) {
        return procesoSeleccionRefactorRepository.save(new ProcesoSeleccion(
                o.getIdProcesoPaso(),o.getIdEstadoDiligenciado(),o.getIdResponsable(),o.getIdTerceroPublicacion(),
                o.getObservacion(),o.getFechaCita(),o.getAuditoriaUsuario(),o.getIdDesicionProcesoSeleccion(),
                o.getDetalleCorreo()
        ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccion o) {
        procesoSeleccionRefactorRepository.save(
                new ProcesoSeleccion(
                        o.getIdProcesoSeleccion(),o.getIdProcesoPaso(),o.getIdEstadoDiligenciado(),o.getIdResponsable(),
                        o.getIdTerceroPublicacion(),o.getObservacion(),o.getFechaCita(),o.getAuditoriaUsuario(),
                        o.getIdDesicionProcesoSeleccion(),o.getDetalleCorreo()
                ));
    }

}
