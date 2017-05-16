package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.DivisionPoliticaComunas;
import com.ciberdix.th.repositories.DivisionPoliticaComunasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/divisionPoliticaComunas")
public class DivisionPoliticaComunasRefactorController {

    @Autowired
    private DivisionPoliticaComunasRefactorRepository divisionPoliticaComunasRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<DivisionPoliticaComunas> getLists() {
        return (List<DivisionPoliticaComunas>) divisionPoliticaComunasRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    DivisionPoliticaComunas findList(@PathVariable Integer idLista) {
        return divisionPoliticaComunasRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    DivisionPoliticaComunas createList(@RequestBody DivisionPoliticaComunas c) {
        return divisionPoliticaComunasRepository.save(new DivisionPoliticaComunas(c.getDescripcion(), c.getIndicadorHabilitado(), c.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    DivisionPoliticaComunas updateList(@RequestBody DivisionPoliticaComunas centrosCostosEntity) {
        return divisionPoliticaComunasRepository.save(centrosCostosEntity);
    }
}
