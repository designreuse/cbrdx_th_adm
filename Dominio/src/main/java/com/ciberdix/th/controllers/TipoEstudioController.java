package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TipoEstudioEntity;
import com.ciberdix.th.repositories.TipoEstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/studytype")
public class TipoEstudioController {

    @Autowired
    private TipoEstudioRepository tipoEstudioRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TipoEstudioEntity> getLists() {
        return (List<TipoEstudioEntity>) tipoEstudioRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    TipoEstudioEntity findList(@PathVariable Integer idLista) {
        return tipoEstudioRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    TipoEstudioEntity createList(@RequestBody TipoEstudioEntity c) {
        return tipoEstudioRepository.save(new TipoEstudioEntity(c.getIdListaTipoEstudios(),c.getCodigoListaTipoEstudios(),c.getNombreListaTipoEstudios(),c.getOrdenListaTipoEstudios(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TipoEstudioEntity updateList(@RequestBody TipoEstudioEntity centrosCostosEntity) {
        return tipoEstudioRepository.save(centrosCostosEntity);
    }
}
