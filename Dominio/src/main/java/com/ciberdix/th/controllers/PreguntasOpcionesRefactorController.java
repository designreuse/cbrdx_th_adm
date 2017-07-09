package com.ciberdix.th.controllers;

import com.ciberdix.th.models.PreguntasOpciones;
import com.ciberdix.th.models.VPreguntasOpciones;
import com.ciberdix.th.repositories.PreguntasOpcionesRefactorRepository;
import com.ciberdix.th.repositories.VPreguntasOpcionesRefactorRepository;
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
@RequestMapping("/api/preguntasOpciones")
public class PreguntasOpcionesRefactorController {

    @Autowired
    private PreguntasOpcionesRefactorRepository preguntasOpcionesRefactorRepository;

    @Autowired
    private VPreguntasOpcionesRefactorRepository vPreguntasOpcionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VPreguntasOpciones> findAll() {
        return (List<VPreguntasOpciones>) vPreguntasOpcionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VPreguntasOpciones> findEnabled() {
        return vPreguntasOpcionesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VPreguntasOpciones findOne(@PathVariable Integer id) {
        return vPreguntasOpcionesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPregunta/{id}")
    List<VPreguntasOpciones> findByIdCuestionarioPregunta(@PathVariable Integer id) {
        return vPreguntasOpcionesRefactorRepository.findAllByIdCuestionarioPregunta(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/buscarPregunta/{id}")
    List<VPreguntasOpciones> findByIdCuestionarioPreguntaAndIndicadorHabTrue(@PathVariable Integer id) {
        return vPreguntasOpcionesRefactorRepository.findAllByIdCuestionarioPreguntaAndIndicadorHabilitadoIsTrue(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    PreguntasOpciones create(@RequestBody PreguntasOpciones o) {
        return preguntasOpcionesRefactorRepository.save(new PreguntasOpciones(
                o.getIdCuestionarioPregunta(),o.getCodigoOpcion(),o.getOpcion(),
                o.getOrden(),o.getIndicadorCorrecto(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
        ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody PreguntasOpciones o) {
        preguntasOpcionesRefactorRepository.save(
                new PreguntasOpciones(
                        o.getIdPreguntaOpcion(),o.getIdCuestionarioPregunta(),o.getCodigoOpcion(),o.getOpcion(),
                        o.getOrden(),o.getIndicadorCorrecto(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
