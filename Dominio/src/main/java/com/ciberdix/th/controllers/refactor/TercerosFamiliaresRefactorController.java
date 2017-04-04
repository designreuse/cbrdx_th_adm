package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.TercerosFamiliares;
import com.ciberdix.th.models.refactor.VTercerosFamiliares;
import com.ciberdix.th.repositories.refactor.TercerosFamiliaresRefactorRepository;
import com.ciberdix.th.repositories.refactor.VTercerosFamiliaresRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/tercerosFamiliares")
@CrossOrigin
public class TercerosFamiliaresRefactorController {

    @Autowired
    private TercerosFamiliaresRefactorRepository tercerosFamiliaresRefactorRepository;

    @Autowired
    private VTercerosFamiliaresRefactorRepository vTercerosFamiliaresRefactorRepository;


    @RequestMapping(method = RequestMethod.GET)
    List<TercerosFamiliares> findAll() {
        return (List<TercerosFamiliares>) tercerosFamiliaresRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idTerceroEstudioFormal}")
    VTercerosFamiliares findViewOne(@PathVariable Integer idTerceroEstudioFormal) {
        return vTercerosFamiliaresRefactorRepository.findOne(idTerceroEstudioFormal);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarTercero/{idTercero}")
    List<VTercerosFamiliares> findViewOne(@PathVariable Long idTercero) {
        return vTercerosFamiliaresRefactorRepository.findByIdTerceroAndIndicadorHabilitadoIsTrue(idTercero);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosFamiliares create(@RequestBody TercerosFamiliares tercerosFamiliares) {
        return tercerosFamiliaresRefactorRepository.save(new TercerosFamiliares(tercerosFamiliares.getIdTercero(), tercerosFamiliares.getIdFamiliar(), tercerosFamiliares.getIdParentesco(), tercerosFamiliares.getIdConvivencia(), tercerosFamiliares.getIndicadorHabilitado(), tercerosFamiliares.getAuditoriaUsuario(), tercerosFamiliares.getIdLocalizacion()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosFamiliares update(@RequestBody TercerosFamiliares tercerosFamiliares) {
        return tercerosFamiliaresRefactorRepository.save(new TercerosFamiliares(tercerosFamiliares.getIdTerceroFamiliar(), tercerosFamiliares.getIdTercero(), tercerosFamiliares.getIdFamiliar(), tercerosFamiliares.getIdParentesco(), tercerosFamiliares.getIdConvivencia(), tercerosFamiliares.getIndicadorHabilitado(), tercerosFamiliares.getAuditoriaUsuario(), tercerosFamiliares.getIdLocalizacion()));
    }
}
