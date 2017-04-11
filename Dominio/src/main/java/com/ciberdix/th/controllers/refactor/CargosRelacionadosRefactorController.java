package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.CargosRelacionados;
import com.ciberdix.th.repositories.refactor.CargosRelacionadosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosRelacionados")
public class CargosRelacionadosRefactorController {
    @Autowired
    private CargosRelacionadosRefactorRepository CargosRelacionadosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<CargosRelacionados> findAll() {
        return (List<CargosRelacionados>) CargosRelacionadosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarRelacion/{codigoRelacion}/{idCargo}")
    List<CargosRelacionados> findEnabled(@PathVariable String codigoRelacion, @PathVariable Integer idCargo) {
        return (List<CargosRelacionados>) CargosRelacionadosRefactorRepository.findCargos(codigoRelacion, idCargo);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosRelacionados create(@RequestBody CargosRelacionados obj) {
        return CargosRelacionadosRefactorRepository.save(new CargosRelacionados());
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosRelacionados obj) {
        CargosRelacionadosRefactorRepository.save(obj);
    }
}
