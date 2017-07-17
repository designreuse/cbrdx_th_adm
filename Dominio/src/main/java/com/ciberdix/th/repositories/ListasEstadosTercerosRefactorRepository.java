package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosTerceros;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
public interface ListasEstadosTercerosRefactorRepository extends CrudRepository<ListasEstadosTerceros, Integer> {
    List<ListasEstadosTerceros> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstadosTerceros findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstadosTerceros> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstadosTerceros> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
