package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Respuestas;
import com.ciberdix.th.models.Respuestas;
import com.ciberdix.th.repositories.RespuestasRefactorRepository;
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
@RequestMapping("/api/respuestas")
public class RespuestasRefactorController {

    @Autowired
    private RespuestasRefactorRepository respuestasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Respuestas> findAll() {
        return (List<Respuestas>) respuestasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Respuestas findOne(@PathVariable Integer id) {
        return respuestasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Respuestas create(@RequestBody Respuestas o) {
        return respuestasRefactorRepository.save(
                new Respuestas(
                        o.getIdCuestionarioPregunta(),o.getIdPreguntaOpcion(),o.getRespuesta(),
                        o.getOrden(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Respuestas o) {
        respuestasRefactorRepository.save(
                new Respuestas(
                        o.getIdRespuesta(),o.getIdCuestionarioPregunta(),o.getIdPreguntaOpcion(),o.getRespuesta(),
                        o.getOrden(),o.getAuditoriaUsuario()
                )
        );
    }

}