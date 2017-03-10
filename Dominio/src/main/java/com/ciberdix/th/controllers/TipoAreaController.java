package com.ciberdix.th.controllers;

import com.ciberdix.th.models.EstructuraAreasEntity;
import com.ciberdix.th.repositories.TipoAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@CrossOrigin
@RequestMapping("/tipoArea")
public class TipoAreaController {

    @Autowired
    private TipoAreaRepository tipoAreaRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<EstructuraAreasEntity> getLists() {
        return (List<EstructuraAreasEntity>) tipoAreaRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    EstructuraAreasEntity findList(@PathVariable Integer idLista) {
        return tipoAreaRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstructuraAreasEntity createList(@RequestBody EstructuraAreasEntity areasEntity) {
        return tipoAreaRepository.save(new EstructuraAreasEntity(areasEntity.getEstructuraArea(), areasEntity.getCodigoArea(), areasEntity.getIndicadorHabilitado(), areasEntity.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    EstructuraAreasEntity updateList(@RequestBody EstructuraAreasEntity centrosCostosEntity) {
        return tipoAreaRepository.save(centrosCostosEntity);
    }
}
