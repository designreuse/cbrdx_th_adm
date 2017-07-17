package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProcesoSeleccionPruebasTecnicas;
import com.ciberdix.th.models.VProcesoSeleccionPruebasTecnicas;
import com.ciberdix.th.repositories.ProcesoSeleccionPruebasTecnicasRefactorRepository;
import com.ciberdix.th.repositories.VProcesoSeleccionPruebasTecnicasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/procesoSeleccionPruebasTecnicas")
public class ProcesoSeleccionPruebasTecnicasRefactorController {
    @Autowired
    private ProcesoSeleccionPruebasTecnicasRefactorRepository procesoSeleccionPruebasTecnicasRefactorRepository;

    @Autowired
    private VProcesoSeleccionPruebasTecnicasRefactorRepository vProcesoSeleccionPruebasTecnicasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VProcesoSeleccionPruebasTecnicas> findAll() {
        return (List<VProcesoSeleccionPruebasTecnicas>) vProcesoSeleccionPruebasTecnicasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idProcesoSeleccionPruebasTecnicas}")
    VProcesoSeleccionPruebasTecnicas findOne(@PathVariable Integer idProcesoSeleccionPruebasTecnicas) {
        return vProcesoSeleccionPruebasTecnicasRefactorRepository.findOne(idProcesoSeleccionPruebasTecnicas);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProcesoSeleccionPruebasTecnicas> findByIndicadorHabTrue() {
        return vProcesoSeleccionPruebasTecnicasRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/procesoSeleccion/{id}")
    List<VProcesoSeleccionPruebasTecnicas> findByIdProcesoSeleccion(@PathVariable Integer id) {
        return vProcesoSeleccionPruebasTecnicasRefactorRepository.findAllByIdProcesoSeleccion(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/pruebaTecnica/{id}")
    List<VProcesoSeleccionPruebasTecnicas> findByIdPruebaTecnica(@PathVariable Integer id) {
        return vProcesoSeleccionPruebasTecnicasRefactorRepository.findAllByIdPruebaTecnica(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProcesoSeleccionPruebasTecnicas create(@RequestBody ProcesoSeleccionPruebasTecnicas o) {
        return procesoSeleccionPruebasTecnicasRefactorRepository.save(new ProcesoSeleccionPruebasTecnicas(
                o.getIdProcesoSeleccion(),o.getIdPruebaTecnica(),
                o.getIndicadorRealiza(),o.getNota(),o.getObservacion(),o.getIdAdjunto(),o.getIndicadorHabilitado(),
                o.getAuditoriaUsuario()
        ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProcesoSeleccionPruebasTecnicas o) {
        procesoSeleccionPruebasTecnicasRefactorRepository.save(
                new ProcesoSeleccionPruebasTecnicas(
                        o.getIdProcesoSeleccionPruebaTecnica(),o.getIdProcesoSeleccion(),o.getIdPruebaTecnica(),
                        o.getIndicadorRealiza(),o.getNota(),o.getObservacion(),o.getIdAdjunto(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                ));
    }
}
