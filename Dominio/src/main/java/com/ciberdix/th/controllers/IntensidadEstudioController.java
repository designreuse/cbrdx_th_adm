package com.ciberdix.th.controllers;

import com.ciberdix.th.models.IntensidadEstudioEntity;
import com.ciberdix.th.repositories.IntensidadEstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/studyintensity")
public class IntensidadEstudioController {

    @Autowired
    private IntensidadEstudioRepository intensidadEstudioRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<IntensidadEstudioEntity> getLists() {
        return (List<IntensidadEstudioEntity>) intensidadEstudioRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    IntensidadEstudioEntity findList(@PathVariable Integer idLista) {
        return intensidadEstudioRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    IntensidadEstudioEntity createList(@RequestBody IntensidadEstudioEntity c) {
        return intensidadEstudioRepository.save(new IntensidadEstudioEntity(c.getIdListaIntensidad(),c.getCodigoListaIntensidad(),c.getNombreListaIntensidad(),c.getOrdenListaIntensidad(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    IntensidadEstudioEntity updateList(@RequestBody IntensidadEstudioEntity centrosCostosEntity) {
        return intensidadEstudioRepository.save(centrosCostosEntity);
    }
}
