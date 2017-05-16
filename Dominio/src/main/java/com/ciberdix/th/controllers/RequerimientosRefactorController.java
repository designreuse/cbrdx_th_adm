package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Requerimientos;
import com.ciberdix.th.models.VRequerimientos;
import com.ciberdix.th.repositories.RequerimientosRefactorRepository;
import com.ciberdix.th.repositories.VRequerimientosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 15/05/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/requerimientos")
public class RequerimientosRefactorController {

    @Autowired
    private RequerimientosRefactorRepository requerimientosRefactorRepository;

    @Autowired
    private VRequerimientosRefactorRepository vRequerimientosRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VRequerimientos> findAll() {
        return (List<VRequerimientos>) vRequerimientosRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idRequerimiento}")
    VRequerimientos findOne(@PathVariable Integer idRequerimiento) {
        return vRequerimientosRefactorRepository.findOne(idRequerimiento);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/estado/{idEstado}")
    List<VRequerimientos> findByIdEstado(@PathVariable Integer idEstado) {
        return vRequerimientosRefactorRepository.findByIdEstadoOrderByIdRequerimientoDesc(idEstado);
    }

    @RequestMapping(method = RequestMethod.POST)
    Requerimientos create(@RequestBody Requerimientos obj) {
        return requerimientosRefactorRepository.save(new Requerimientos(obj.getIdSolicitante(),obj.getJustificacion(),
                obj.getIdCargo(),obj.getIdFormaContratacion(),obj.getIdTipoContratacion(),obj.getCantidadVacantes(),
                obj.getCantidadConvocados(),obj.getIdEstado(),obj.getAuditoriaUsuario(),obj.getIdResponsableSeleccion(),
                obj.getIdFormaReclutamiento(),obj.getIdEstructuraOrganizacional(),obj.getIdZona(),obj.getIdEstructuraFisica(),
                obj.getFechaSolicitud(),obj.getIndicadorAutorizacion(),obj.getIndicadorAumentoPlazas(),obj.getIdJefe(),
                obj.getIdCategoria(),obj.getIdTipoSolicitud(),obj.getFechaInicio(),obj.getFechaFin()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Requerimientos obj) {
        requerimientosRefactorRepository.save(obj);
    }

}
