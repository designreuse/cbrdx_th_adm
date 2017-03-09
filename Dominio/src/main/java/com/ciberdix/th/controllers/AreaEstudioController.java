package com.ciberdix.th.controllers;

import com.ciberdix.th.models.AreaEstudioEntity;
import com.ciberdix.th.repositories.AreaEstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/studyarea")
public class AreaEstudioController {

    @Autowired
    private AreaEstudioRepository areaEstudioRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<AreaEstudioEntity> getLists() {
        return (List<AreaEstudioEntity>) areaEstudioRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    AreaEstudioEntity findList(@PathVariable Integer idLista) {
        return areaEstudioRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    AreaEstudioEntity createList(@RequestBody AreaEstudioEntity c) {
        return areaEstudioRepository.save(new AreaEstudioEntity(c.getIdListaAreaEstudio(),c.getCodigoListaAreaEstudio(),c.getNombreListaAreaEstudio(),c.getOrdenListaAreaEstudio(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    AreaEstudioEntity updateList(@RequestBody AreaEstudioEntity centrosCostosEntity) {
        return areaEstudioRepository.save(centrosCostosEntity);
    }
}
