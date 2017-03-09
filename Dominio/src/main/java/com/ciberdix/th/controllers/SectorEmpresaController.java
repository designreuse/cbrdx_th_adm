package com.ciberdix.th.controllers;

import com.ciberdix.th.models.SectorEmpresaEntity;
import com.ciberdix.th.repositories.SectorEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/companysector")
public class SectorEmpresaController {

    @Autowired
    private SectorEmpresaRepository sectorEmpresaRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<SectorEmpresaEntity> getLists() {
        return (List<SectorEmpresaEntity>) sectorEmpresaRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    SectorEmpresaEntity findList(@PathVariable Integer idLista) {
        return sectorEmpresaRepository.findOne(idLista);
    }

    @RequestMapping(method = RequestMethod.POST)
    SectorEmpresaEntity createList(@RequestBody SectorEmpresaEntity c) {
        return sectorEmpresaRepository.save(new SectorEmpresaEntity(c.getIdListaSectorEmpresa(),c.getCodigoListaSectorEmpresa(),c.getNombreListaSectorEmpresa(),c.getOrdenListaSectorEmpresa(),c.isIndicadorHabilitado(),c.getAuditoriaUsuario(),c.getAuditoriaFecha()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    SectorEmpresaEntity updateList(@RequestBody SectorEmpresaEntity centrosCostosEntity) {
        return sectorEmpresaRepository.save(centrosCostosEntity);
    }
}
