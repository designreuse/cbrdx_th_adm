package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Listas;
import com.ciberdix.th.repositories.refactor.ListasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/listas")
@CrossOrigin
public class ListasRefactorController {

    @Autowired
    private ListasRefactorRepository listasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Listas> findAll() {
        return (List<Listas>) listasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{id}")
    Listas findOne(@PathVariable Integer id) {
        return listasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    Listas update(@RequestBody Listas listas) {
        return listasRefactorRepository.save(listas);
    }
}
