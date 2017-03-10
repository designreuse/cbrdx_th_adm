package com.ciberdix.th.controllers;

import com.ciberdix.th.models.NivelEstudioEntity;
import com.ciberdix.th.repositories.NivelEstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/studyLevel")
@CrossOrigin
public class NivelEstudioController {

    @Autowired
    private NivelEstudioRepository nivelEstudioRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<NivelEstudioEntity> getLists() {
        return (List<NivelEstudioEntity>) nivelEstudioRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    NivelEstudioEntity findList(@PathVariable Integer idLista) {
        return nivelEstudioRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    NivelEstudioEntity createList(@RequestBody NivelEstudioEntity c) {
        return nivelEstudioRepository.save(new NivelEstudioEntity(c.getIdListaNivelEstudio(),c.getCodigoListaNivelEstudio(),c.getNombreListaNivelEstudio(),c.getOrdenListaNivelEstudio(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    NivelEstudioEntity updateList(@RequestBody NivelEstudioEntity centrosCostosEntity) {
        return nivelEstudioRepository.save(centrosCostosEntity);
    }
}
