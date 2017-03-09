package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TipoDireccionEntity;
import com.ciberdix.th.repositories.TipoDireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/addresstype")
@CrossOrigin
public class TipoDireccionController {

    @Autowired
    private TipoDireccionRepository tipoDireccionRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TipoDireccionEntity> getLists() {
        return (List<TipoDireccionEntity>) tipoDireccionRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    TipoDireccionEntity findList(@PathVariable Integer idLista) {
        return tipoDireccionRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    TipoDireccionEntity createList(@RequestBody TipoDireccionEntity c) {
        return tipoDireccionRepository.save(new TipoDireccionEntity(c.getValue(),c.getCodigoListaTipoDirecciones(),c.getLabel(),c.getOrdenListaTipoDirecciones(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TipoDireccionEntity updateList(@RequestBody TipoDireccionEntity centrosCostosEntity) {
        return tipoDireccionRepository.save(centrosCostosEntity);
    }
}
