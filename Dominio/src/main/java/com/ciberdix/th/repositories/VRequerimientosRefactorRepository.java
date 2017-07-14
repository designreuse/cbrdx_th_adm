package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VRequerimientos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by Danny on 15/05/2017.
 */
public interface VRequerimientosRefactorRepository extends CrudRepository<VRequerimientos, Integer> {

    List<VRequerimientos> findByIdEstadoOrderByIdRequerimientoDesc(Integer idEstado);

    List<VRequerimientos> findByIdSolicitante(Integer idSolicitante);

    List<VRequerimientos> findByFechaSolicitudBetween(Date fechaInicio, Date fechaFin);

    List<VRequerimientos> findAllByIdEstadoAndIdResponsableSeleccion(Integer idEstado, Integer idResponsableSeleccion);

    List<VRequerimientos> findAllByIdEstadoAndIdTipoSolicitud(Integer idEstado, Integer idTipoSolicitud);

    List<VRequerimientos> findAllByIdResponsableSeleccion(Integer idResponsable);

    VRequerimientos findByIdPublicacion(Integer idPublicacion);

    VRequerimientos findAllByIdCargoAndIdTipoSolicitud(Integer idCargo, Integer idTipoSolicitud);

    @Query("SELECT v FROM VRequerimientos v WHERE (v.fechaInicioPublicacion <= GETDATE() AND v.fechaFinPublicacion >= GETDATE())")
    List<VRequerimientos> queryAllByFechaActual();

    @Query("SELECT v FROM VRequerimientos v WHERE (v.fechaInicioPublicacion <= GETDATE() AND v.fechaFinPublicacion >= GETDATE()) ORDER BY v.idPublicacion DESC")
    List<VRequerimientos> queryAllByFechaActualCantN();

    @Query("SELECT v FROM VRequerimientos v WHERE (v.fechaInicioPublicacion <= GETDATE() AND v.fechaFinPublicacion >= GETDATE()) AND v.idFormaReclutamientoPublicacion IN (SELECT l.idLista FROM ListasFormasReclutamientos l WHERE (l.codigo = 'INT') OR (l.codigo = 'MIX')) AND v.indicadorHabilitadoPublicaciones = 1")
    List<VRequerimientos> queryAllByIdFormaReclutamientoIntMix();

    @Query("SELECT v FROM VRequerimientos v WHERE (v.fechaInicioPublicacion <= GETDATE() AND v.fechaFinPublicacion >= GETDATE()) AND v.idFormaReclutamientoPublicacion IN (SELECT l.idLista FROM ListasFormasReclutamientos l WHERE (l.codigo = 'MIX') OR (l.codigo = 'EXT')) AND v.indicadorHabilitadoPublicaciones = 1")
    List<VRequerimientos> queryAllByIdFormaReclutamientoExtMix();

    @Query("SELECT P FROM VRequerimientos P WHERE (P.fechaInicioPublicacion <= GETDATE() AND P.fechaFinPublicacion >= GETDATE()) AND P.idFormaReclutamientoPublicacion IN (SELECT l.idLista FROM ListasFormasReclutamientos l WHERE (l.codigo = 'MIX') OR (l.codigo = 'EXT')) AND (P.indicadorHabilitadoPublicaciones = 1) AND P.idRequerimiento IN (SELECT R.idRequerimiento FROM Requerimientos R WHERE R.idEstructuraFisica IN (SELECT E.idEstructuraFisica FROM EstructuraFisica E WHERE E.idLocalizacion IN (SELECT L.idLocalizacion FROM Localizaciones L WHERE L.idDivisionPolitica IN (SELECT D.idDivisionPolitica FROM DivisionPolitica D WHERE D.idDivisionPolitica = ?1 OR D.idDivisionPoliticaPadre = ?1))))")
    List<VRequerimientos> queryAllByDivPolitica(Integer idDivisionPolitica);

    @Query("SELECT V FROM VRequerimientos V WHERE V.idPublicacion IN (SELECT T.idPublicacion FROM TercerosPublicaciones T WHERE T.idTercero = ?1)")
    List<VRequerimientos> queryAllByIdTercero(Long idTercero);
}
