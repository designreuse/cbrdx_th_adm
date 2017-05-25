package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Zonas;
import com.ciberdix.th.repositories.ZonasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 18/05/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/zonas")
public class ZonasRefactorController {

    @Autowired
    private ZonasRefactorRepository zonasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Zonas> findAll() {
        return (List<Zonas>) zonasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Zonas findOne(@PathVariable Integer id) {
        return zonasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/byEstrucOrganizacional/{idEstructuraOrganizacional}")
    List<Zonas> findAllByIdEstructuraOrganizacional(@PathVariable Integer idEstructuraOrganizacional) {
        return (List<Zonas>) zonasRefactorRepository.findAllByIdEstructuraOrganizacional(idEstructuraOrganizacional);
    }

    @RequestMapping(method = RequestMethod.POST)
    Zonas create(@RequestBody Zonas o) {
        return zonasRefactorRepository.save(new Zonas(o.getZona(), o.getIndicadorHabilitado(), o.getAuditoriaUsuario(), o.getCodigo(), o.getIdEstructuraOrganizacional()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Zonas o) {
        zonasRefactorRepository.save(
                new Zonas(o.getIdZona(), o.getZona(), o.getIndicadorHabilitado(), o.getAuditoriaUsuario(), o.getCodigo(), o.getIdEstructuraOrganizacional())
        );
    }

}
