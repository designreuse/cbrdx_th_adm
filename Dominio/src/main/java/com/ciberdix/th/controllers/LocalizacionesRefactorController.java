package com.ciberdix.th.controllers;

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

    @RequestMapping(method = RequestMethod.GET, path = "/localizacionTercero/{idTercero}")
    List<Localizaciones> findByIdTerceroAllLocalizacion(@PathVariable Long idTercero) {
        return localizacionesRefactorRepository.queryByIdTercero(idTercero);
    }

    @RequestMapping(method = RequestMethod.POST)
    Localizaciones create(@RequestBody Localizaciones localizaciones) {
        return localizacionesRefactorRepository.save(new Localizaciones(localizaciones.getIdTipoDireccion(), localizaciones.getDireccion(), localizaciones.getLatitud(), localizaciones.getLongitud(), localizaciones.getComoLlegar(), localizaciones.getIndicadorHabilitado(), localizaciones.getIdDivisionPolitica(), localizaciones.getAuditoriaUsuario(),localizaciones.getIdTipoNomenclatura(),localizaciones.getPrincipal(),localizaciones.getAdicional(),localizaciones.getAdicionalComplementaria()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    Localizaciones update(@RequestBody Localizaciones localizaciones) {
        return localizacionesRefactorRepository.save(
                new Localizaciones(localizaciones.getIdLocalizacion(),localizaciones.getIdTipoDireccion(), localizaciones.getDireccion(), localizaciones.getLatitud(), localizaciones.getLongitud(), localizaciones.getComoLlegar(), localizaciones.getIndicadorHabilitado(), localizaciones.getIdDivisionPolitica(), localizaciones.getAuditoriaUsuario(),localizaciones.getIdTipoNomenclatura(),localizaciones.getPrincipal(),localizaciones.getAdicional(),localizaciones.getAdicionalComplementaria())
        );
    }
}
