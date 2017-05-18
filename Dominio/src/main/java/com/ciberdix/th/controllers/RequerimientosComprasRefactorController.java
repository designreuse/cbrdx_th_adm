package com.ciberdix.th.controllers;

import com.ciberdix.th.models.RequerimientosCompras;
import com.ciberdix.th.models.VRequerimientosCompras;
import com.ciberdix.th.repositories.RequerimientosComprasRefactorRepository;
import com.ciberdix.th.repositories.VRequerimientosComprasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 17/05/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/requerimientosCompras")
public class RequerimientosComprasRefactorController {

    @Autowired
    private RequerimientosComprasRefactorRepository requerimientosComprasRefactorRepository;

    @Autowired
    private VRequerimientosComprasRefactorRepository vRequerimientosComprasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientosCompras> findAll() {
        return (List<VRequerimientosCompras>) vRequerimientosComprasRefactorRepository.findAll();
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VRequerimientosCompras findOne(@PathVariable Integer id) {
        return vRequerimientosComprasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/requerimiento/{idRequerimiento}")
    List<VRequerimientosCompras> findByIdRequerimiento(@PathVariable Integer idRequerimiento) {
        return vRequerimientosComprasRefactorRepository.findByIdRequerimientoAndIndicadorHabilitadoIsTrue(idRequerimiento);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosCompras create(@RequestBody RequerimientosCompras o) {
        return requerimientosComprasRefactorRepository.save(

                new RequerimientosCompras(o.getIdRequerimiento(),o.getIdCompra(),
                        o.getAuditoriaUsuario(),o.getIndicadorHabilitado())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosCompras o) {
        requerimientosComprasRefactorRepository.save(o);
    }

}
