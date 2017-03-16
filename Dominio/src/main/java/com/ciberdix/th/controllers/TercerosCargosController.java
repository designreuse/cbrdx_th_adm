package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosCargosEntity;
import com.ciberdix.th.repositories.TercerosCargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/chargeEmployees")
public class TercerosCargosController {

    @Autowired
    private TercerosCargoRepository tercerosCargoRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    TercerosCargosEntity verConstante1(@PathVariable Integer IdParametro) {
        long time = System.currentTimeMillis();
        java.sql.Timestamp timestamp = new java.sql.Timestamp(time);
        return tercerosCargoRepository.findByIdTerceroAndFechaInicioLessThanAndFechaFinGreaterThan(IdParametro,timestamp,timestamp);
    }


}
