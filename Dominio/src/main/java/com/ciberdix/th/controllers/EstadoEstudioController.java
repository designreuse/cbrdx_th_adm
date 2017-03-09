package com.ciberdix.th.controllers;

import com.ciberdix.th.models.EstadoEstudioEntity;
import com.ciberdix.th.repositories.EstadoEstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/studystate")
public class EstadoEstudioController {

    @Autowired
    private EstadoEstudioRepository estadoEstudioRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<EstadoEstudioEntity> getLists() {
        return (List<EstadoEstudioEntity>) estadoEstudioRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    EstadoEstudioEntity findList(@PathVariable Integer idLista) {
        return estadoEstudioRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstadoEstudioEntity createList(@RequestBody EstadoEstudioEntity c) {
        return estadoEstudioRepository.save(new EstadoEstudioEntity(c.getIdListaEstadoEstudio(),c.getCodigoListaEstadoEstudio(),c.getNombreListaEstadoEstudio(),c.getOrdenListaEstadoEstudio(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    EstadoEstudioEntity updateList(@RequestBody EstadoEstudioEntity centrosCostosEntity) {
        return estadoEstudioRepository.save(centrosCostosEntity);
    }
}
