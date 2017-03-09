package com.ciberdix.th.controllers;

        import com.ciberdix.th.models.CiudadEntity;
import com.ciberdix.th.repositories.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/cities")
@CrossOrigin
public class CiudadController {

    @Autowired
    private CiudadRepository ciudadRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<CiudadEntity> getLists() {
        return (List<CiudadEntity>) ciudadRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    CiudadEntity findList(@PathVariable Integer idLista) {
        return ciudadRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    CiudadEntity createList(@RequestBody CiudadEntity c) {
        return ciudadRepository.save(new CiudadEntity(c.getIdDivisionPolitica(),c.getIdDivisionPoliticaPadre(), c.getCodigoDivisionPolitica(),c.getDescripcionDivisionPolitica(),c.getIndicativoDivisionPolitica(),c.getCodigoPostalDivisionPolitica(),c.getIdDivisionPoliticaTipo(),c.getIdDivisionPoliticaArea(),c.getIdDivisionPoliticaResguardo(),c.getIdEstratooDivisionPolitica(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    CiudadEntity updateList(@RequestBody CiudadEntity centrosCostosEntity) {
        return ciudadRepository.save(centrosCostosEntity);
    }
}
