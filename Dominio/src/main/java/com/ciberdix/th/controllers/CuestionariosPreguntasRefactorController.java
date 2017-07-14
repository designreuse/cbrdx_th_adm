package com.ciberdix.th.controllers;

import com.ciberdix.th.models.CuestionariosPreguntas;
import com.ciberdix.th.models.VCuestionariosPreguntas;
import com.ciberdix.th.repositories.CuestionariosPreguntasRefactorRepository;
import com.ciberdix.th.repositories.VCuestionariosPreguntasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 9/07/2017.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cuestionariosPreguntas")
public class CuestionariosPreguntasRefactorController {
    @Autowired
    private CuestionariosPreguntasRefactorRepository cuestionariosPreguntasRefactorRepository;

    @Autowired
    private VCuestionariosPreguntasRefactorRepository vCuestionariosPreguntasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VCuestionariosPreguntas> findAll() {
        return (List<VCuestionariosPreguntas>) vCuestionariosPreguntasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VCuestionariosPreguntas> findEnabled() {
        return vCuestionariosPreguntasRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VCuestionariosPreguntas findOne(@PathVariable Integer id) {
        return vCuestionariosPreguntasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCuestionario/{id}")
    List<VCuestionariosPreguntas> findByIdCuestionario(@PathVariable Integer id) {
        return vCuestionariosPreguntasRefactorRepository.findAllByIdCuestionario(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/buscarCuestionario/{id}")
    List<VCuestionariosPreguntas> findByIdCuestionarioAndIndicadorHabTrue(@PathVariable Integer id) {
        return vCuestionariosPreguntasRefactorRepository.findAllByIdCuestionarioAndIndicadorHabilitadoIsTrue(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CuestionariosPreguntas create(@RequestBody CuestionariosPreguntas o) {
        return cuestionariosPreguntasRefactorRepository.save(
                new CuestionariosPreguntas(
                        o.getIdCuestionario(),o.getCodigoPregunta(),o.getPregunta(),
                        o.getIdTipoPregunta(),o.getIndicadorDepende(),o.getIdDependePregunta(),o.getIdDependeRespuesta(),
                        o.getSecuencia(),o.getIndicadorFiltrante(),o.getIndicadorObligatorio(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CuestionariosPreguntas o) {
        cuestionariosPreguntasRefactorRepository.save(
                new CuestionariosPreguntas(
                        o.getIdCuestionarioPregunta(),o.getIdCuestionario(),o.getCodigoPregunta(),o.getPregunta(),
                        o.getIdTipoPregunta(),o.getIndicadorDepende(),o.getIdDependePregunta(),o.getIdDependeRespuesta(),
                        o.getSecuencia(),o.getIndicadorFiltrante(),o.getIndicadorObligatorio(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }
}
