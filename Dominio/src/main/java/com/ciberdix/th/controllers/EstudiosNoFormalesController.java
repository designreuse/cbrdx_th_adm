package com.ciberdix.th.controllers;

import com.ciberdix.th.models.EstructuraAreasEntity;
import com.ciberdix.th.models.EstudiosNoFormalesEntity;
import com.ciberdix.th.repositories.EstudiosNoFormalesRepository;
import com.ciberdix.th.repositories.TipoAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/nfstudies")
public class EstudiosNoFormalesController {

    @Autowired
    private EstudiosNoFormalesRepository estudiosNoFormalesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<EstudiosNoFormalesEntity> getLists() {
        return (List<EstudiosNoFormalesEntity>) estudiosNoFormalesRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    EstudiosNoFormalesEntity findList(@PathVariable Integer idLista) {
        return estudiosNoFormalesRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstudiosNoFormalesEntity createList(@RequestBody EstudiosNoFormalesEntity c) {
        return estudiosNoFormalesRepository.save(new EstudiosNoFormalesEntity(c.getIdTercerosEstudioNoFormal(),c.getIdTercero(),c.getIdTipoEstudio(),c.getIdAreaEstudio(),c.getTituloEstudio(),c.getInstitucion(),c.getIdIntensidadHoraria(),c.getDescripcion(),c.getIdPais(),c.getIdDepartamento(),c.getIdCiudad(),c.isIndicadorTerminacion(),c.getFechaIngresa(),c.getFechaTermina(),c.getIdAdjunto(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha(),c.isIndicadorVerificado(),c.getFechaVerificado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    EstudiosNoFormalesEntity updateList(@RequestBody EstudiosNoFormalesEntity centrosCostosEntity) {
        return estudiosNoFormalesRepository.save(centrosCostosEntity);
    }
}
