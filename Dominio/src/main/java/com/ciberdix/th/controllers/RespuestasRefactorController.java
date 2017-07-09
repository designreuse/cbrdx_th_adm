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

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VRespuestas> findEnabled() {
        return vRespuestasRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRespuestas findOne(@PathVariable Integer id) {
        return vRespuestasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPregunta/{id}")
    List<VRespuestas> findByIdPregunta(@PathVariable Integer id) {
        return vRespuestasRefactorRepository.findAllByIdPregunta(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/buscarPregunta/{id}")
    List<VRespuestas> findByIdPreguntaAndIndicadorHabTrue(@PathVariable Integer id) {
        return vRespuestasRefactorRepository.findAllByIdPreguntaAndIndicadorHabilitadoIsTrue(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Respuestas create(@RequestBody Respuestas o) {
        return respuestasRefactorRepository.save(
                new Respuestas(
                        o.getIdPregunta(),o.getCodigoRespuesta(),o.getRespuesta(),
                        o.getOrden(),o.getIndicadorCorrecto(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Respuestas o) {
        respuestasRefactorRepository.save(
                new Respuestas(
                        o.getIdRespuesta(),o.getIdPregunta(),o.getCodigoRespuesta(),o.getRespuesta(),
                        o.getOrden(),o.getIndicadorCorrecto(),o.getIndicadorHabilitado(),
                        o.getAuditoriaUsuario()
                )
        );
    }

}
