package com.ciberdix.th.controllers;

import com.ciberdix.th.models.SubSectorEmpresaEntity;
import com.ciberdix.th.repositories.SubSectorEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/subcompanysector")
public class SubSectorEmpresaController {

    @Autowired
    private SubSectorEmpresaRepository subSectorEmpresaRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<SubSectorEmpresaEntity> getLists() {
        return (List<SubSectorEmpresaEntity>) subSectorEmpresaRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    SubSectorEmpresaEntity findList(@PathVariable Integer idLista) {
        return subSectorEmpresaRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    SubSectorEmpresaEntity createList(@RequestBody SubSectorEmpresaEntity c) {
        return subSectorEmpresaRepository.save(new SubSectorEmpresaEntity(c.getIdListaSubSectorEmpresa(),c.getCodigoListaSubSectorEmpresa(),c.getNombreListaSubSectorEmpresa(),c.getOrdenListaSubSectorEmpresa(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    SubSectorEmpresaEntity updateList(@RequestBody SubSectorEmpresaEntity centrosCostosEntity) {
        return subSectorEmpresaRepository.save(centrosCostosEntity);
    }
}
