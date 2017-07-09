package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Preguntas;
import com.ciberdix.th.models.VPreguntas;
import com.ciberdix.th.repositories.PreguntasRefactorRepository;
import com.ciberdix.th.repositories.VPreguntasRefactorRepository;
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
@RequestMapping("/api/preguntas")
public class PreguntasRefactorController {

    @Autowired
    private PreguntasRefactorRepository preguntasRefactorRepository;

    @Autowired
    private VPreguntasRefactorRepository vPreguntasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VPreguntas> findAll() {
        return (List<VPreguntas>) vPreguntasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VPreguntas> findEnabled() {
        return vPreguntasRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VPreguntas findOne(@PathVariable Integer id) {
        return vPreguntasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCuestionario/{id}")
    List<VPreguntas> findByIdCuestionario(@PathVariable Integer id) {
        return vPreguntasRefactorRepository.findAllByIdCuestionario(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/buscarCuestionario/{id}")
    List<VPreguntas> findByIdCuestionarioAndIndicadorHabTrue(@PathVariable Integer id) {
        return vPreguntasRefactorRepository.findAllByIdCuestionarioAndIndicadorHabilitadoIsTrue(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Preguntas create(@RequestBody Preguntas o) {
        return preguntasRefactorRepository.save(
                new Preguntas(
                        o.getIdCuestionario(),o.getCodigoPregunta(),o.getPregunta(),o.getIdTipoPregunta(),
                        o.getIndicadorDepende(),o.getIdDependePregunta(),o.getIdDependeRespuesta(),
                        o.getSecuencia(),o.getIndicadorHabilitado(),o.getIndicadorObligatorio(),
                        o.getIndicadorFiltrante(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Preguntas o) {
        preguntasRefactorRepository.save(
                new Preguntas(
                        o.getIdPregunta(),o.getIdCuestionario(),o.getCodigoPregunta(),o.getPregunta(),o.getIdTipoPregunta(),
                        o.getIndicadorDepende(),o.getIdDependePregunta(),o.getIdDependeRespuesta(),
                        o.getSecuencia(),o.getIndicadorHabilitado(),o.getIndicadorObligatorio(),
                        o.getIndicadorFiltrante(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
