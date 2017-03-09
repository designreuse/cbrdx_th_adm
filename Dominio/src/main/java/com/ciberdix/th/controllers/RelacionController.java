package com.ciberdix.th.controllers;

import com.ciberdix.th.models.RelacionEntity;
import com.ciberdix.th.repositories.RelacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/relationship")
public class RelacionController {

    @Autowired
    private RelacionRepository relacionRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<RelacionEntity> getLists() {
        return (List<RelacionEntity>) relacionRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    RelacionEntity findList(@PathVariable Integer idLista) {
        return relacionRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    RelacionEntity createList(@RequestBody RelacionEntity c) {
        return relacionRepository.save(new RelacionEntity(c.getIdListaParentescos(),c.getCodigoListaParentescos(),c.getNombreListaParentescos(),c.getOrdenListaParentescos(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    RelacionEntity updateList(@RequestBody RelacionEntity centrosCostosEntity) {
        return relacionRepository.save(centrosCostosEntity);
    }
}
