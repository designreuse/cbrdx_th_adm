package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TercerosFamiliaresEntity;
import com.ciberdix.th.models.VTercerosFamiliaresEntity;
import com.ciberdix.th.repositories.VTercerosFamiliaresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@CrossOrigin
@RequestMapping("/Vfamily")
public class VTercerosFamiliaresController {

    @Autowired
    private VTercerosFamiliaresRepository tercerosFamiliaresRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosFamiliaresEntity> getLists() {
        return (List<VTercerosFamiliaresEntity>) tercerosFamiliaresRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/employee/{employe}")
    List<VTercerosFamiliaresEntity> getLists1(@PathVariable Long employe) {
        return   tercerosFamiliaresRepository.findByIdTercero(employe);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosFamiliaresEntity findList(@PathVariable Integer id) {
        return tercerosFamiliaresRepository.findByIdTerceroFamiliar(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/habilitated")
    List<VTercerosFamiliaresEntity> getListsHabilitated() {
        return   tercerosFamiliaresRepository.findByIndicadorHabilitado(true);

    }

    @RequestMapping(method = RequestMethod.GET, path = "/habilitated/{employee}")
    List<VTercerosFamiliaresEntity> getListsEmployeeHabilitated(@PathVariable Long employee) {
        return   tercerosFamiliaresRepository.findByIdTerceroAndIndicadorHabilitado(employee, true);

    }


}
