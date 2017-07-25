package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProyeccionDotacionEstructuraOrganizacional;
import com.ciberdix.th.repositories.ProyeccionDotacionEstructuraOrganizacionalRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/proyeccionDotacionEstructuraOrganizacional")
public class ProyeccionDotacionEstructuraOrganizacionalRefactorController {

    @Autowired
    private ProyeccionDotacionEstructuraOrganizacionalRefactorRepository proyeccionDotacionEstructuraOrganizacionalRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ProyeccionDotacionEstructuraOrganizacional> findAll() {
        return (List<ProyeccionDotacionEstructuraOrganizacional>) proyeccionDotacionEstructuraOrganizacionalRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ProyeccionDotacionEstructuraOrganizacional findOne(@PathVariable Integer id) {
        return proyeccionDotacionEstructuraOrganizacionalRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ProyeccionDotacionEstructuraOrganizacional create(@RequestBody ProyeccionDotacionEstructuraOrganizacional o) {
        return proyeccionDotacionEstructuraOrganizacionalRefactorRepository.save(
                new ProyeccionDotacionEstructuraOrganizacional(
                        o.getIdProyeccionDotacion(),
                        o.getIdEstructuraOrganizacional(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody ProyeccionDotacionEstructuraOrganizacional o) {
        proyeccionDotacionEstructuraOrganizacionalRefactorRepository.save(
                new ProyeccionDotacionEstructuraOrganizacional(
                        o.getIdProyeccionDotacionEstructuraOrganizacional(),o.getIdProyeccionDotacion(),
                        o.getIdEstructuraOrganizacional(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
