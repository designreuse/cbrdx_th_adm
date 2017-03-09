package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TipoReferenciaEntity;
import com.ciberdix.th.repositories.TipoReferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/references")
@CrossOrigin
public class TipoReferenciaController {

    @Autowired
    private TipoReferenciaRepository tipoReferenciaRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TipoReferenciaEntity> getLists() {
        return (List<TipoReferenciaEntity>) tipoReferenciaRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    TipoReferenciaEntity findList(@PathVariable Integer idLista) {
        return tipoReferenciaRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    TipoReferenciaEntity createList(@RequestBody TipoReferenciaEntity c) {
        return tipoReferenciaRepository.save(new TipoReferenciaEntity(c.getIdListaTipoReferencias(),c.getCodigoListaTipoReferencias(),c.getNombreListaTipoReferencias(),c.getOrdenListaTipoReferencias(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TipoReferenciaEntity updateList(@RequestBody TipoReferenciaEntity centrosCostosEntity) {
        return tipoReferenciaRepository.save(centrosCostosEntity);
    }
}
