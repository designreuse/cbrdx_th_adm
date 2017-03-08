package com.ciberdix.th.controllers;

import com.ciberdix.th.models.EstructuraAreasEntity;
import com.ciberdix.th.models.ExperienciaEntity;
import com.ciberdix.th.repositories.ExperienciaRepository;
import com.ciberdix.th.repositories.TipoAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/experiences")
public class ExperienciaController {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ExperienciaEntity> getLists() {
        return (List<ExperienciaEntity>) experienciaRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    ExperienciaEntity findList(@PathVariable Integer idLista) {
        return experienciaRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    ExperienciaEntity createList(@RequestBody ExperienciaEntity c) {
        return experienciaRepository.save(new ExperienciaEntity(c.getIdTerceroExperienciaLaboral(),c.getIdTercero(),c.getEmpresa(),c.getTelefonoEmpresa(),c.getIdSectorEmpresa(),c.getIdSubSectorEmpresa(),c.getCargo(),c.getIdNivelCargo(),c.getAreaCargo(),c.getJefeInmediato(),c.getTiempoExperiencia(),c.getIdPais(),c.getIdDepartamento(),c.getIdCiudad(),c.isIndicadorActualmente(),c.getFechaIngresa(),c.getFechaTermina(),c.getIdAdjunto(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ExperienciaEntity updateList(@RequestBody ExperienciaEntity centrosCostosEntity) {
        return experienciaRepository.save(centrosCostosEntity);
    }
}
