package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.repositories.refactor.CargosElementosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by robertochajin on 10/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosElementos")
public class CargosElementosRefactorController {
    @Autowired
    private CargosElementosRefactorRepository cargosElementosRefactorRepository;


}
