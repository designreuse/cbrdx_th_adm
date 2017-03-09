package com.ciberdix.th.controllers;

import com.ciberdix.th.models.TipoDocumentoEntity;
import com.ciberdix.th.repositories.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/documenttype")
public class TipoDocumentoController {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<TipoDocumentoEntity> getLists() {
        return (List<TipoDocumentoEntity>) tipoDocumentoRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    TipoDocumentoEntity findList(@PathVariable Integer idLista) {
        return tipoDocumentoRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    TipoDocumentoEntity createList(@RequestBody TipoDocumentoEntity c) {
        return tipoDocumentoRepository.save(new TipoDocumentoEntity(c.getIdListaTipoDocumentos(),c.getCodigoListaTipoDocumentos(),c.getNombreListaTipoDocumentos(),c.getOrdenListaTipoDocumentos(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    TipoDocumentoEntity updateList(@RequestBody TipoDocumentoEntity centrosCostosEntity) {
        return tipoDocumentoRepository.save(centrosCostosEntity);
    }
}
