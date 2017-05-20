package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Constantes;
import com.ciberdix.th.models.VConstantes;
import com.ciberdix.th.repositories.ConstantesRefactorRepository;
import com.ciberdix.th.repositories.VConstantesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/constantes")
@CrossOrigin
public class ConstantesRefactorController {

    @Autowired
    private ConstantesRefactorRepository ConstantesRepository;

    @Autowired
    private VConstantesRefactorRepository vConstantesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VConstantes> listarConstantes() {
        return (List<VConstantes>) vConstantesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VConstantes parent(@PathVariable Integer id) {
        return vConstantesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codigo/{codigo}")
    VConstantes findByCod(@PathVariable String codigo) {
        return vConstantesRefactorRepository.findAllByConstante(codigo);
    }

    @RequestMapping(method = RequestMethod.POST)
    Constantes crearActividadEconomica(@RequestBody Constantes constantes) {
        return ConstantesRepository.save(new Constantes(constantes.getConstante(), constantes.getIdTipoDato(), constantes.getValor(), constantes.getDescripcion(), constantes.getIndicadorHabilitado(), constantes.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarActividadEconomica(@RequestBody Constantes constantes) {
        ConstantesRepository.save(constantes);
    }
}
