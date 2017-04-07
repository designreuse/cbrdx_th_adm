package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.VCargos;
import com.ciberdix.th.repositories.refactor.CargosRefactorRepository;
import com.ciberdix.th.repositories.refactor.VCargosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargos")
public class CargosRefactorController {
    @Autowired
    private CargosRefactorRepository cargosRefactorRepository;

    @Autowired
    private VCargosRefactorRepository vCargosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VCargos> findAll(){
        return (List<VCargos>) vCargosRefactorRepository.findAll();
    }
}
