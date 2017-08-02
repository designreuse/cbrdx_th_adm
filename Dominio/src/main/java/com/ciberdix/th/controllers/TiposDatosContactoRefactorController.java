package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TiposDatosContacto;
import com.ciberdix.th.repositories.TiposDatosContactoRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/TiposDatosContacto")
public class TiposDatosContactoRefactorController {

    @Autowired
    private TiposDatosContactoRefactorRepository tiposDatosContactoRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TiposDatosContacto> findAll() {
        return (List<TiposDatosContacto>) tiposDatosContactoRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<TiposDatosContacto> findEnabled() {
        return  tiposDatosContactoRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    TiposDatosContacto findOne(@PathVariable Integer id) {
        return tiposDatosContactoRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TiposDatosContacto create(@RequestBody TiposDatosContacto o) {
        return tiposDatosContactoRefactorRepository.save(
                new TiposDatosContacto(
                        o.getCodigo(),o.getTipoDatoContacto(),o.getIndicadorRequiereConfirmacion(),
                        o.getIndicadorObligatorio(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TiposDatosContacto o) {
        tiposDatosContactoRefactorRepository.save(
                new TiposDatosContacto(
                        o.getIdTipoDatoContacto(),o.getCodigo(),o.getTipoDatoContacto(),o.getIndicadorRequiereConfirmacion(),
                        o.getIndicadorObligatorio(),o.getIndicadorHabilitado(),o.getAuditoriaUsuario()
                )
        );
    }
    
}
