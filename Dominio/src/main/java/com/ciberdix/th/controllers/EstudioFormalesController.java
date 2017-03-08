package com.ciberdix.th.controllers;

import com.ciberdix.th.models.EstructuraAreasEntity;
import com.ciberdix.th.models.EstudiosFormalesEntity;
import com.ciberdix.th.repositories.EstudiosFormalesRepository;
import com.ciberdix.th.repositories.TipoAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/fstudies")
public class EstudioFormalesController {

    @Autowired
    private EstudiosFormalesRepository estudioFormalesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<EstudiosFormalesEntity> getLists() {
        return (List<EstudiosFormalesEntity>) estudioFormalesRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    EstudiosFormalesEntity findList(@PathVariable Integer idLista) {
        return estudioFormalesRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstudiosFormalesEntity createList(@RequestBody EstudiosFormalesEntity c) {
        return estudioFormalesRepository.save(new EstudiosFormalesEntity(c.getIdTercerosEstudioFormal(),c.getIdTercero(),c.getIdNivelEstudio(),c.getIdAreaEstudio(),c.getTituloEstudio(),c.getIdInstitucion(),c.getOtraInstitucion(),c.getIdPais(),c.getIdDepartamento(),c.getIdCiudad(),c.getIdEstado(),c.getFechaIngresa(),c.getFechaTermina(),c.getIdAdjunto(),c.getIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha(),c.isIndicadorVerificado(),c.getFechaVerificado()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    EstudiosFormalesEntity updateList(@RequestBody EstudiosFormalesEntity centrosCostosEntity) {
        return estudioFormalesRepository.save(centrosCostosEntity);
    }
}
