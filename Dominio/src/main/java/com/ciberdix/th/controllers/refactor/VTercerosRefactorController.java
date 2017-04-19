package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.VTerceros;
import com.ciberdix.th.repositories.refactor.VTercerosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/vterceros")
public class VTercerosRefactorController {

    @Autowired
    private VTercerosRefactorRepository vtercerosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTerceros> listarTerceros() {
        return (List<VTerceros>) vtercerosRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    VTerceros listarTercerosPorId(@PathVariable Long id) {
        return vtercerosRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarTerceros/{type}")
    List<VTerceros> listarColaboradores(@PathVariable String type) {
        return vtercerosRepository.findByTypes(type);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/asignarColaborador/")
    List<VTerceros> listarColaboradores() {
        return vtercerosRepository.findByTypes("TERCOL");
    }

}
