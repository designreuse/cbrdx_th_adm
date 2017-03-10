package com.ciberdix.th.controllers;

        import com.ciberdix.th.models.DivisionPoliticaEntity;
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
    List<DivisionPoliticaEntity> getLists() {
        return (List<DivisionPoliticaEntity>) ciudadRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    DivisionPoliticaEntity findList(@PathVariable Integer idLista) {
        return ciudadRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    DivisionPoliticaEntity createList(@RequestBody DivisionPoliticaEntity c) {
        return ciudadRepository.save(new DivisionPoliticaEntity(c.getIdDivisionPolitica(),c.getIdDivisionPoliticaPadre(), c.getCodigoDivisionPolitica(),c.getDescripcionDivisionPolitica(),c.getIndicativoDivisionPolitica(),c.getCodigoPostalDivisionPolitica(),c.getIdDivisionPoliticaTipo(),c.getIdDivisionPoliticaArea(),c.getIdDivisionPoliticaResguardo(),c.getIdEstratooDivisionPolitica(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    DivisionPoliticaEntity updateList(@RequestBody DivisionPoliticaEntity centrosCostosEntity) {
        return ciudadRepository.save(centrosCostosEntity);
    }
}
