package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Ponderaciones;
import com.ciberdix.th.repositories.refactor.PonderacionesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/ponderaciones")
public class PonderacionesRefactorController {
    @Autowired
    private PonderacionesRefactorRepository PonderacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Ponderaciones> findAll() {
        return (List<Ponderaciones>) PonderacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<Ponderaciones> findEnabled() {
        return (List<Ponderaciones>) PonderacionesRefactorRepository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    Ponderaciones create(@RequestBody Ponderaciones obj) {
        return PonderacionesRefactorRepository.save(new Ponderaciones(obj.getPonderacion(), obj.getMinimo(), obj.getMaximo(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Ponderaciones obj) {
        PonderacionesRefactorRepository.save(obj);
    }
}
