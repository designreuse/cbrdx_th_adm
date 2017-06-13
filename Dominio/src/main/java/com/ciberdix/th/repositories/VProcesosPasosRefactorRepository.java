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

    List<VProcesosPasos> findAllByCodigo(String codigo);

    @Query("SELECT p FROM VProcesosPasos p WHERE (p.idProceso = ?1) AND p.orden = (SELECT MAX(pr.orden) FROM VProcesosPasos pr WHERE (pr.idProceso = ?1))")
    VProcesosPasos queryLastPaso(Integer idProceso);

}
