package com.ciberdix.th.controllers;

import com.ciberdix.th.models.NovedadesAccidentes;
import com.ciberdix.th.models.VNovedadesAccidentes;
import com.ciberdix.th.repositories.NovedadesAccidentesRefactorRepository;
import com.ciberdix.th.repositories.VNovedadesAccidentesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/novedadesAccidentes")
public class NovedadesAccidentesRefactorController {

    @Autowired
    private NovedadesAccidentesRefactorRepository novedadesAccidentesRefactorRepository;

    @Autowired
    private VNovedadesAccidentesRefactorRepository vNovedadesAccidentesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VNovedadesAccidentes> findAll() {
        return (List<VNovedadesAccidentes>) vNovedadesAccidentesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VNovedadesAccidentes> findEnabled() {
        return vNovedadesAccidentesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/terceroNovedad/{id}")
    List<VNovedadesAccidentes> findByIdGrupoDotacion(@PathVariable Integer id) {
        return vNovedadesAccidentesRefactorRepository.findAllByIdTerceroNovedad(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VNovedadesAccidentes findOne(@PathVariable Integer id) {
        return vNovedadesAccidentesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    NovedadesAccidentes create(@RequestBody NovedadesAccidentes o) {
        return novedadesAccidentesRefactorRepository.save(
                new NovedadesAccidentes(
                        o.getIdTerceroNovedad(),o.getIdEstadoAccidente(),
                        o.getIndicadorActividades(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody NovedadesAccidentes o) {
        novedadesAccidentesRefactorRepository.save(
                new NovedadesAccidentes(
                        o.getIdNovedadAccidente(),o.getIdTerceroNovedad(),o.getIdEstadoAccidente(),
                        o.getIndicadorActividades(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
