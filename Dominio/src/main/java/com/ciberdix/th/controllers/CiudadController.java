package com.ciberdix.th.controllers;

        import com.ciberdix.th.models.DivPoliticaEntity;
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
    List<DivPoliticaEntity> getLists() {
        return (List<DivPoliticaEntity>) ciudadRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    DivPoliticaEntity findList(@PathVariable Integer idLista) {
        return ciudadRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    DivPoliticaEntity createList(@RequestBody DivPoliticaEntity c) {
        return ciudadRepository.save(new DivPoliticaEntity(c.getIdDivisionPolitica(),c.getIdDivisionPoliticaPadre(), c.getCodigoDivisionPolitica(),c.getDescripcionDivisionPolitica(),c.getIndicativoDivisionPolitica(),c.getCodigoPostalDivisionPolitica(),c.getIdDivisionPoliticaTipo(),c.getIdDivisionPoliticaArea(),c.getIdDivisionPoliticaResguardo(),c.getIdEstratooDivisionPolitica(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    DivPoliticaEntity updateList(@RequestBody DivPoliticaEntity centrosCostosEntity) {
        return ciudadRepository.save(centrosCostosEntity);
    }
}
