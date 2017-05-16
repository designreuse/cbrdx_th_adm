package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.RiesgosTipos;
import com.ciberdix.th.repositories.RiesgosTiposRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/riesgosTipos")
public class RiesgosTiposRefactorController {
    @Autowired
    private RiesgosTiposRefactorRepository riesgosTiposRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<RiesgosTipos> findAll() {
        return (List<RiesgosTipos>) riesgosTiposRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    RiesgosTipos findOne(@PathVariable Integer id) {
        return riesgosTiposRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<RiesgosTipos> findByEnabled (){
        return riesgosTiposRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    RiesgosTipos create(@RequestBody RiesgosTipos obj) {
        return riesgosTiposRefactorRepository.save(
                new RiesgosTipos(obj.getRiesgoTipo(),obj.getIndicadorHabilitado(),
                        obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RiesgosTipos obj) {
        riesgosTiposRefactorRepository.save(obj);
    }
}
