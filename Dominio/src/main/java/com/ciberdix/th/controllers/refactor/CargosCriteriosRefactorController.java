package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.CargosCriterios;
import com.ciberdix.th.repositories.refactor.CargosCriteriosRefactorRepository;
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

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    CargosCriterios findOne(@PathVariable Integer id) {
        return cargosCriteriosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosCriterios create(@RequestBody CargosCriterios obj) {
        return cargosCriteriosRefactorRepository.save(
                new CargosCriterios(obj.getIdCriterio(), obj.getIdCargo(), obj.getAuditoriaUsuario(), obj.getDescripcion(), obj.getMeta(), obj.getFactor(), obj.getIndicadorHabilitado())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosCriterios obj) {
        cargosCriteriosRefactorRepository.save(obj);
    }
}
