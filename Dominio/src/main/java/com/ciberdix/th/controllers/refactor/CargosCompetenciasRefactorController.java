package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.CargosCompetencias;
import com.ciberdix.th.repositories.refactor.CargosCompetenciasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/cargosCompetencias")
public class CargosCompetenciasRefactorController {
    @Autowired
    private CargosCompetenciasRefactorRepository CargosCompetenciasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<CargosCompetencias> findAll() {
        return (List<CargosCompetencias>) CargosCompetenciasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarCargo/{idCargo}")
    List<CargosCompetencias> findEnabled(@PathVariable Integer idCargo) {
        return (List<CargosCompetencias>) CargosCompetenciasRefactorRepository.findByIdCargo(idCargo);
    }

    @RequestMapping(method = RequestMethod.POST)
    CargosCompetencias create(@RequestBody CargosCompetencias obj) {
        return CargosCompetenciasRefactorRepository.save(new CargosCompetencias(obj.getIdCargo(), obj.getIdCompetencia(), obj.getIdPonderacion(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody CargosCompetencias obj) {
        CargosCompetenciasRefactorRepository.save(obj);
    }
}
