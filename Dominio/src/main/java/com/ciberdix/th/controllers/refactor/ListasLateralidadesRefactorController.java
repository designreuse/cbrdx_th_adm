package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasLateralidades;
import com.ciberdix.th.repositories.refactor.ListasLateralidadesRefactorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@Transactional
@RequestMapping("/api/listasLateralidades")
@CrossOrigin
public class ListasLateralidadesRefactorController {

    @Autowired
    private ListasLateralidadesRefactorRepository listasLateralidadesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasLateralidades> findAll() {
        return (List<ListasLateralidades>) listasLateralidadesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasLateralidades findOne(@PathVariable Integer id) {
        return listasLateralidadesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasLateralidades> findEnabled() {
        return (List<ListasLateralidades>) listasLateralidadesRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasLateralidades create(@RequestBody ListasLateralidades listasLateralidades) {
        return listasLateralidadesRefactorRepository.save(listasLateralidades);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ListasLateralidades listasLateralidades) {
        listasLateralidadesRefactorRepository.save(listasLateralidades);
    }
}
