package com.ciberdix.th.controllers;

import com.ciberdix.th.models.InstitutoEntity;
import com.ciberdix.th.repositories.InstitutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/institutes")
public class InstitutoController {

    @Autowired
    private InstitutoRepository institutoRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<InstitutoEntity> getLists() {
        return (List<InstitutoEntity>) institutoRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    InstitutoEntity findList(@PathVariable Integer idLista) {
        return institutoRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    InstitutoEntity createList(@RequestBody InstitutoEntity c) {
        return institutoRepository.save(new InstitutoEntity(c.getIdListaInstitucion(),c.getCodigoListaInstitucion(),c.getNombreListaInstitucion(),c.getOrdenListaInstitucion(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    InstitutoEntity updateList(@RequestBody InstitutoEntity centrosCostosEntity) {
        return institutoRepository.save(centrosCostosEntity);
    }
}
