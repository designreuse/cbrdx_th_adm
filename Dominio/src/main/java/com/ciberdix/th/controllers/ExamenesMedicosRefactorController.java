package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ExamenesMedicos;
import com.ciberdix.th.models.VExamenesMedicos;
import com.ciberdix.th.repositories.ExamenesMedicosRefactorRepository;
import com.ciberdix.th.repositories.VExamenesMedicosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 11/07/2017.
 */
@CrossOrigin
@RestController
@Transactional
@RequestMapping("/api/examenesMedicos")
public class ExamenesMedicosRefactorController {

    @Autowired
    private ExamenesMedicosRefactorRepository examenesMedicosRefactorRepository;

    @Autowired
    private VExamenesMedicosRefactorRepository vExamenesMedicosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VExamenesMedicos> getLists() {
        return (List<VExamenesMedicos>) vExamenesMedicosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/procesoSeleccion/{id}")
    VExamenesMedicos getByIdProcesoSeleccion(@PathVariable Integer id) {
        return vExamenesMedicosRefactorRepository.findAllByIdProcesoSeleccion(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VExamenesMedicos findOne(@PathVariable Integer id) {
        return vExamenesMedicosRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ExamenesMedicos createList(@RequestBody ExamenesMedicos o) {
        return examenesMedicosRefactorRepository.save(
                new ExamenesMedicos(
                        o.getIdProcesoSeleccion(),o.getIdEstadoExamenMedico(),
                        o.getCodigoVerificacion(),o.getIndicadorVerificado(),o.getIdMaestroRespuesta(),
                        o.getIdMedicoResponsable(),o.getIdInstitucionMedica(),o.getFechaProgramada(),
                        o.getIdPreguntaOpcion(),o.getIdAdjunto(),o.getAuditoriaUsuario(),o.getIndicadorOtraInstitucion()
                ));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ExamenesMedicos updateList(@RequestBody ExamenesMedicos o) {
        return examenesMedicosRefactorRepository.save(
                new ExamenesMedicos(
                        o.getIdExamenMedico(),o.getIdProcesoSeleccion(),o.getIdEstadoExamenMedico(),
                        o.getCodigoVerificacion(),o.getIndicadorVerificado(),o.getIdMaestroRespuesta(),
                        o.getIdMedicoResponsable(),o.getIdInstitucionMedica(),o.getFechaProgramada(),
                        o.getIdPreguntaOpcion(),o.getIdAdjunto(),o.getAuditoriaUsuario(),o.getIndicadorOtraInstitucion()
                )
        );
    }
    
}
