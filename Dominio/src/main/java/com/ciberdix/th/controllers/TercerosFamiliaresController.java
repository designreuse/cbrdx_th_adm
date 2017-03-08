package com.ciberdix.th.controllers;

import com.ciberdix.th.models.EstructuraAreasEntity;
import com.ciberdix.th.models.TercerosFamiliaresEntity;
import com.ciberdix.th.repositories.TercerosFamiliaresRepository;
import com.ciberdix.th.repositories.TipoAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/family")
public class TercerosFamiliaresController {

    @Autowired
    private TercerosFamiliaresRepository tercerosFamiliaresRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TercerosFamiliaresEntity> getLists() {
        return (List<TercerosFamiliaresEntity>) tercerosFamiliaresRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    TercerosFamiliaresEntity findList(@PathVariable Integer idLista) {
        return tercerosFamiliaresRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosFamiliaresEntity createList(@RequestBody TercerosFamiliaresEntity c) {
        return tercerosFamiliaresRepository.save(new TercerosFamiliaresEntity(c.getIdTercerosFamiliar(),c.getIdTerceros(),c.getIdFamiliar(),c.getIdParentezco(),c.getIdConvivencia(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TercerosFamiliaresEntity updateList(@RequestBody TercerosFamiliaresEntity centrosCostosEntity) {
        return tercerosFamiliaresRepository.save(centrosCostosEntity);
    }
}
