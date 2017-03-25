package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Localizaciones;
import com.ciberdix.th.repositories.refactor.LocalizacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */

@RestController
@Transactional
@RequestMapping("/api/localizaciones")
@CrossOrigin
public class LocalizacionesController {

    @Autowired
    private LocalizacionesRepository localizacionesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Localizaciones> findAll() {
        return (List<Localizaciones>) localizacionesRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLocalizacion}")
    Localizaciones findOne(@PathVariable Integer idLocalizacion) {
        return localizacionesRepository.findOne(idLocalizacion);
    }

    @RequestMapping(method = RequestMethod.POST)
    Localizaciones create(@RequestBody Localizaciones localizaciones) {
        return localizacionesRepository.save(new Localizaciones(localizaciones.getIdTipoDireccion(), localizaciones.getDireccion(), localizaciones.getLatitud(), localizaciones.getLongitud(), localizaciones.getComoLlegar(), localizaciones.getIndicadorHabilitado(), localizaciones.getIdDivisionPolitica(), localizaciones.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    Localizaciones update(@RequestBody Localizaciones localizaciones) {
        return localizacionesRepository.save(localizaciones);
    }
}
