package com.ciberdix.th.controllers;

import com.ciberdix.th.models.LocalizacionesNomenclaturas;
import com.ciberdix.th.repositories.LocalizacionesNomenclaturasRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/localizacionesNomenclaturas")
public class LocalizacionesNomenclaturasRefactorController {

    @Autowired
    private LocalizacionesNomenclaturasRefactorRepository localizacionesNomenclaturasRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<LocalizacionesNomenclaturas> findAll() {
        return (List<LocalizacionesNomenclaturas>) localizacionesNomenclaturasRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<LocalizacionesNomenclaturas> findEnabled() {
        return localizacionesNomenclaturasRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/localizacion/{id}")
    List<LocalizacionesNomenclaturas> findByIdLocalizacion(@PathVariable Integer id) {
        return localizacionesNomenclaturasRefactorRepository.findAllByIdLocalizacion(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tipoNomenCompl/{id}")
    List<LocalizacionesNomenclaturas> findByIdTipoNomenCompl(@PathVariable Integer id) {
        return localizacionesNomenclaturasRefactorRepository.findAllByIdTipoNomenclaturaComplementaria(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    LocalizacionesNomenclaturas findOne(@PathVariable Integer id) {
        return localizacionesNomenclaturasRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    LocalizacionesNomenclaturas create(@RequestBody LocalizacionesNomenclaturas o) {
        return localizacionesNomenclaturasRefactorRepository.save(
                new LocalizacionesNomenclaturas(
                        o.getIdTipoNomenclaturaComplementaria(),o.getIdLocalizacion(),
                        o.getDescripcion(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody LocalizacionesNomenclaturas o) {
        localizacionesNomenclaturasRefactorRepository.save(
                new LocalizacionesNomenclaturas(
                        o.getIdLocalizacionNomenclatura(),o.getIdTipoNomenclaturaComplementaria(),o.getIdLocalizacion(),
                        o.getDescripcion(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
