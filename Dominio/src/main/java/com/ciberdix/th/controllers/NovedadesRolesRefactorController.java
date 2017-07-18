package com.ciberdix.th.controllers;

import com.ciberdix.th.models.NovedadesRoles;
import com.ciberdix.th.models.VNovedadesRoles;
import com.ciberdix.th.repositories.NovedadesRolesRefactorRepository;
import com.ciberdix.th.repositories.VNovedadesRolesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/novedadesRoles")
public class NovedadesRolesRefactorController {

    @Autowired
    private NovedadesRolesRefactorRepository novedadesRolesRefactorRepository;

    @Autowired
    private VNovedadesRolesRefactorRepository vNovedadesRolesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VNovedadesRoles> findAll() {
        return (List<VNovedadesRoles>) vNovedadesRolesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VNovedadesRoles> findEnabled() {
        return vNovedadesRolesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/novedad/{id}")
    List<VNovedadesRoles> findByIdNovedad(@PathVariable Integer id) {
        return vNovedadesRolesRefactorRepository.findAllByIdNovedad(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/rol/{id}")
    List<VNovedadesRoles> findByIdRol(@PathVariable Integer id) {
        return vNovedadesRolesRefactorRepository.findAllByIdRol(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VNovedadesRoles findOne(@PathVariable Integer id) {
        return vNovedadesRolesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    NovedadesRoles create(@RequestBody NovedadesRoles o) {
        return novedadesRolesRefactorRepository.save(
                new NovedadesRoles(
                        o.getIdNovedad(),o.getIdRol(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody NovedadesRoles o) {
        novedadesRolesRefactorRepository.save(
                new NovedadesRoles(
                        o.getIdNovedadesRoles(),o.getIdNovedad(),o.getIdRol(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
