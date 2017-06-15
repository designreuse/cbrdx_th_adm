package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosProcesos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 5/06/2017.
 */
public interface ListasEstadosProcesosRefactorRepository extends CrudRepository<ListasEstadosProcesos, Integer> {

    List<ListasEstadosProcesos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstadosProcesos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstadosProcesos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstadosProcesos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);

}
