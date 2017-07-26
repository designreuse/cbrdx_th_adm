package com.ciberdix.th.controllers;

import com.ciberdix.th.models.NovedadesCampos;
import com.ciberdix.th.models.VNovedadesCampos;
import com.ciberdix.th.repositories.NovedadesCamposRefactorRepository;
import com.ciberdix.th.repositories.VNovedadesCamposRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/novedadesCampos")
public class NovedadesCamposRefactorController {

    @Autowired
    private NovedadesCamposRefactorRepository novedadesCamposRefactorRepository;

    @Autowired
    private VNovedadesCamposRefactorRepository vNovedadesCamposRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VNovedadesCampos> findAll() {
        return (List<VNovedadesCampos>) vNovedadesCamposRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VNovedadesCampos> findEnabled() {
        return vNovedadesCamposRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/novedad/{id}")
    List<VNovedadesCampos> findByIdNovedad(@PathVariable Integer id) {
        return vNovedadesCamposRefactorRepository.findAllByIdNovedad(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/campoNovedad/{id}")
    List<VNovedadesCampos> findByIdCampoNovedad(@PathVariable Integer id) {
        return vNovedadesCamposRefactorRepository.findAllByIdCampoNovedad(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VNovedadesCampos findOne(@PathVariable Integer id) {
        return vNovedadesCamposRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    NovedadesCampos create(@RequestBody NovedadesCampos o) {
        return novedadesCamposRefactorRepository.save(
                new NovedadesCampos(
                        o.getIdNovedad(),o.getIdCampoNovedad(),o.getIndicadorObligatorio(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody NovedadesCampos o) {
        novedadesCamposRefactorRepository.save(
                new NovedadesCampos(
                        o.getIdNovedadCampo(),o.getIdNovedad(),o.getIdCampoNovedad(),o.getIndicadorObligatorio(),
                        o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

}
