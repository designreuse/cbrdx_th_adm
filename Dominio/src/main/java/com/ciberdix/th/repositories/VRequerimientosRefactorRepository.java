package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VRequerimientos;
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

}
