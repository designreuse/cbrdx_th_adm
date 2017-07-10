package com.ciberdix.th.controllers;

import com.ciberdix.th.models.MaestrosRespuestas;
import com.ciberdix.th.repositories.MaestrosRespuestasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 10/07/2017.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/maestrosRespuestas")
public class MaestrosRespuestasRefactorController {

    @Autowired
    private MaestrosRespuestasRefactorRepository maestrosRespuestasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<MaestrosRespuestas> findAll() {
        return (List<MaestrosRespuestas>) maestrosRespuestasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<MaestrosRespuestas> findEnabled() {
        return maestrosRespuestasRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    MaestrosRespuestas findOne(@PathVariable Integer id) {
        return maestrosRespuestasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cuestionario/{id}")
    List<MaestrosRespuestas> findByIdCuestionario(@PathVariable Integer id) {
        return maestrosRespuestasRefactorRepository.findAllByIdCuestionario(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/preguntaEnCurso/{id}")
    List<MaestrosRespuestas> findByIdPreguntaEnCurso(@PathVariable Integer id) {
        return maestrosRespuestasRefactorRepository.findAllByIdPreguntaEnCurso(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/usuario/{id}")
    List<MaestrosRespuestas> findByIdUsuario(@PathVariable Integer id) {
        return maestrosRespuestasRefactorRepository.findAllByIdUsuario(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    MaestrosRespuestas create(@RequestBody MaestrosRespuestas o) {
        return maestrosRespuestasRefactorRepository.save(
                new MaestrosRespuestas(
                        o.getIdUsuario(),o.getIdCuestionario(),o.getIdPreguntaEnCurso(),
                        o.getIndicadorFinalizado(),o.getIndicadorAprobado(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody MaestrosRespuestas o) {
        maestrosRespuestasRefactorRepository.save(
                new MaestrosRespuestas(
                        o.getIdMaestroRespuesta(),o.getIdUsuario(),o.getIdCuestionario(),o.getIdPreguntaEnCurso(),
                        o.getIndicadorFinalizado(),o.getIndicadorAprobado(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
