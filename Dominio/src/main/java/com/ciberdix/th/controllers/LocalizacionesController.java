package com.ciberdix.th.controllers;

import com.ciberdix.th.models.LocalizacionesEntity;
import com.ciberdix.th.repositories.LocalizacionesRepository;
import java.sql.Timestamp;
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

    @RequestMapping(method = RequestMethod.POST)
    LocalizacionesEntity createList(@RequestBody LocalizacionesEntity c) {
        return localizacionesRepository.save(new LocalizacionesEntity(c.getTipoDireccion().getValue(),c.getDireccion(),c.getLatitud(),c.getLongitud(),c.getComoLlegar(),c.getIndicadorHabilitado(),c.getIdDivisionPolitica(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    LocalizacionesEntity updateList(@RequestBody LocalizacionesEntity l) {
        LocalizacionesEntity loc = l;
        loc.setIdTipoDireccion(l.getTipoDireccion().getValue());
        return localizacionesRepository.save(loc);
    }
}
