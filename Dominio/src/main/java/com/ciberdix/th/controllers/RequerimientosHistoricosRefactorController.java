package com.ciberdix.th.controllers;

import com.ciberdix.th.models.RequerimientosHistoricos;
import com.ciberdix.th.repositories.RequerimientosHistoricosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 17/05/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/requerimientosHistoricos")
public class RequerimientosHistoricosRefactorController {

    @Autowired
    private RequerimientosHistoricosRefactorRepository requerimientosHistoricosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<RequerimientosHistoricos> findAll() {
        return (List<RequerimientosHistoricos>) requerimientosHistoricosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idRequerimientoHistorico}")
    RequerimientosHistoricos findOne(@PathVariable Integer idRequerimientoHistorico) {
        return requerimientosHistoricosRefactorRepository.findOne(idRequerimientoHistorico);
    }

    @RequestMapping(method = RequestMethod.POST)
    RequerimientosHistoricos create(@RequestBody RequerimientosHistoricos o) {
        return requerimientosHistoricosRefactorRepository.save(new RequerimientosHistoricos(o.getIdRequerimiento(),o.getIdSolicitante(),
                o.getJustificacion(),o.getIdCargo(),o.getIdFormaContratacion(),o.getIdTipoContratacion(),o.getCantidadVacantes(),
                o.getCantidadConvocados(),o.getIdEstado(),o.getAuditoriaUsuario(),o.getIdResponsableSeleccion(),o.getIdFormaReclutamiento(),
                o.getIdEstructuraOrganizacional(),o.getIdZona(),o.getIdEstructuraFisica(),o.getFechaSolicitud(),o.getIndicadorAutorizacion(),
                o.getIndicadorAumentoPlazas(),o.getIdJefe(),o.getIdCategoria(),o.getIdTipoSolicitud(),o.getFechaInicio(),o.getFechaFin()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody RequerimientosHistoricos obj) {
        requerimientosHistoricosRefactorRepository.save(obj);
    }

}
