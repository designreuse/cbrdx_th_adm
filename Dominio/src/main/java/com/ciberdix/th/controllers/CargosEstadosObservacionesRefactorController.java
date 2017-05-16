package com.ciberdix.th.controllers;

import com.ciberdix.th.models.CargosEstadosObservaciones;
import com.ciberdix.th.repositories.CargosEstadosObservacionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosEstadosObservaciones")
public class CargosEstadosObservacionesRefactorController {
    @Autowired
    private CargosEstadosObservacionesRefactorRepository cargosEstadosObservacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<CargosEstadosObservaciones> findAll() {
        return (List<CargosEstadosObservaciones>) cargosEstadosObservacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    CargosEstadosObservaciones findOne(@PathVariable Integer id) {
        return cargosEstadosObservacionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<CargosEstadosObservaciones> findByIdCargo(@PathVariable Integer id) {
        return cargosEstadosObservacionesRefactorRepository.findByIdCargo(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosEstadosObservaciones create (@RequestBody CargosEstadosObservaciones obj){
        return cargosEstadosObservacionesRefactorRepository.save(
                new CargosEstadosObservaciones(obj.getIdCargo(),obj.getIdEstadoCargo(),
                        obj.getObservacion(),obj.getIdUsuario(),obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosEstadosObservaciones obj) {
        cargosEstadosObservacionesRefactorRepository.save(obj);
    }
}
