package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.repositories.refactor.TercerosVehiculosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by robertochajin on 4/04/17.
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/tercerosVehiculos")
public class TercerosVehiculosRefactorController {
    @Autowired
    private TercerosVehiculosRefactorRepository tercerosVehiculosRefactorRepository;

    
}
