package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.CargosProductividades;
import com.ciberdix.th.repositories.refactor.CargosProductividadesRefactorRepository;
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
@RequestMapping("/api/cargosProductividades")
public class CargosProductividadesController {
    @Autowired
    private CargosProductividadesRefactorRepository cargosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<CargosProductividades> findAll() {
        return (List<CargosProductividades>) cargosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{id}")
    CargosProductividades findOne(@PathVariable Integer id) {
        return cargosRefactorRepository.findByIdCargo(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosProductividades create(@RequestBody CargosProductividades obj) {
        return cargosRefactorRepository.save(
                new CargosProductividades(obj.getIdCargo(), obj.getIdProductividad(), obj.getIdProductividadIq(), obj.getIdProductividadAptitud(), obj.getAuditoriaUsuario())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosProductividades obj) {
        cargosRefactorRepository.save(obj);
    }
}
