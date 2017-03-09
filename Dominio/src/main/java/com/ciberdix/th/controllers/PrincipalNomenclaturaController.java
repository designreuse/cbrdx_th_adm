package com.ciberdix.th.controllers;

import com.ciberdix.th.models.PrincipalNomenclaturaEntity;
import com.ciberdix.th.repositories.PrincipalNomenclaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/principalnomenclature")
public class PrincipalNomenclaturaController {

    @Autowired
    private PrincipalNomenclaturaRepository principalNomenclaturaRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<PrincipalNomenclaturaEntity> getLists() {
        return (List<PrincipalNomenclaturaEntity>) principalNomenclaturaRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    PrincipalNomenclaturaEntity findList(@PathVariable Integer idLista) {
        return principalNomenclaturaRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    PrincipalNomenclaturaEntity createList(@RequestBody PrincipalNomenclaturaEntity c) {
        return principalNomenclaturaRepository.save(new PrincipalNomenclaturaEntity(c.getIdListaTipoNomenclatura(),c.getCodigoListaTipoNomenclatura(),c.getNombreListaTipoNomenclatura(),c.getOrdenListaTipoNomenclatura(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    PrincipalNomenclaturaEntity updateList(@RequestBody PrincipalNomenclaturaEntity centrosCostosEntity) {
        return principalNomenclaturaRepository.save(centrosCostosEntity);
    }
}
