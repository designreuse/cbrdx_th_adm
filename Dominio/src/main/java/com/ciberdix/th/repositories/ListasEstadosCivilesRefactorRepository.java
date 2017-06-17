package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosCiviles;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasEstadosCivilesRefactorRepository extends CrudRepository<ListasEstadosCiviles, Integer>{
    List<ListasEstadosCiviles> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstadosCiviles findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstadosCiviles> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstadosCiviles> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
