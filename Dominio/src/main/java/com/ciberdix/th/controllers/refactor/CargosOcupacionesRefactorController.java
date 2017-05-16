package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.CargosOcupaciones;
import com.ciberdix.th.repositories.CargosOcupacionesRefactorRepository;
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
@RequestMapping("/api/cargosOcupaciones")
public class CargosOcupacionesRefactorController {
    @Autowired
    private CargosOcupacionesRefactorRepository cargosOcupacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<CargosOcupaciones> findAll() {
        return (List<CargosOcupaciones>) cargosOcupacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    CargosOcupaciones findOne(@PathVariable Integer id) {
        return cargosOcupacionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<CargosOcupaciones> findByEnabled() {
        return cargosOcupacionesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{id}")
    List<CargosOcupaciones> findByCargo(@PathVariable Integer id) {
        return cargosOcupacionesRefactorRepository.findByIdCargo(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosOcupaciones create(@RequestBody CargosOcupaciones obj) {
        return cargosOcupacionesRefactorRepository.save(
                new CargosOcupaciones(obj.getIdCargo(), obj.getIdOcupacion(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosOcupaciones obj) {
        cargosOcupacionesRefactorRepository.save(obj);
    }
}
