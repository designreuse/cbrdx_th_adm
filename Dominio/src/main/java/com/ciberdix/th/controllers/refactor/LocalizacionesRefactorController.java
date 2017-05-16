package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.Localizaciones;
import com.ciberdix.th.repositories.LocalizacionesRefactorRepository;
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
public class LocalizacionesRefactorController {

    @Autowired
    private LocalizacionesRefactorRepository localizacionesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Localizaciones> findAll() {
        return (List<Localizaciones>) localizacionesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{idLocalizacion}")
    Localizaciones findOne(@PathVariable Integer idLocalizacion) {
        return localizacionesRefactorRepository.findOne(idLocalizacion);
    }

    @RequestMapping(method = RequestMethod.POST)
    Localizaciones create(@RequestBody Localizaciones localizaciones) {
        return localizacionesRefactorRepository.save(new Localizaciones(localizaciones.getIdTipoDireccion(), localizaciones.getDireccion(), localizaciones.getLatitud(), localizaciones.getLongitud(), localizaciones.getComoLlegar(), localizaciones.getIndicadorHabilitado(), localizaciones.getIdDivisionPolitica(), localizaciones.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    Localizaciones update(@RequestBody Localizaciones localizaciones) {
        return localizacionesRefactorRepository.save(localizaciones);
    }
}
