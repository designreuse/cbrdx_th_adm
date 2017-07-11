package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Respuestas;
import com.ciberdix.th.models.VRespuestas;
import com.ciberdix.th.repositories.RespuestasRefactorRepository;
import com.ciberdix.th.repositories.VRespuestasRefactorRepository;
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

    @Autowired
    private VRespuestasRefactorRepository vRespuestasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VRespuestas> findAll() {
        return (List<VRespuestas>) vRespuestasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRespuestas findOne(@PathVariable Integer id) {
        return vRespuestasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/maestroRespuesta/{id}")
    List<VRespuestas> findByIdMaestroRespuesta(@PathVariable Integer id) {
        return vRespuestasRefactorRepository.findAllByIdMaestroRespuesta(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Respuestas create(@RequestBody Respuestas o) {
        return respuestasRefactorRepository.save(
                new Respuestas(
                        o.getIdCuestionarioPregunta(),o.getIdPreguntaOpcion(),o.getRespuesta(),
                        o.getAuditoriaUsuario(),o.getIdMaestroRespuesta()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Respuestas o) {
        respuestasRefactorRepository.save(
                new Respuestas(
                        o.getIdRespuesta(),o.getIdCuestionarioPregunta(),o.getIdPreguntaOpcion(),o.getRespuesta(),
                        o.getAuditoriaUsuario(),o.getIdMaestroRespuesta()
                )
        );
    }

}
