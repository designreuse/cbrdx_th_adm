package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ProyeccionDotacionEstructuraOrganizacional;
import com.ciberdix.th.models.VProyeccionDotacionEstructuraOrganizacional;
import com.ciberdix.th.repositories.ProyeccionDotacionEstructuraOrganizacionalRefactorRepository;
import com.ciberdix.th.repositories.VProyeccionDotacionEstructuraOrganizacionalRefactorRepository;
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

    @Autowired
    private VProyeccionDotacionEstructuraOrganizacionalRefactorRepository vProyeccionDotacionEstructuraOrganizacionalRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VProyeccionDotacionEstructuraOrganizacional> findAll() {
        return (List<VProyeccionDotacionEstructuraOrganizacional>) vProyeccionDotacionEstructuraOrganizacionalRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VProyeccionDotacionEstructuraOrganizacional findOne(@PathVariable Integer id) {
        return vProyeccionDotacionEstructuraOrganizacionalRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VProyeccionDotacionEstructuraOrganizacional> findEnabled() {
        return vProyeccionDotacionEstructuraOrganizacionalRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/proyeccionDotacion/{id}")
    List<VProyeccionDotacionEstructuraOrganizacional> findByIdProeccionDotacion(@PathVariable Integer id) {
        return vProyeccionDotacionEstructuraOrganizacionalRefactorRepository.findAllByIdProyeccionDotacion(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/estructuraOrganizacional/{id}")
    List<VProyeccionDotacionEstructuraOrganizacional> findByIdEstructuraOrganizacional(@PathVariable Integer id) {
        return vProyeccionDotacionEstructuraOrganizacionalRefactorRepository.findAllByIdEstructuraOrganizacional(id);
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
