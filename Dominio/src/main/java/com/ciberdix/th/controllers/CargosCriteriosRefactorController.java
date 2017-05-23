package com.ciberdix.th.controllers;

import com.ciberdix.th.models.CargosCriterios;
import com.ciberdix.th.repositories.CargosCriteriosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosCriterios")
public class CargosCriteriosRefactorController {
    @Autowired
    private CargosCriteriosRefactorRepository cargosCriteriosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<CargosCriterios> findAll() {
        return (List<CargosCriterios>) cargosCriteriosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/{id}")
    List<CargosCriterios> findEnabled(@PathVariable Integer id) {
        return (List<CargosCriterios>) cargosCriteriosRefactorRepository.findByIndicadorHabilitadoTrueAndIdCargoEquals(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<CargosCriterios> findByIdCargo(@PathVariable Integer id) {
        return (List<CargosCriterios>) cargosCriteriosRefactorRepository.findByIndicadorHabilitadoIsTrueAndIdCargo(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosCriterios[] create(@RequestBody CargosCriterios[] objetos) {
        CargosCriterios[] salida = new CargosCriterios[objetos.length];
        cargosCriteriosRefactorRepository.updateChecks(objetos[0].getIdCargo());
        for (int i = 0; i < objetos.length; i++) {
            CargosCriterios obj = objetos[i];
            salida[i] = cargosCriteriosRefactorRepository.save(new CargosCriterios(obj.getIdCriterio(), obj.getIdCargo(), obj.getAuditoriaUsuario(), obj.getDescripcion(), obj.getMeta(), obj.getFactor(), obj.getIndicadorHabilitado()));
        }
        return salida;
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosCriterios o) {
        cargosCriteriosRefactorRepository.save(
                new CargosCriterios(o.getIdCargoCriterio(),o.getIdCriterio(), o.getIdCargo(), o.getAuditoriaUsuario(),
                        o.getDescripcion(), o.getMeta(), o.getFactor(), o.getIndicadorHabilitado())
        );
    }
}
