package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ComplementariaNomenclaturaEntity;
import com.ciberdix.th.repositories.ComplementariaNomenclaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/complementaryNomenclature")
@CrossOrigin
public class ComplementariaNomenclaturaController {

    @Autowired
    private ComplementariaNomenclaturaRepository complementariaNomenclaturaRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ComplementariaNomenclaturaEntity> getLists() {
        return (List<ComplementariaNomenclaturaEntity>) complementariaNomenclaturaRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    ComplementariaNomenclaturaEntity findList(@PathVariable Integer idLista) {
        return complementariaNomenclaturaRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    ComplementariaNomenclaturaEntity createList(@RequestBody ComplementariaNomenclaturaEntity c) {
        return complementariaNomenclaturaRepository.save(new ComplementariaNomenclaturaEntity(c.getIdListaTipoNomenclaturaComplementaria(),c.getCodigoListaTipoNomenclaturaComplementaria(),c.getNombreListaTipoNomenclaturaComplementaria(),c.getOrdenListaTipoNomenclaturaComplementaria(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ComplementariaNomenclaturaEntity updateList(@RequestBody ComplementariaNomenclaturaEntity centrosCostosEntity) {
        return complementariaNomenclaturaRepository.save(centrosCostosEntity);
    }
}
