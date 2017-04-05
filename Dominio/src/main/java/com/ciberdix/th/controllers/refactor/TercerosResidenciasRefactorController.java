package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.TercerosResidencias;
import com.ciberdix.th.repositories.refactor.TercerosResidenciasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/tercerosResidencias")
@CrossOrigin
public class TercerosResidenciasRefactorController {

    @Autowired
    private TercerosResidenciasRefactorRepository TercerosResidenciasRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosResidencias> listarTercerosResidencias() {
        return (List<TercerosResidencias>) TercerosResidenciasRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{id}")
    TercerosResidencias parent(@PathVariable Integer id) {
        return TercerosResidenciasRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosResidencias crearActividadEconomica(@RequestBody TercerosResidencias obj) {
        return TercerosResidenciasRepository.save(obj);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarActividadEconomica(@RequestBody TercerosResidencias obj) {
        TercerosResidenciasRepository.save(obj);
    }
}
