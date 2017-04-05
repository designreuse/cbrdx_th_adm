package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.DiagnosticosCie;
import com.ciberdix.th.repositories.refactor.DiagnosticosCieRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 4/04/17.
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/diagnosticosCie")
public class DiagnosticosCieRefactorController {
    @Autowired
    private DiagnosticosCieRefactorRepository diagnosticosCieRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<DiagnosticosCie> findAll() {
        return (List<DiagnosticosCie>) diagnosticosCieRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    DiagnosticosCie findOne(@PathVariable Integer id) {
        return diagnosticosCieRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codigoNombre/{query}")
    List<DiagnosticosCie> findByCodigoNombre(@PathVariable String query) {
        return diagnosticosCieRefactorRepository.queryAllDiagnosticosCie(query);
    }

    @RequestMapping(method = RequestMethod.POST)
    DiagnosticosCie create(@RequestBody DiagnosticosCie obj) {
        return diagnosticosCieRefactorRepository.save(new DiagnosticosCie(obj.getCodigo(), obj.getSimbolo(),
                obj.getDescripcion(), obj.getSexo(), obj.getLimiteInferior(), obj.getLimiteSuperior(),
                obj.getNoAfeccion(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody DiagnosticosCie obj) {
        diagnosticosCieRefactorRepository.save(obj);
    }
}
