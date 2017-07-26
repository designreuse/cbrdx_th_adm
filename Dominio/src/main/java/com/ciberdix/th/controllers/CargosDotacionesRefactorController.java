package com.ciberdix.th.controllers;

import com.ciberdix.th.models.CargosDotaciones;
import com.ciberdix.th.models.VCargosDotaciones;
import com.ciberdix.th.repositories.CargosDotacionesRefactorRepository;
import com.ciberdix.th.repositories.VCargosDotacionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosDotaciones")
public class CargosDotacionesRefactorController {

    @Autowired
    private CargosDotacionesRefactorRepository cargosDotacionesRefactorRepository;

    @Autowired
    private VCargosDotacionesRefactorRepository vCargosDotacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VCargosDotaciones> findAll() {
        return (List<VCargosDotaciones>) vCargosDotacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCargosDotaciones> findEnabled() {
        return vCargosDotacionesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCargosDotaciones findOne(@PathVariable Integer id) {
        return vCargosDotacionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cargo/{id}")
    List<VCargosDotaciones> findByIdCargo(@PathVariable Integer id) {
        return vCargosDotacionesRefactorRepository.findAllByIdCargo(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/grupoDotacion/{id}")
    List<VCargosDotaciones> findByIdGrupoDotacion(@PathVariable Integer id) {
        return vCargosDotacionesRefactorRepository.findAllByIdGrupoDotacion(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosDotaciones create(@RequestBody CargosDotaciones o) {
        return cargosDotacionesRefactorRepository.save(
                new CargosDotaciones(
                        o.getIdCargo(),o.getIdGrupoDotacion(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosDotaciones o) {
        cargosDotacionesRefactorRepository.save(
                new CargosDotaciones(
                        o.getIdCargoDotacion(),o.getIdCargo(),o.getIdGrupoDotacion(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }
    
}
