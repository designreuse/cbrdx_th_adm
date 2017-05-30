package com.ciberdix.th.controllers;

import com.ciberdix.th.models.CargosPersonalidadAtributos;
import com.ciberdix.th.repositories.CargosPersonalidadAtributosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosPersonalidadAtributos")
public class CargosPersonalidadAtributosRefactorController {
    @Autowired
    private CargosPersonalidadAtributosRefactorRepository CargosPersonalidadAtributosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<CargosPersonalidadAtributos> findAll() {
        return (List<CargosPersonalidadAtributos>) CargosPersonalidadAtributosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{idCargo}")
    List<CargosPersonalidadAtributos> findEnabled(@PathVariable Integer idCargo) {
        return (List<CargosPersonalidadAtributos>) CargosPersonalidadAtributosRefactorRepository.findByIdCargo(idCargo);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosPersonalidadAtributos create(@RequestBody CargosPersonalidadAtributos obj) {
        return CargosPersonalidadAtributosRefactorRepository.save(new CargosPersonalidadAtributos(obj.getIdCargo(),
                obj.getIdAtributo(), obj.getDescripcion(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosPersonalidadAtributos obj) {
        CargosPersonalidadAtributosRefactorRepository.save(
                new CargosPersonalidadAtributos(obj.getIdCargoPersonalidadAtributo(),obj.getIdCargo(),
                        obj.getIdAtributo(), obj.getDescripcion(), obj.getAuditoriaUsuario())
        );
    }
}
