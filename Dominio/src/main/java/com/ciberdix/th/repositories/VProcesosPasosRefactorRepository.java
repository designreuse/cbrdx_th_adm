package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VProcesosPasos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 5/06/2017.
 */
public interface VProcesosPasosRefactorRepository extends CrudRepository<VProcesosPasos, Integer> {

    List<VProcesosPasos> findAllByIdProceso(Integer idProceso);

    List<VProcesosPasos> findAllByIdProcesoOrderByOrden(Integer idProceso);

    @Query("SELECT V FROM VProcesosPasos V WHERE V.idProceso = ?1 AND V.idTipoConvocatoria IN (SELECT L.idLista FROM ListasFormasReclutamientos L WHERE L.codigo = 'MIX' OR L.codigo = 'EXT') ORDER BY V.orden")
    List<VProcesosPasos> queryAllByIdProcesoExternaMixta(Integer idProceso);

    @Query("SELECT V FROM VProcesosPasos V WHERE V.idProceso = ?1 AND V.idTipoConvocatoria IN (SELECT L.idLista FROM ListasFormasReclutamientos L WHERE L.codigo = 'MIX' OR L.codigo = 'INT') ORDER BY V.orden")
    List<VProcesosPasos> queryAllByIdProcesoInternaMixta(Integer idProceso);

    List<VProcesosPasos> findAllByCodigo(String codigo);

    @Query("SELECT p FROM VProcesosPasos p WHERE (p.idProceso = ?1) AND p.orden = (SELECT MAX(pr.orden) FROM VProcesosPasos pr WHERE (pr.idProceso = ?1))")
    VProcesosPasos queryLastPaso(Integer idProceso);

}
