package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Cuestionarios;
import com.ciberdix.th.repositories.CuestionariosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 31/05/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cuestionarios")
public class CuestionariosRefactorController {

    @Autowired
    private CuestionariosRefactorRepository cuestionariosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Cuestionarios> findAll() {
        return (List<Cuestionarios>) cuestionariosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<Cuestionarios> findEnabled() {
        return cuestionariosRefactorRepository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{code}")
    Cuestionarios findByCode(@PathVariable String code) {
        return cuestionariosRefactorRepository.findByCodigoCuestionario(code);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Cuestionarios findOne(@PathVariable Integer id) {
        return cuestionariosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Cuestionarios create(@RequestBody Cuestionarios o) {
        return cuestionariosRefactorRepository.save(
                new Cuestionarios(
                        o.getCodigoCuestionario(),o.getCuestionario(),o.getDescripcion(),
                        o.getIndicadorPonderacion(),o.getValor(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Cuestionarios o) {
        cuestionariosRefactorRepository.save(
                new Cuestionarios(
                        o.getIdCuestionario(),o.getCodigoCuestionario(),o.getCuestionario(),o.getDescripcion(),
                        o.getIndicadorPonderacion(),o.getValor(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

}
