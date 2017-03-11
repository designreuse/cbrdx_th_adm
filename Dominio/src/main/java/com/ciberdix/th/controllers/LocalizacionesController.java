package com.ciberdix.th.controllers;

import com.ciberdix.th.models.LocalizacionesEntity;
import com.ciberdix.th.repositories.LocalizacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Transactional
@RequestMapping("/locations")
public class LocalizacionesController {

    @Autowired
    private LocalizacionesRepository localizacionesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<LocalizacionesEntity> getLists() {
        return (List<LocalizacionesEntity>) localizacionesRepository.findAll();
    }

    /*@RequestMapping(method = RequestMethod.POST)
    LocalizacionesEntity createList(@RequestBody LocalizacionesEntity c) {
        return localizacionesRepository.save(new LocalizacionesEntity(c.getIdLocalizacion(),c.getDireccion(),c.getLatitud(),c.getLongitud(),c.getComoLlegar(),c.getIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha(),c.getIdDivisionPolitica()));
    }*/

    @RequestMapping(method = RequestMethod.PUT)
    LocalizacionesEntity updateList(@RequestBody LocalizacionesEntity centrosCostosEntity) {
        return localizacionesRepository.save(centrosCostosEntity);
    }
}
