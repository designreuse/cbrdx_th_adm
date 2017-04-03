package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Constantes;
import com.ciberdix.th.models.refactor.VConstantes;
import com.ciberdix.th.repositories.refactor.ConstantesRefactorRepository;
import com.ciberdix.th.repositories.refactor.VConstantesRefactorRepository;
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
    Constantes parent(@PathVariable Integer id) {
        return ConstantesRepository.findOne(id);
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
