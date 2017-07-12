package com.ciberdix.th.controllers;

import com.ciberdix.th.models.Requerimientos;
import com.ciberdix.th.models.VRequerimientos;
import com.ciberdix.th.repositories.RequerimientosRefactorRepository;
import com.ciberdix.th.repositories.VRequerimientosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    @RequestMapping(method = RequestMethod.GET, path = "/byUser/{idUsuario}")
    List<VRequerimientos> findByIdSolicitante(@PathVariable Integer idUsuario) {
        return vRequerimientosRefactorRepository.findByIdSolicitante(idUsuario);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/fecha/{fechaInicio}/{fechaFin}")
    List<VRequerimientos> findByFecha(@PathVariable String fechaInicio, @PathVariable String fechaFin) throws ParseException {
        SimpleDateFormat fInicio = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat fFin = new SimpleDateFormat("yyyy-MM-dd");
        return vRequerimientosRefactorRepository.findByFechaSolicitudBetween(fInicio.parse(fechaInicio), fFin.parse(fechaFin));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/filtroReq/{idEstado}/{idResponsableSeleccion}")
    List<VRequerimientos> findIdEstadoAndIdRespSelec(@PathVariable Integer idEstado, @PathVariable Integer idResponsableSeleccion) {
        return vRequerimientosRefactorRepository.findAllByIdEstadoAndIdResponsableSeleccion(idEstado, idResponsableSeleccion);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/filtroReq2/{idEstado}/{idTipoSolicitud}")
    List<VRequerimientos> findIdEstadoAndIdTipoSoli(@PathVariable Integer idEstado, @PathVariable Integer idTipoSolicitud) {
        return vRequerimientosRefactorRepository.findAllByIdEstadoAndIdTipoSolicitud(idEstado, idTipoSolicitud);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacion/{idPublicacion}")
    VRequerimientos findByIdPublicacion(@PathVariable Integer idPublicacion) {
        return vRequerimientosRefactorRepository.findByIdPublicacion(idPublicacion);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/byResponsable/{idResponsableSeleccion}")
    List<VRequerimientos> findAllByIdResponsableSeleccion(@PathVariable Integer idResponsableSeleccion) {
        return vRequerimientosRefactorRepository.findAllByIdResponsableSeleccion(idResponsableSeleccion);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/byTercero/{idTercero}")
    List<VRequerimientos> findAllByIdTercero(@PathVariable Long idTercero) {
        return vRequerimientosRefactorRepository.queryAllByIdTercero(idTercero);
    }


    @RequestMapping(method = RequestMethod.GET, path = "/publicacionFechas/todasActivas")
    List<VRequerimientos> queryAllByFechaActual() {
        return vRequerimientosRefactorRepository.queryAllByFechaActual();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/publicacionFechas/cantidadN/{cantidad}")
    ArrayList<VRequerimientos> queryAllByFechaActualCantN(@PathVariable Integer cantidad) {

        ArrayList<VRequerimientos> vR = new ArrayList<>();
        ArrayList<VRequerimientos> vRe = (ArrayList<VRequerimientos>) vRequerimientosRefactorRepository.queryAllByFechaActualCantN();

        Integer count = 0;

        if(cantidad < vRe.size())
        {
            count = cantidad;
        }else{
            count = vRe.size();
        }

        for(int i=0; i<count; i++){
            vR.add(vRe.get(i));
        }

        return vR;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/byIdCargo/{idCargo}/{idTipoSolicitud}")
    VRequerimientos findByIdCargo(@PathVariable Integer idCargo, @PathVariable Integer idTipoSolicitud) {
        return vRequerimientosRefactorRepository.findAllByIdCargoAndIdTipoSolicitud(idCargo, idTipoSolicitud);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/internaMixta")
    List<VRequerimientos> findIntMix() {
        return vRequerimientosRefactorRepository.queryAllByIdFormaReclutamientoIntMix();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/externaMixta")
    List<VRequerimientos> findExtMix() {
        return vRequerimientosRefactorRepository.queryAllByIdFormaReclutamientoExtMix();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/divisionPolitica/{idDivisionPolitica}")
    List<VRequerimientos> findByDivisionPolitica(@PathVariable Integer idDivisionPolitica) {
        return vRequerimientosRefactorRepository.queryAllByDivPolitica(idDivisionPolitica);
    }

    @RequestMapping(method = RequestMethod.POST)
    Requerimientos create(@RequestBody Requerimientos o) {
        return requerimientosRefactorRepository.save(new Requerimientos(o.getIdSolicitante(),o.getJustificacion(),
                o.getIdCargo(),o.getIdFormaContratacion(),o.getIdTipoContratacion(),o.getCantidadVacantes(),
                o.getCantidadConvocados(),o.getIdEstado(),o.getAuditoriaUsuario(),o.getIdResponsableSeleccion(),
                o.getIdFormaReclutamiento(),o.getIdEstructuraOrganizacional(),o.getIdZona(),o.getIdEstructuraFisica(),
                o.getFechaSolicitud(),o.getIndicadorAutorizacion(),o.getIndicadorAumentoPlazas(),o.getIdJefe(),
                o.getIdCategoria(),o.getIdTipoSolicitud(),o.getFechaInicio(),o.getFechaFin(),o.getNombreCargo(),
                o.getFuncionCargo()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Requerimientos o) {
        requerimientosRefactorRepository.save(
                new Requerimientos(o.getIdRequerimiento(),o.getIdSolicitante(),o.getJustificacion(),
                        o.getIdCargo(),o.getIdFormaContratacion(),o.getIdTipoContratacion(),o.getCantidadVacantes(),
                        o.getCantidadConvocados(),o.getIdEstado(),o.getAuditoriaUsuario(),o.getIdResponsableSeleccion(),
                        o.getIdFormaReclutamiento(),o.getIdEstructuraOrganizacional(),o.getIdZona(),o.getIdEstructuraFisica(),
                        o.getFechaSolicitud(),o.getIndicadorAutorizacion(),o.getIndicadorAumentoPlazas(),o.getIdJefe(),
                        o.getIdCategoria(),o.getIdTipoSolicitud(),o.getFechaInicio(),o.getFechaFin(),o.getNombreCargo(),
                        o.getFuncionCargo())
        );
    }

}
